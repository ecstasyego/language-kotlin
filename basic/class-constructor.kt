class Structure01(var a:String, var b:Double){
    constructor(a:String):this(a, 1.0){this}
    constructor(b:Double):this("Y", b){this}
}

class Structure02(var a:String, var b:Double=1.0){
    constructor(b:Double):this("X", b){this}
}

class Structure03(var a:String, var b:Double, var c:Int=100){
    constructor(a:String):this(a, 1.0){this}
    constructor(b:Double):this("X", b){this}
    constructor(a:String, c:Int):this(a, 1.0, c){this}
    constructor(b:Double, c:Int):this("X", b, c){this}
}

class Structure04(val a:String){
    lateinit var b: String
    constructor(a: String, b: String) : this(a) {this.b = b}
}

Structure01("X")
Structure01(b=3.0)
Structure02("Y")
Structure02(b=3.0)
Structure03("Y")
Structure03(b=3.0)
Structure03(a="X", c=200)
Structure03(b=3.0, c=200)
Structure04("X")
Structure04("X", "Y")
