val arr = arrayOf(0,1,2,3,4,5)
arr[0] = 100
arr[1] = 100
arr[2] = 100
arr[3] = 100
arr[4] = 100
arr[5] = 100
arr.size

arr.joinToString()
arr.toList()
arr.map{it.toDouble()}.toDoubleArray()

for (idx in 0..arr.size) {println(idx)}
for (element in arr) {println(element)}

arr.forEach{println(it)}
arr.forEach{element -> println(element)}


// Array User Interfaces
Array(6) { 0 }
Array(6) { it }
Array(6) { idx -> idx }

Array<Int>(5) {100}
Array<Double>(5) {100.0}
Array<String>(5) {"Alphabet"}
Array<Boolean>(5) {true}

intArrayOf(1,2,3,4,5)
doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
charArrayOf('a', 'b', 'c', 'd')
booleanArrayOf(true, false)
