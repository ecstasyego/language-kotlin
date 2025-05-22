class Outer {
    val outer_property01:String = "OUTER-VALUE"
    val outer_property02:Nested = Nested()
    fun outer_method(){println(outer_property01)}
    
    class Nested {
        fun nested_method() {
            println("NESTED") 
        }
    }
    
    inner class Inner {
        fun inner_method() {
            println("INNER")
            println(outer_property01) 
            println(this@Outer.outer_property01)
            outer_method()
            this@Outer.outer_method()
        }
    }
    
}

Outer().Inner().inner_method()
Outer().outer_property02.nested_method()
