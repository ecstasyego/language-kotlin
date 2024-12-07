class Person(var name: String, var age: Int){
    fun method01(){}
    fun method02(){}
}

val person = Person("Jhon", 30)
Person::class
Person::method01
Person::method02
Person::name.get(person)
Person::age.get(person)
Person::name.set(person, "Martin")
Person::age.set(person, 40)
