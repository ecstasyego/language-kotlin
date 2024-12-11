val arr = arrayOf(0,1,2,3,4,5)
arr[0] = 100
arr[1] = 100
arr[2] = 100
arr[3] = 100
arr[4] = 100
arr[5] = 100
arr.size
arr.joinToString()

for (idx in 0..arr.size) {println(idx)}
for (element in arr) {println(element)}

arr.forEach{println(it)}
arr.forEach{element -> println(element)}
arr.map{it.toDouble()}.toDoubleArray()
