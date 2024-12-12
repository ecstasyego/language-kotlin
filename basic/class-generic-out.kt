class Structure<out T>(val value: T){
    init {println(value)}    
}

Structure(1)
Structure(3.14)
Structure('A')
Structure("Hello, World")
