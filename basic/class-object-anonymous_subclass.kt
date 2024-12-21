open class Structure {
    open fun omethod(){}
}


object A : Structure() {
    override fun omethod() { 
        println("Overridden method")
    }
    fun method(){println("method")}
    
}

A.omethod() 
A.method() 

val B:Structure = object : Structure() {
    override fun omethod() { 
        println("Overridden method00")
    }
    fun method(){println("method")}
}

B.omethod() 
