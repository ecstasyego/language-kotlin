var variable00:Int = 1
var variable01:Int? = 1
var variable02:String = "Hello"
var variable03:String? = null
var variable04:String? = null ?: "World"

// Safe Casting(?)
1 as Int // 1
1 as? Double // null
1 as? String // null

// Safe Call(?.)
true?.toString()
null?.toString()

// Elvis(?:)
true?: 0
null?: 0
true?.toString() ?: 0
null?.toString() ?: 0


// Null-Check
true == null
false == null
1 == null
"Hello" == null
