// range objects
1..10
1..<11
1 until 11
10 downTo 1

(1..10).map{it}
(1..<11).map{it}
(1 until 11).map{it}
(10 downTo 1).map{it}


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
