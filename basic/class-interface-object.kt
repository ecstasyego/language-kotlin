interface A {
    fun method()
}

object : A {
    override fun method() {
        println("Hello, World!")
    }
}.method()
