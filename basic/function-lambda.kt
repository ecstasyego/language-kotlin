fun function01(x:Int, y:Int):Int {return x * y}
fun function02(x:Int, y:Int) = x * y

function01(3, 2)
function02(3, 2)

val lambda01 = ::function01
val lambda02 = ::function01
lambda01(3, 2)
lambda02(3, 2)
