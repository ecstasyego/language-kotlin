fun function01(x:Int, y:Int):Int {return x * y}
fun function02(x:Int, y:Int) = x * y
val function03: (Int, Int) -> Int = { x, y -> x * y }
val function04 = { 6 }
val function05:(Int)->Int = { x -> x }
val function06:(Int, Int)->Int = { x, y -> x * y }
val function07:(Int, Int, Int)->Int = { x, y, z -> x * y * z }

function01(3, 2)
function02(3, 2)
function03(3, 2)
function04()
function05(3)
function06(3, 2)
function07(3, 2, 1)

val lambda01 = ::function01
val lambda02 = ::function02
val lambda03 = ::function03
val lambda04 = ::function04
val lambda05 = ::function05
val lambda06 = ::function06
val lambda07 = ::function07
lambda01(3, 2)
lambda02(3, 2)
lambda03()(3, 2)
lambda04()()
lambda05()(3)
lambda06()(3, 2)
lambda07()(3, 2, 1)
