val list1 = listOf("a", "b", "c")
val list2 = listOf(1, 2, 3)

val zipped1 = list1.zip(list2)
val zipped2 = listOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))

val (keys1, values1) = zipped1.unzip()
val (keys2, values2) = zipped2.unzip()

val pair = Pair("a", 1)
pair.first
pair.second
