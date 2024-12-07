interface Interface {
    val name:String?
}

class Structure: Interface {
    override val name:String? = null
}

val obj = Structure()
obj.name
