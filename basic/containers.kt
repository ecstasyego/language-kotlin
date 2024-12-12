
val mlist0 = mutableListOf<Any>()
mlist0.add(0)
mlist0.add('A')
mlist0.add("Alphabet")
mlist0[0]
mlist0[1]
mlist0[2]
mlist0.map{it}
mlist0.filter{it is Int}
mlist0.zip(0..<mlist0.size)
mlist0.zip(0..<mlist0.size).map{it.first}
mlist0.zip(0..<mlist0.size).map{it.second}
mlist0.zip(0..<mlist0.size).unzip()
mlist0.zip(0..<mlist0.size).unzip().first
mlist0.zip(0..<mlist0.size).unzip().second
mlist0.zip(0..<mlist0.size).toList()
mlist0.zip(0..<mlist0.size).toMap()



data class Tuple<T0, T1, T2>(val C0:T0, val C1:T1, val C2:T2) 
val mlist1 = mutableListOf<Tuple<Int, String, String>>()
mlist1.add(Tuple(0, "A", "B"))
mlist1.add(Tuple(100, "B", "B"))
mlist1.add(Tuple(200, "C", "B"))
mlist1[0].C0; mlist1[0].C1; mlist1[0].C2
mlist1[1].C0; mlist1[1].C1; mlist1[1].C2
mlist1[2].C0; mlist1[2].C1; mlist1[2].C2
mlist1.map{it.C0}; mlist1.map{it.C1}; mlist1.map{it.C2}
mlist1.filter{it.C0 == 0}; mlist1.filter{it.C1 == "B"}; mlist1.filter{it.C2 == "A"}
mlist1.zip(0..<mlist1.size)
mlist1.zip(0..<mlist1.size).map{it.first.C0}
mlist1.zip(0..<mlist1.size).map{it.first.C1}
mlist1.zip(0..<mlist1.size).map{it.first.C2}
mlist1.zip(0..<mlist1.size).map{it.second}
mlist1.zip(0..<mlist1.size).map{it.second}
mlist1.zip(0..<mlist1.size).map{it.second}



val mmap0 = mutableMapOf<String, Any>()
mmap0["A"] = 0
mmap0["B"] = 1
mmap0["C"] = "Alphabet"
mmap0.keys
mmap0.values
mmap0.map{it.key}
mmap0.map{it.value}
mmap0.filter{it.key in mmap0.keys}
mmap0.filter{it.value in mmap0.values}
