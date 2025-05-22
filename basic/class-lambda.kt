class Structure(){
    val property01: String? = null
    val property02: (Int, Int) -> Int = {x, y -> x + y}
    
    fun method01(a:Int, b:Int, operation: (Int, Int) -> Int){}
    fun method02(a:Int, b:Int, operation: (Int, Int) -> Int): Boolean{return true}    
    fun method03(a:Int, b:Int, operation: (Int, Int) -> Int): Int{
        return operation(a, b)
    }

    fun method04(x:String): (String)->String {
        return { y -> "$y, $x"}
    }
}

Structure().property01
Structure().property02(0, 1)

fun function01(x:Int, y:Int):Int {return x + y}
fun function02(x:Int, y:Int):Int = x + y
val lambda: (Int, Int) -> Int = { x, y -> x + y } 

Structure().method01(0, 1, ::function01)
Structure().method02(0, 1, ::function01)
Structure().method03(0, 1, ::function01)
Structure().method01(0, 1, ::function02)
Structure().method02(0, 1, ::function02)
Structure().method03(0, 1, ::function02)
Structure().method01(0, 1, lambda)
Structure().method02(0, 1, lambda)
Structure().method03(0, 1, lambda)
Structure().method01(0, 1, { x, y -> x + y } )
Structure().method02(0, 1, { x, y -> x + y } )
Structure().method03(0, 1, { x, y -> x + y } )

Structure().method04("World!")("Hello")
