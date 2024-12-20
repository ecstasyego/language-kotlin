class Structure00 {
    constructor(param00: Int) {}
}

class Structure01 {
    constructor(param00: Int) {}
    constructor(param00: Int, param01: String) : this(param00) {}
}

class Structure02 {
    constructor(param00: Int) {}
    constructor(param00: Int, param01: String) : this(param00) {}
    constructor(param00: Int, param01: String, param02: Double) : this(param00, param01) {}
}

class Structure03(param00: Int, param01: String="Hello", param02: Double = 3.14) {}

class Structure04 {
    lateinit var property00: String
    constructor(param00: String) {property00 = param00}
}

class Structure05 {
    lateinit var property00: String
    constructor(param00: String) {this.property00 = param00}
}

Structure00(1)
Structure01(0)
Structure01(0, "Hello")
Structure02(1)
Structure02(1, "World")
Structure02(1, "World", 3.14)
Structure03(2)
Structure03(2)
Structure03(2, "World")
Structure03(2, "World", 2.718)
Structure04("Hello").property00
Structure04("World").property00
