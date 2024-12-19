class PropertyValue01(val core: Int)
class PropertyValue02<T>(val core: T)

class Structure {
    val lazyValue01: PropertyValue01 by lazy { PropertyValue01(1) }
    val lazyValue02: PropertyValue02<String> by lazy { PropertyValue02("String") }
}

val obj = Structure()
obj.lazyValue01.core
obj.lazyValue02.core
