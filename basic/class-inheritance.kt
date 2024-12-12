open class Parent(val name: String, val age: Int = 20) {
    open fun method01() {
        println("PARENT: $name, $age")
    }
}

class Child01(name: String) : Parent(name) {
    override fun method01() {
        println("CHILD01: $name, $age")
    }
}

class Child02(name: String, age: Int) : Parent(name, age) {
    override fun method01() {
        println("CHILD02: $name, $age")
    }
}

class Child03(name: String, age: Int, val home: Boolean) : Parent(name, age) {
    override fun method01() {
        println("CHILD03: $name, $age, $home")
    }
}

val child01 = Child01("Buddy") // age = 20
val child02 = Child02("Buddy", 30)
val child03 = Child03("Buddy", 30, true)
child01.method01()  
child02.method01()
child03.method01()
