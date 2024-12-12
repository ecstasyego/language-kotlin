// range objects
1..10
1..<11
1 until 11
10 downTo 1

// list objects
(1..10).map{it}.toList()
(1..<11).map{it}.toList()
(1 until 11).map{it}.toList()
(10 downTo 1).map{it}.toList()

// map objects
(0..10).map{ if (it%3 == 0) Pair(it, true) else Pair(it, false)}.toMap()
(0..<11).map{ if (it%3 == 0) Pair(it, true) else Pair(it, false)}.toMap()
(1 until 11).map{ if (it%3 == 0) Pair(it, true) else Pair(it, false)}.toMap()
(10 downTo 1).map{ if (it%3 == 0) Pair(it, true) else Pair(it, false)}.toMap()




// mapper example01[target, index, series]
val target = (10..30).toList()
val index = (0..<target.size).toList()
val series = index.zip(target).toMap()
series.map{if (it.value > 20) "A" else "B"}

val mapper = mapOf(0 to false, 1 to true)
series.map{mapper[it.key] is Boolean}
series.map{mapper[it.key] !is Boolean}

// mapper example01[target, mapper, values]
val values01 = {
    val target = listOf(0, 1, 4, 4, 3, 1, 3, 2, 4, 1, 1, 0, 0)
    val mapper = (0..4).toList().zip(listOf("A", "B", "C", "D", "E")).toMap() // range object > list object > zip object > map object
    val values = MutableList<String?>(target.size){null}
    
    (0..<keys.size).forEach{ it -> values[it] = mapper[keys[it]] }
    values
}()


// mapper example02[target, index, series, mapper, values]
val values02 = {
    val target = (10..30).toList()
    val index = (0..<target.size).toList()
    val series = index.zip(target).toMap()
    val mapper = mapOf(0 to false, 1 to true)
    val values = MutableList<Boolean?>(target.size) {null}
    
    series.forEach{(idx, value) -> values[idx] = mapper[value % 2]}
    values    
}()


