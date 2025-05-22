val str:String = "ABC"

str.let{it} // return last expression in block
str.run{this} // return last expression in block
with(str){this} // return last expression in block
str.apply{this} // return self
str.also{it} // return self

/* Scope Function : Reference : Return : Usage 
let: it: last expression in block: nullable object
run: this: last expression in block: object
with: this: last expression in block: object
apply: this: self: object initialization
also: it: self: object debuging
*/




class Person {
    var name: String = "John"
    var age: Int = 30
}

val person = Person()

// Example: also, apply
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
    println(this.name)
    println(this.age)
} // this


// Example: let, run, with
person.let{
    println(it.name)
    println(it.age)
    it
} // it

person.let{ self ->
    println(self.name)
    println(self.age)
    self
} // it

person.run{
    println(name)
    println(age)
    println(this.name)
    println(this.age)
    this
} // this

with(person){
    println(name)
    println(age)
    println(this.name)
    println(this.age)
    this
} // this



