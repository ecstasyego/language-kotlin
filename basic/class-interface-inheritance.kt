interface A {
    fun method(){println("PARENT A")}
}

interface B {
    fun method(){println("PARENT B")}
}

interface C {
    fun method(){println("PARENT C")}
}

class Structure: A, B, C {
    override fun method(){
        super<A>.method()
        super<B>.method()
        super<C>.method()        
    }
}

val obj = Structure()
obj.method()
