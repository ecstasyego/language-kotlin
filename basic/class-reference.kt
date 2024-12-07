class Person(var name: String, var age: Int)

val person = Person("Jhon", 30)
Person::class
Person::name.get(person)
Person::age.get(person)
