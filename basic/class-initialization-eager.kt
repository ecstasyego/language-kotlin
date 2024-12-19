class Structure01(val contextValue01:String, val contextValue02:String, param01:String, param02:String){
    init {
        println(param01)
        println(param02)
    }

    init {
        println("Good")
        println("Bye")
    }
}
val obj01 = Structure01("Hello", "World", "param01", "param02")
obj01.contextValue01
obj01.contextValue02


class Structure02(val contextValue01:String, val contextValue02:String, param01:String, param02:String, param03:String){
    init {
        println(param01)
        println(param02)
        println(param03)
    }

    init {
        println("Good")
        println("Bye")
    }
}
val obj02 = Structure01("Hello", "World")
obj02.contextValue01
obj02.contextValue02



class Structure03{
    val contextValue:Int = 0 

    init{
        val localValue:Int = 1
    }
    
    fun method():Int{
        val localValue:Int = 2
        return localValue
    }
}
val obj03 = Structure03()
obj03.method()
obj03.contextValue

