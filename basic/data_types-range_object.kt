// range objects
1..10
1..<11
1 until 11
10 downTo 1


// mapper: range > listOf > mapOf
val mapper = (0..4).toList().zip(listOf("A", "B", "C", "D", "E")).toMap()

val keys = listOf(0, 1, 4, 4, 3, 1, 3, 2, 4, 1, 1, 0, 0)
val values = MutableList<String?>(keys.size){null}

(0..<keys.size).forEach{ it -> values[it] = mapper[keys[it]] }
values
