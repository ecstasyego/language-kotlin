fun Int.addOne(): Int {
    return this + 1
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

1.addOne()
"Hello, World!".lastChar()



class Structure(val parameter: Int=0)
fun Structure.addOne(): Int{
    return this.parameter + 1
}

Structure().addOne()
