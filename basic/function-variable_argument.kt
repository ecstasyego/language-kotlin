fun function01(vararg numbers: Int) {
    for (number in numbers){}
}
function01(1,2,3) // numbers = [1,2,3]
function01(*List<Int>(5){it}.toIntArray()) // numbers = [0,1,2,3,4]

fun function02(param01:Int, param02:String, vararg numbers: Int) {
    for (number in numbers){}
}
function02(1, "ABC", 3, 4)
function02(1, "ABC", *List<Int>(5){it}.toIntArray()) // numbers = [0,1,2,3,4]


fun function03(param01:Int, param02:String, param03:Int=10, vararg numbers: Int) {
    for (number in numbers){}
}
function03(1, "ABC") // param03=10, numbers = []
function03(1, "ABC", 3) // numbers = []
function03(1, "ABC", 3, 4) // numbers = [4]
function03(1, "ABC", 3, 4, 5) // numbers = [4, 5]
function03(1, "ABC", 3, *List<Int>(5){it}.toIntArray()) // numbers = [0,1,2,3,4]
