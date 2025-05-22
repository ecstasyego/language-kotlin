val sqncobj = sequenceOf(1, 2, 3, 4, 5).map{it*2}.filter{it%2 == 0}.take(4).drop(1)
sqncobj.forEach{println(it)}

arrayOf(1,2,3,4,5).map{it*2}.filter{it%2 == 0}.take(4).drop(1)
listOf(1,2,3,4,5).map{it*2}.filter{it%2 == 0}.take(4).drop(1)
setOf(1,2,3,4,5).map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mutableListOf(1,2,3,4,5).map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mutableSetOf(1,2,3,4,5).map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5).values.map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5).values.map{it*2}.filter{it%2 == 0}.take(4).drop(1)

arrayOf(1,2,3,4,5).asSequence().map{it*2}.filter{it%2 == 0}.take(4).drop(1)
listOf(1,2,3,4,5).asSequence().map{it*2}.filter{it%2 == 0}.take(4).drop(1)
setOf(1,2,3,4,5).asSequence().map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mutableListOf(1,2,3,4,5).asSequence().map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mutableSetOf(1,2,3,4,5).asSequence().map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5).values.asSequence().map{it*2}.filter{it%2 == 0}.take(4).drop(1)
mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5).values.asSequence().map{it*2}.filter{it%2 == 0}.take(4).drop(1)

generateSequence(Array(10){}){it}.takeWhile { it as Int <= 5 }
generateSequence(List(10){}){it}.takeWhile { it as Int <= 5 }
