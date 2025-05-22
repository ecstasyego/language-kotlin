class Structure01(){
    val immutable_property01:String? = null
    val immutable_property02:Double? = null
    var mutable_property01:String? = null
    var mutable_property02:Double? = null
}

class Structure02(val immutable_property01:String? = null, val immutable_property02:Double? = null, var mutable_property01:String? = null, var mutable_property02:Double? = null){}

class Structure03(val immutable_property01:String? = null, var mutable_property01:String? = null){
    val immutable_property02:Double? = null
    var mutable_property02:Double? = null
}

class Structure04(val immutable_property01:String? = null, var mutable_property01:String? = null){
    val immutable_property02:Double? = null
    var mutable_property02:Double? = null
}

Structure01().immutable_property01
Structure01().immutable_property02
Structure01().mutable_property01
Structure01().mutable_property02
Structure02().immutable_property01
Structure02().immutable_property02
Structure02().mutable_property01
Structure02().mutable_property02
Structure03().immutable_property01
Structure03().immutable_property02
Structure03().mutable_property01
Structure03().mutable_property02
Structure04().immutable_property01
Structure04().immutable_property02
Structure04().mutable_property01
Structure04().mutable_property02
