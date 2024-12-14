class Structure(vararg val params: String) {
    init {
        for (value in params) {
            println(value)
        }
    }
}

Structure("Hello", "World", "Kotlin")
