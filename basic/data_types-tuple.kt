import kotlin.reflect.full.memberProperties

data class Tuple(val name: String, val age: Int, val isEmployed: Boolean)

Tuple::class.memberProperties.forEach { property ->
    println("Property name: ${property.name}, Type: ${property.returnType}")
}
