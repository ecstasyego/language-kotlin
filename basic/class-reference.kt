class Person(var name: String, var age: Int){
    fun method01(){println(name)}
    fun method02(){println(age)}
}

// REFERENCES
::Person // reference constructor
Person::class // reference meta info
Person::method01
Person::method02

// Example1
val CreatePerson = ::Person
val person01 = CreatePerson("Jhon", 30)
Person::name.get(person01)
Person::age.get(person01)
Person::name.set(person01, "Martin")
Person::age.set(person01, 40)
val person01_method01 = person01::method01
val person01_method02 = person01::method02
person01_method01()
person01_method02()


// Example2
val person02 = Person("Jhon", 30)
Person::name.get(person02)
Person::age.get(person02)
Person::name.set(person02, "Martin")
Person::age.set(person02, 40)
val person02_method01 = person02::method01
val person02_method02 = person02::method02
person02_method01()
person02_method02()

