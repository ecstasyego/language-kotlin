abstract class Abstract {
    abstract val name:String?
    abstract fun method01()
    abstract fun method02(a:Int, b:Double)
}

class Structure: Abstract() {
    override val name:String? = "Name"
    override fun method01(){println(name)}
    override fun method02(a:Int, b:Double){println(a + b.toInt())}
}

val obj = Structure()
println(obj.name)
obj.method01()
obj.method02(1, 3.0)
