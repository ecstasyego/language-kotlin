// Initialization
val str01:String = "Hello, World!" // initialization
val str02:String by lazy {"Hello, World!"} // not yet initalization

str01
str02 // initialization


// Null Safety
val str03:String? = "Hello, World!" // nullable, null safety
val str04:String = str03 !! // assertion: not-null 

