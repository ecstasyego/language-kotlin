// [1]construction > [2]initialization > [3]property

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

class Structure06(val property00:String){
    lateinit var property01: String
    constructor(property00: String, param01: String) : this(property00) {property01 = param01}
}

class Structure07(val property00:String){
    lateinit var property01: String
    constructor(property00: String, param01: String) : this(property00) {this.property01 = param01}
}

class Structure08(val property00:String, val property01: String){
    constructor(property00: String, property01: String, param02: String, param03: String) : this(property00, property01) {}
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
Structure04("Hello").property00
Structure05("World").property00
Structure05("World").property00
Structure06("X").property00
Structure06("X", "Y").property00
Structure06("X", "Y").property01
Structure07("A").property00
Structure07("A", "B").property00
Structure07("A", "B").property01
Structure08("A", "B").property00
Structure08("A", "B").property01
Structure08("A", "B", "C", "D").property00
Structure08("A", "B", "C", "D").property01
