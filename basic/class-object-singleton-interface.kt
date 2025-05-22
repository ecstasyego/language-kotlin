interface Structure {
    fun method()
}


object Singleton00: Structure {
    override fun method() { 
        println("Overridden method00")
    }
}
Singleton00.method() 

val Singleton01 = object : Structure {
    override fun method() { 
        println("Overridden method00")
    }
}

Singleton01.method() 
