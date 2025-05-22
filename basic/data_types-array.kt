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

// Merge Array
val arr = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))
arrayOf(arr[0], arr[1])

// Array Interfaces
Array(6) { 0 }
Array(6) { it }
Array(6) { idx -> idx }

Array<Boolean>(5) {true}
Array<Int>(5) {100}
Array<Double>(5) {100.0}
Array<String>(5) {"Alphabet"}

BooleanArray(10)
ByteArray(10)
IntArray(10)
DoubleArray(10)
CharArray(10)

intArrayOf(1,2,3,4,5)
doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
charArrayOf('a', 'b', 'c', 'd')
booleanArrayOf(true, false)


// 1D Array
Array(3) { false }
Array(3) { 0 }
Array(3) { 0.0 }

Array(3) { row -> false }
Array(3) { row -> 0 }
Array(3) { row -> 0.0 }

Array<Boolean>(3) { false }
Array<Int>(3) { 0 }
Array<Double>(3) { 0.0 }

Array<Boolean>(3) { row -> false }
Array<Int>(3) { row -> 0 }
Array<Double>(3) { row -> 0.0 }

BooleanArray(3)
IntArray(3)
DoubleArray(3)

// 2D Array
Array(3) { BooleanArray(3) }
Array(3) { IntArray(3) }
Array(3) { DoubleArray(3) }

Array(3) { Array(3) { false } }
Array(3) { Array(3) { 0 } }
Array(3) { Array(3) { 0.0 } }

Array(3) { Array<Boolean>(3) { false } }
Array(3) { Array<Int>(3) { 0 } }
Array(3) { Array<Double>(3) { 0.0 } }

Array(3) { row -> Array(3) { col -> false } }
Array(3) { row -> Array(3) { col -> 0 } }
Array(3) { row -> Array(3) { col -> 0.0 } }


// 1D Random Array
import kotlin.random.Random

Array(10) {Random.nextBoolean()}
Array(10) {Random.nextInt(0, 10)}
Array(10) {Random.nextDouble(-3.14, 3.14)}

BooleanArray(10) { Random.nextBoolean() }
IntArray(10) {Random.nextInt(0, 10)}
DoubleArray(10) { Random.nextDouble(-3.14, 3.14) }

Array<Boolean>(10) {Random.nextBoolean()}
Array<Int>(10) {Random.nextInt(0, 10)}
Array<Double>(10) {Random.nextDouble(-3.14, 3.14)}

// 2D Random Array
Array(3) { BooleanArray(3) {Random.nextBoolean()} }
Array(3) { IntArray(3) {Random.nextInt(0, 10)} }
Array(3) { DoubleArray(3) {Random.nextDouble(-3.14, 3.14)} }

Array(3) { Array(3) { Random.nextBoolean() } }
Array(3) { Array(3) { Random.nextInt(0, 10) } }
Array(3) { Array(3) { Random.nextDouble(-3.14, 3.14) } }

Array(3) { Array<Boolean>(3) { Random.nextBoolean() } }
Array(3) { Array<Int>(3) { Random.nextInt(0, 10) } }
Array(3) { Array<Double>(3) { Random.nextDouble(-3.14, 3.14) } }

Array(3) { row -> Array(3) { col -> Random.nextBoolean() } }
Array(3) { row -> Array(3) { col -> Random.nextInt(0, 10) } }
Array(3) { row -> Array(3) { col -> Random.nextDouble(-3.14, 3.14) } }


fun process():Array<Char>{
    return arrayOf('a', 'b', 'c')
}
