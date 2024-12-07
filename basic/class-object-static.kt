class Structure {
    companion object {
        val static_property:String = "STATIC PROPERTY"
        fun static_method(){println("STATIC METHOD")}
    } 
    
    val property01:Int? = null
    val property02:String? = null

    fun method01(){println(property01)}
    fun method02(){println(property02)}
}

Structure.static_property
Structure.static_method()
Structure().property01
Structure().property02
Structure().method01()
Structure().method02()
