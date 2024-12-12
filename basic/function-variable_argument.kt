fun function01(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}
function01(1,2,3)

fun function02(param01:Int, param02:String, vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}
function02(1, "ABC", 3, 4)


fun function03(param01:Int, param02:String, param03:Int=10, vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}
function03(1, "ABC") // param03=10, numbers = []
function03(1, "ABC", 3) // numbers = []
function03(1, "ABC", 3, 4) // numbers = [4]
function03(1, "ABC", 3, 4, 5) // numbers = [4, 5]
