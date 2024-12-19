// Declaration
var variable = "Alphabet"
val value = "Alphabet"
println(variable)
println(value)

variable = "alphabet"
println(variable)


// Initialization
lateinit var late_variable:String // ?(nullsafety): not working  
val late_value:String by lazy {"World"}  
late_variable = "Hello" // Initialization working for non-primative types such as String not Char, Int, Double
late_value // Initialization
