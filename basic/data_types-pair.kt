val pair1 = Pair("a", 1)
val pair2 = "a" to 1
pair1.first
pair1.second
pair2.first
pair2.second



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
