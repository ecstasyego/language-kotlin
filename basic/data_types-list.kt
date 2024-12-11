// listOf
val listobj = listOf(1, 1, 2, 3, 4, 5, 5, 5)
listobj.indexOf(3) // index
listobj[0] // value
listobj[1] // value
listobj.subList(1,4)
listobj.contains(1)
listobj.size
listobj.isEmpty()
listobj.forEach{println(it)}
listobj.first()
listobj.last()



// mutableListOf
val mlistobj = mutableListOf(1, 1, 2, 3, 4, 5, 5, 5)
mlistobj.indexOf(5) // index
mlistobj[0] // value
mlistobj[1] // value
mlistobj[0] = -1
mlistobj[1] = -2
mlistobj.subList(1,4)
mlistobj.contains(1)
mlistobj.size
mlistobj.isEmpty()
mlistobj.forEach{println(it)}
mlistobj.first()
mlistobj.last()

mlistobj.add(6)
mlistobj.add(0, 100)
mlistobj.addAll(listOf(100, 100, 200))
mlistobj.remove(1) // only first one
mlistobj.removeAt(0)
mlistobj.removeAll(listOf(100,200)) // with duplication
mlistobj


// Mutable List Interfaces
List(6) { 0 }
List(6) { it }
List(6) { idx -> idx }

List<Int>(5) {100}
List<Double>(5) {100.0}
List<String>(5) {"Alphabet"}
List<Boolean>(5) {true}
List<Int>(5) {100}

fun process01():List<String>{
    return mutableListOf("US", "UK")
}

fun process02():List<Char>{
    return mutableListOf('A', 'B', 'C')
}

fun process03():List<Int>{
    return mutableListOf(1, 2, 3)
}

fun process04():List<Double>{
    return mutableListOf(1.0, 2.0, 3.0)
}

