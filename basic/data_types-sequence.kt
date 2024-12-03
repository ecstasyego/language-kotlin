val sqncobj = sequenceOf(1, 2, 3, 4, 5).map{it*2}.filter{it%2 == 0}.take(4).drop(1)
sqncobj.forEach{println(it)}

