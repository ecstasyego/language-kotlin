// DSL: Domain-Specific Language
class Structure(val property00: String, val actionBlock: () -> Unit) {
    fun invoke() {
        println("Executing action for $property00")
        actionBlock()
    }
}


Structure("Hello", { println("Action is being performed!") }).invoke()
Structure("World") { println("Action is being performed!") }.invoke()
