class Person {
    var name: String = "John"
    var age: Int = 30
}

val person = Person()
person.also{
    println(it.name)
    println(it.age)
}

person.also{ self ->
    println(self.name)
    println(self.age)
}
