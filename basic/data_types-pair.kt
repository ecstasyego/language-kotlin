val pair1 = Pair("a", 1)
val pair2 = "a" to 1
pair1.first
pair1.second
pair2.first
pair2.second

Pair("key", "value") is Pair<*, *>
Pair("key", "value") is Pair<Any, Any>
Pair("key", "value") is Pair
"key" to "value" is Pair<*, *>
"key" to "value" is Pair<Any, Any>
"key" to "value" is Pair

// list of pair 
val list0 = listOf(Pair("Alice", 90), Pair("Bob", 80), Pair("Charlie", 70))
val (keys, values) = list0.unzip()
keys.zip(values)

// map of pair 
val map0 = mapOf(Pair("Alice", 90), Pair("Bob", 80), Pair("Charlie", 70))
map0.keys.zip(map0.values).toMap()
map0.map{it.toPair()}.toMap()

// nested pair
val nestedPair01: Pair<Pair<Pair<Pair<Int, String>, Boolean>, Double>, String> = Pair(Pair(Pair(1, "a"), true), 10.0) to "x"
val nestedPair02: Pair<Pair<Pair<Pair<Int, String>, Boolean>, Double>, String> = 1 to "a" to true to 10.0 to "x"
val result = listOf(
    nestedPair01.first.first.first.first,  // 1
    nestedPair01.first.first.first.second, // "a"
    nestedPair01.first.first.second,       // true
    nestedPair01.first.second,             // 10.0
    nestedPair01.second                    // "x"
)







// from list
val list1 = listOf("a", "b", "c")
val list2 = listOf(1, 2, 3)

val zipped1 = list1.zip(list2)
val zipped2 = listOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))

val map1 = zipped1.toMap()
val map2 = zipped2.toMap()

val mmap1 = zipped1.toMap().toMutableMap()
val mmap2 = zipped2.toMap().toMutableMap()

val (keys1, values1) = zipped1.unzip()
val (keys2, values2) = zipped2.unzip()





// from map
val map3 = mapOf("a" to 1, "b" to 2, "c" to 3)
val map4 = mapOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))

val list3_1 = map3.keys.toList()
val list4_1 = map4.keys.toList()
val mlist3_1 = map3.keys.toMutableList()
val mlist4_1 = map4.keys.toMutableList()

val list3_2 = map3.values.toList()
val list4_2 = map4.values.toList()
val mlist3_2 = map3.values.toMutableList()
val mlist4_2 = map4.values.toMutableList()
