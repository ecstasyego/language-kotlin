// Declaration
var variable = "Alphabet"
val value = "Alphabet"
println(variable)
println(value)

variable = "alphabet"
println(variable)


// Initialization
lateinit var late_variable:String // ?(nullsafety): not working
val late_value by lazy {"World"}  
late_variable = "Hello" // Initialization
late_value // Initialization
