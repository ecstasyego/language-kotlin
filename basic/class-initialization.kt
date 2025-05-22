// eager initialized value
class Structure00(val property00:Int, val property01:Int){
}

// eager initialized variable
class Structure01(var property00:Int, var property01:Int){
}

// eager initialized value
class Structure02{
    val property00:Int = 0
    val property01:Int = 0
}

// eager initialized variable
class Structure03{
    var property00:Int = 0
    var property01:Int = 0
}


// eager initialized value
class Structure04{
    val property00:Int
    val property01:Int

    init{
        property00 = 0
        property01 = 0
    }    
}

// lazy initialized value
class Structure05{
    val property00:Int by lazy {0}
    val property01:Int by lazy {0}

    init{
        property00
        property01
    }    
}

// eager initialized variable
class Structure06{
    var property00:Int
    var property01:Int

    init{
        property00 = 0
        property01 = 0
    }    
}

// lazy initialized variable
class Structure07{
    lateinit var property00:String
    lateinit var property01:String

    init{
        property00 = "Hello"
        property01 = "World"
    }    
}


// local variable
class Structure08{
    val property00 = 0
    var property01 = 0
    
    init{
        val localValue = 0
        var localVariable = 0
    }    
}

val obj00 = Structure00(1, 1)
obj00.property00
obj00.property01

val obj01 = Structure01(1, 1)
obj01.property00
obj01.property01

val obj02 = Structure02()
obj02.property00
obj02.property01

val obj03 = Structure03()
obj03.property00
obj03.property01

val obj04 = Structure04()
obj04.property00
obj04.property01

val obj05 = Structure05()
obj05.property00
obj05.property01

val obj06 = Structure06()
obj06.property00
obj06.property01

val obj07 = Structure07()
obj07.property00
obj07.property01

val obj08 = Structure08()
obj08.property00
obj08.property01

