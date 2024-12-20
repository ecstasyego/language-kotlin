
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

class Structure04(param00:String, param01:String){
    lateinit var primary00:String 
    lateinit var primary01:String
    
    init{
        primary00 = param00
        primary01 = param01
    }
}

class Structure05(param00:String, param01:String){
    lateinit var primary00:String 
    lateinit var primary01:String
    
    init{
        this.primary00 = param00
        this.primary01 = param01
    }
}


class Structure06(val primary00:Int, val primary01:Double, param00:String, param01:Char){
}

class Structure07(param00:String, param01:Char){
    val primary00:Int = 10
    val primary01:Double = 0.0
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


val obj04 = Structure04("A", "B")
obj04.primary00
obj04.primary01

val obj05 = Structure05("A", "B")
obj05.primary00
obj05.primary01

val obj06 = Structure06(1,2.0, "Hello, World!", 'A')
obj06.primary00
obj06.primary01

val obj07 = Structure07("Hello, World!", 'A')
obj07.primary00
obj07.primary01



