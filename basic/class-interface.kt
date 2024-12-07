interface Interface {
    val name:String? // must be implemented
    fun method01() // must be implemented
    fun method02(){println("PARENT")} // must not be implemented
    fun method03(){println("PARENT")} // must not be implemented
    open fun method04(){println("PARENT")} // must not be implemented
}

class Structure: Interface {
    override val name:String? = null
    override fun method01(){println("CHILD")}
    override fun method03(){println("CHILD")}   
    override fun method04(){println("CHILD")}   
}

val obj = Structure()
obj.name
obj.method01()
obj.method02()
obj.method03()
obj.method04()
