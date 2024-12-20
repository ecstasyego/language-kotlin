
class Structure00 {
    constructor(param00: Int) {}
}

class Structure01() {
    constructor(param00: Int) : this() {}
}

class Structure02(param00:Int){
    constructor(param00:Float):this(param00.toInt()){}
    constructor(param00:Double):this(param00.toInt()){}
    constructor(param00:String):this(param00.toInt()){}
}

class Structure03(var a:String, var b:Double){
    constructor(a:String):this(a, 1.0){}
    constructor(b:Double):this("Y", b){}
}

class Structure04(var a:String, var b:Double=1.0){
    constructor(b:Double):this("X", b){}
}

class Structure05(var a:String, var b:Double, var c:Int=100){
    constructor(a:String):this(a, 1.0){}
    constructor(b:Double):this("X", b){}
    constructor(a:String, c:Int):this(a, 1.0, c){}
    constructor(b:Double, c:Int):this("X", b, c){}
}

class Structure06(val a:String){
    lateinit var b: String
    constructor(a: String, b: String) : this(a) {this.b = b}
}

Structure00()
Structure00(1)
Structure01()
Structure01(1)
Structure02(0)
Structure02(0.0F)
Structure02(0.0)
Structure03("X")
Structure03(b=3.0)
Structure04("Y")
Structure04(b=3.0)
Structure05("Y")
Structure05(b=3.0)
Structure05(a="X", c=200)
Structure05(b=3.0, c=200)
Structure06("X")
Structure06("X", "Y")
