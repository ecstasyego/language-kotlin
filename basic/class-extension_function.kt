fun Int.addOne(): Int {
    return this + 1
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

1.addOne()
"Hello, World!".lastChar()



class Structure(val parameter: Int=1)

fun Structure.addOne(): Int{
    return this.parameter + 1
}

fun Structure.add(number:Int): Int{
    return this.parameter + number
}

fun <T: Int> Structure.sub(number:T): Int{
    return this.parameter - number.toInt()
}

fun <T: Number> Structure.mul(number:T): Double{
    return this.parameter * number.toDouble()
}

fun <T: Double> Structure.div(number:T): Double{
    return this.parameter / number
}

fun <T: Double> Structure.square(number:T): T {
    return (this.parameter * number * number)  as T
}

Structure().addOne()
Structure().add(10)
Structure().sub(10)
Structure().mul(10)
Structure().div(10.0)
Structure().square(10.0)
