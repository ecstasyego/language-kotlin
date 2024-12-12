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
mapobj.map{it}
mapobj.map{it.key}
mapobj.map{it.value}
mapobj.mapValues{it.key.uppercase()}
mapobj.mapValues{it.value + 1}
mapobj.filter{it.key == "three"}
mapobj.filter{it.value % 2 == 0}
mapobj.size
mapobj.isEmpty()



// mutableMapOf
mutableMapOf<String, Int>() // empty mutableMapOf object
mutableMapOf<String, Any>() // dictionary
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
mmapobj.map{it}
mmapobj.map{it.key}
mmapobj.map{it.value}
mmapobj.mapValues{it.key.uppercase()}
mmapobj.mapValues{it.value + 1}
mmapobj.filter{it.key == "three"}
mmapobj.filter{it.value % 2 == 0}
mmapobj.size
mmapobj.clear()
mmapobj.isEmpty()
