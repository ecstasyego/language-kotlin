/* Scope Function : Reference : Return : Usage 
let: it: last expression in block: nullable object
run: this: last expression in block: object
with: this: last expression in block: object
apply: this: self: object initialization
also: it: self: object debuging
*/

val str:String = "ABC"

// return last expression in block
str.let{it}
str.run{this}
with(str){this}

// return self
str.apply{this}
str.also{it}



// Example: also, apply
class Person {
    var name: String = "John"
    var age: Int = 30
}

val person = Person()
person.also{
    println(it.name)
    println(it.age)
} // it

person.also{ self ->
    println(self.name)
    println(self.age)
} // it

person.apply{
    println(name)
    println(age)
} // this



