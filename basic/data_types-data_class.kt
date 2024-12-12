data class Tuple01(val name: Any, val quantity: Any, val price: Any)
data class Tuple02<A, B, C>(val name: A, val quantity: B, val price: C)

val tuple01 = Tuple01("Jhon", 10, 10000.0)
tuple01.name
tuple01.quantity
tuple01.price

val tuple02 = Tuple02("Jhon", 10, 10000.0)
tuple02.name
tuple02.quantity
tuple02.price
