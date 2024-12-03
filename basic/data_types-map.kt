// mapOf
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
mapobj.mapValues{it.key.uppercase()}
mapobj.mapValues{it.value + 1}
mapobj.filter{it.key == "three"}
mapobj.filter{it.value % 2 == 0}
mapobj.size

