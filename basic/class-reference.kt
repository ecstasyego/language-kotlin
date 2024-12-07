class Person(var name: String, var age: Int)

val person = Person("Jhon", 30)
Person::class
Person::name.get(person)
Person::age.get(person)
Person::name.set(person, "Martin")
Person::age.set(person, 40)
