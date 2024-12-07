fun function01(x:Int, y:Int):Int {return x * y}
fun function02(x:Int, y:Int) = x * y
val function03: (Int, Int) -> Int = { x, y -> x * y }

function01(3, 2)
function02(3, 2)
function03(3, 2)

val lambda01 = ::function01
val lambda02 = ::function02
val lambda03 = ::function03
lambda01(3, 2)
lambda02(3, 2)
lambda03(3, 2)
