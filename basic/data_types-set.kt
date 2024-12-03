// setOf
val setobj00 = setOf(1, 1, 2, 3, 4, 5, 5, 5)
setobj00.forEach{println(it)}
setobj00.contains(1)
setobj00.size
setobj00.isEmpty()

val setobj01 = setOf(1, 1, 2, 3, 4, 5)
val setobj02 = setOf(3, 3, 4, 5, 6)
setobj01.union(setobj02)
setobj01.intersect(setobj02)
setobj01.subtract(setobj02)



// mutableSetOf: add, remove
val msetobj00 = mutableSetOf(1, 1, 2, 3, 4, 5, 5, 5)
msetobj00.forEach{println(it)}
msetobj00.contains(1)
msetobj00.size
msetobj00.add(6)
msetobj00.remove(1)
msetobj00.clear()
msetobj00.isEmpty()

val msetobj01 = mutableSetOf(1, 1, 2, 3, 4, 5)
val msetobj02 = mutableSetOf(3, 3, 4, 5, 6)
msetobj01.union(msetobj02)
msetobj01.intersect(msetobj02)
msetobj01.subtract(msetobj02)
msetobj01.addAll(msetobj02)
msetobj01.removeAll(msetobj02)
