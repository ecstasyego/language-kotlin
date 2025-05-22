abstract class Abstract {
    abstract val name:String?
    abstract fun method01()
    abstract fun method02(a:Int, b:Double)
    open fun method03(){println("METHOD03")}
    fun method04(){println("METHOD04")}
}

class Structure: Abstract() {
    override val name:String? = "Name"
    override fun method01(){println(name)}
    override fun method02(a:Int, b:Double){println(a + b.toInt())}
    override fun method03(){println("OVERRIDE METHOD03")}
}

val obj = Structure()
println(obj.name)
obj.method01()
obj.method02(1, 3.0)
obj.method03()
obj.method04()
