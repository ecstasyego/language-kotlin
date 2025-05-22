// mapOf
mapOf<String, Int>() // empty mapOf object
mapOf("one" to 1, "two" to 2, "three" to 3)
mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
listOf("one", "two", "three").zip(listOf(1, 2, 3)).toMap()

val mapobj = mapOf("one" to 1, "two" to 2, "three" to 3)
mapobj["one"]
mapobj["two"]
mapobj["three"]
mapobj.get("one")
mapobj.get("two")
mapobj.get("three")
mapobj.containsKey("one")
mapobj.containsValue(1)
mapobj.keys
mapobj.values
mapobj.forEach{(key, value) -> println(key + ", " + value)}
mapobj.map{it}          // return List
mapobj.map{it.key}      // return List
mapobj.map{it.value}    // return List
mapobj.map{it.toPair()} // return List
mapobj.flatMap{listOf(it)}                     // return List
mapobj.flatMap{listOf(it.toPair())}              // return List
mapobj.flatMap{listOf(Pair(it.key, it.value))} // return List
mapobj.flatMap{listOf(it.key to it.value)}     // return List 
mapobj.flatMap{listOf(it.key)}                 // return List
mapobj.flatMap{listOf(it.value)}               // return List
mapobj.mapValues{it.key.uppercase()} // return Map
mapobj.mapValues{it.value + 1}       // return Map
mapobj.filter{it.key == "three"} // return Map
mapobj.filter{it.value % 2 == 0} // return Map
mapobj.size
mapobj.isEmpty()



// mutableMapOf
mutableMapOf<String, Int>() // empty mutableMapOf object
mutableMapOf<String, Any>() // dictionary
mutableMapOf<String, List<Any>>() // dictionary
mutableMapOf("one" to 1, "two" to 2, "three" to 3)
mutableMapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
listOf("one", "two", "three").zip(listOf(1, 2, 3)).toMap().toMutableMap()

val mmapobj = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
mmapobj["one"]
mmapobj["two"]
mmapobj["three"]
mmapobj["four"] = 4
mmapobj["five"] = 5
mmapobj.get("one")
mmapobj.get("two")
mmapobj.get("three")
mmapobj.put("four", 4)
mmapobj.put("five", 5)
mmapobj.put("six", 6)
mmapobj.put("seven", 7)
mmapobj.remove("seven")
mmapobj.containsKey("one")
mmapobj.containsValue(1)
mmapobj.keys
mmapobj.values
mmapobj.forEach{(key, value) -> println(key + ", " + value)}
mmapobj.map{it}          // return List
mmapobj.map{it.toPair()} // return List
mmapobj.map{it.key}      // return List
mmapobj.map{it.value}    // return List
mmapobj.flatMap{listOf(it)}                     // return List
mmapobj.flatMap{listOf(it.toPair())}            // return List
mmapobj.flatMap{listOf(Pair(it.key, it.value))} // return List
mmapobj.flatMap{listOf(it.key to it.value)}     // return List 
mmapobj.flatMap{listOf(it.key)}                 // return List
mmapobj.flatMap{listOf(it.value)}               // return List
mmapobj.mapValues{it.key.uppercase()} // return Map
mmapobj.mapValues{it.value + 1}       // return Map
mmapobj.filter{it.key == "three"}     // return Map
mmapobj.filter{it.value % 2 == 0}     // return Map
mmapobj.size
mmapobj.clear()
mmapobj.isEmpty()

// dictionary
val dictionary = mutableMapOf<String, Any>()
dictionary["age"] = 25
dictionary["name"] = "John"
val age = dictionary["age"] as Int
val name = dictionary["name"] as String

// dictionary with series
import kotlin.random.Random
val seriesDict = mutableMapOf<String, List<Any?>>(
    "A" to (0 until 26).toList(),
    "B" to (0 until 26).reversed().toList(),
    "C" to (25 downTo 0).toList(),
    "D" to List(26){Random.nextInt(0, 26)},
    "E" to listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"),
)
seriesDict["F"] = seriesDict["E"]!!.map{(it as String)?.lowercase()}
seriesDict["G"] = seriesDict["A"]!!.map{ seriesDict["E"]!![(it as Int)] }
seriesDict["H"] = seriesDict["A"]!!.map{ seriesDict["F"]!![(it as Int)] }
