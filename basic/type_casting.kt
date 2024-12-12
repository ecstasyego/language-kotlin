val object01: Any = "Hello"
val stringObject01 = object01 as String // Type casting
val stringObject02 = object01.toString()
val stringObject03: String = object01.toString()
stringObject01 == "Hello"
stringObject02 == "Hello"
stringObject03 == "Hello"

val object02: Any = "Not an Integer"
val intObject01 = object02 as? Int // Type casting with null-safety
val intObject02: Int? = object02 as? Int
intObject01 == null
intObject02 == null
