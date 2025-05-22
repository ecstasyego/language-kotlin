class Structure constructor(val primary00:Int = 10, val primary01:Double = 0.0)

class Structure00{
    val primary00:Int = 10
    val primary01:Double = 0.0
}

class Structure01(val primary00:Int = 10, val primary01:Double = 0.0)

class Structure02(val primary00:Int, val primary01:Double)

class Structure03(param00:Int, param01:Double){
    val primary00:Int by lazy {param00}
    val primary01:Double by lazy {param01}
}

class Structure03_01(param00:Int, param01:Double){
    val primary00:Int by lazy {param00}
    val primary01:Double by lazy {param01}
    init{}
}

class Structure03_02(param00:Int, param01:Double){
    val primary00:Int by lazy {param00}
    val primary01:Double by lazy {param01}
    init{
        primary00
        primary01
    }
}

// Not allowed primative data type
class Structure04(param00:String, param01:String){
    lateinit var primary00:String 
    lateinit var primary01:String
    
    init{
        primary00 = param00
        primary01 = param01
    }
}

// Not allowed primative data type
class Structure05(param00:String, param01:String){
    lateinit var primary00:String 
    lateinit var primary01:String
    
    init{
        this.primary00 = param00
        this.primary01 = param01
    }
}

class Structure06(param00:Int=10, param01:Double=0.0){
    val primary00:Int = param00
    val primary01:Double = param01
}

class Structure07(param00:Int=10, param01:Double=0.0){
    var primary00:Int = param00
    var primary01:Double = param01
}

// priority:   param02 & param03   >   primary00 & primary01
class Structure08(var primary00:Int ,var primary01:Double, param02:Int, param03:Double){
    init{
        primary00 = param02 // reassign
        primary01 = param03 // reassign
    }
}

// priority:   primary00 & primary01   >   param02 & param03
class Structure09(val primary00:Int, val primary01:Double, param02:Int, param03:Double){
}


class Structure10(param00:Int, param01:Double){
    val primary00:Int = param00
    val primary01:Double = param01
    val primary02:String = "Hello, World!"
}


val obj00 = Structure00()
obj00.primary00
obj00.primary01

val obj01 = Structure01()
obj01.primary00
obj01.primary01

val obj02 = Structure02(1, -1.0)
obj02.primary00
obj02.primary01

val obj03 = Structure03(1, -1.0)
obj03.primary00
obj03.primary01

val obj03_01 = Structure03_01(1, -1.0)
obj03_01.primary00
obj03_01.primary01

val obj03_02 = Structure03_01(1, -1.0)
obj03_02.primary00
obj03_02.primary01

val obj04 = Structure04("A", "B")
obj04.primary00
obj04.primary01

val obj05 = Structure05("A", "B")
obj05.primary00
obj05.primary01

val obj06 = Structure06()
obj06.primary00
obj06.primary01

val obj07 = Structure07()
obj07.primary00
obj07.primary01

val obj08 = Structure08(9999, 9999.0, 1, 0.0) // dummy values: 9999, 9999.0
obj08.primary00
obj08.primary01


val obj09 = Structure09(1, 0.0, 9999, 9999.0) // dummy values: 9999, 9999.0
obj09.primary00
obj09.primary01

val obj10 = Structure10(1, 0.0)
obj10.primary00
obj10.primary01
obj10.primary02
