import kotlin.reflect.KProperty1
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.memberProperties

class Structure(var param00: String, var param01: Int, val param02: Char = 'A')

fun getAttribute(obj: Any, attributeName: String): Any? {
    val property = obj::class.memberProperties.find { it.name == attributeName }
    return (property as? KProperty1<Any, *>?)?.get(obj)
}

fun setAttribute(obj: Any, attributeName: String, value: Any) {
    val property = obj::class.memberProperties
        .firstOrNull { it.name == attributeName } as? KMutableProperty1<Any, Any?>
    property?.set(obj, value)
}

val obj = Structure(param00 = "John", param01 = 30)
getAttribute(obj, "param00")
getAttribute(obj, "param01")
getAttribute(obj, "param02")
setAttribute(obj, "param00", "Martin")
setAttribute(obj, "param01", 50)
getAttribute(obj, "param00")
getAttribute(obj, "param01")
