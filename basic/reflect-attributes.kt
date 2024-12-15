import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties

class Structure(val param00: String, val param01: Int)

fun getAttribute(obj: Any, attributeName: String): Any? {
    val property = obj::class.memberProperties.find { it.name == attributeName }    
    return (property as? KProperty1<Any, *>?)?.get(obj)
}

val obj = Structure(param00 = "John", param01 = 30)
getAttribute(obj, "param00")
getAttribute(obj, "param01")
