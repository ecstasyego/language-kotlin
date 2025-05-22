import kotlin.random.Random
data class Tuple<T0, T1, T2>(val C0:T0, val C1:T1, val C2:T2) 

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

val mlist2 = mutableListOf<Map<String, Any>>()
mlist2.add(mapOf("C0" to 1, "C1" to 0, "C2" to 3))
mlist2.add(mapOf("C0" to 2, "C1" to 3, "C2" to 4))
mlist2.add(mapOf("C0" to 0, "C1" to 0, "C2" to 0))

mlist2[0]["C0"]; mlist2[0]["C1"]; mlist2[0]["C2"]
mlist2[1]["C0"]; mlist2[1]["C1"]; mlist2[1]["C2"]
mlist2[2]["C0"]; mlist2[2]["C1"]; mlist2[2]["C2"]

for (row in mlist2){
    println(row.values.joinToString())
    println(row["C0"])
    println(row["C1"])
    println(row["C2"])
}



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

val mmap1 = mutableMapOf<String, List<Int>>()
mmap1["C0"] = (0..<100).toList()
mmap1["C1"] = (0..<100).reversed().toList()
mmap1["C2"] = (100..<200).toList()

val mmap2 = mutableMapOf<String, List<Any>>()
mmap2["C0"] = Array(5) { Random.nextInt(0, 10) }.toList()
mmap2["C1"] = Array(5) { Random.nextDouble(-3.14, 3.14) }.toList()
mmap2["C2"] = Array(5) { Random.nextBoolean() }.toList()
mmap2["C3"] = Array(5) { Random.nextDouble(-3.14, 3.14) }.toList()
for (col in mmap2.keys){
    println(mmap2[col]!!.joinToString())
}

val mmap3 = mutableMapOf<String, Tuple<Int, String, String>>()
mmap3["R0"] = Tuple(0, "A", "B")
mmap3["R1"] = Tuple(100, "C", "B")
mmap3["R2"] = Tuple(200, "B", "B")
mmap3["R0"]?.C0; mmap3["R0"]?.C1; mmap3["R0"]?.C2
mmap3["R1"]?.C0; mmap3["R1"]?.C1; mmap3["R1"]?.C2
mmap3["R2"]?.C0; mmap3["R2"]?.C1; mmap3["R2"]?.C2

val mmap4 = mutableMapOf<String, Tuple<List<Int>, List<Double>, List<Double>>>()
mmap4["M0"] = Tuple(Array(10) { Random.nextInt(0, 10) }.toList(), Array(10) { Random.nextDouble(-3.14, 3.14) }.toList(), Array(10) { Random.nextDouble(-3.14, 3.14) }.toList()) 
mmap4["M1"] = Tuple(Array(10) { Random.nextInt(0, 10) }.toList(), Array(10) { Random.nextDouble(-3.14, 3.14) }.toList(), Array(10) { Random.nextDouble(-3.14, 3.14) }.toList()) 
mmap4["M2"] = Tuple(Array(10) { Random.nextInt(0, 10) }.toList(), Array(10) { Random.nextDouble(-3.14, 3.14) }.toList(), Array(10) { Random.nextDouble(-3.14, 3.14) }.toList()) 
mmap4["M0"]?.C0; mmap4["M0"]?.C1; mmap4["M0"]?.C2
mmap4["M1"]?.C0; mmap4["M1"]?.C1; mmap4["M1"]?.C2
mmap4["M2"]?.C0; mmap4["M2"]?.C1; mmap4["M2"]?.C2
