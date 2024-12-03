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

mlistobj.add(6)
mlistobj.add(0, 100)
mlistobj.addAll(listOf(100, 100, 200))
mlistobj.remove(1) // only first one
mlistobj.removeAt(0)
mlistobj.removeAll(listOf(100,200)) // with duplication
mlistobj
