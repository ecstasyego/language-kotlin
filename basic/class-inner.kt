class Outer {
    val outer_property:String = "OUTER-VALUE"
    fun outer_method(){println(outer_property)}
    
    inner class Inner {
        fun method() {
            println(outer_property) 
            println(this@Outer.outer_property)
            outer_method()
            this@Outer.outer_method()
        }
    }
}

Outer().Inner().method()
