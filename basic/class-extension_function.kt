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

fun Structure.add(integer:Int): Int{
    return this.parameter + integer
}

fun <T: Int> Structure.sub(integer:T): Int{
    return this.parameter - integer.toInt()
}

fun <T: Number> Structure.mul(integer:T): Double{
    return this.parameter * integer.toDouble()
}

fun <T: Double> Structure.div(integer:T): Double{
    return this.parameter / integer
}

Structure().addOne()
Structure().add(10)
Structure().sub(10)
Structure().mul(10)
Structure().div(10.0)
