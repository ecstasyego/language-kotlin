class Person {
    var name: String = "John"
    var age: Int = 30
    var money: Int = 0

    fun work(){
        money += 10000
    }
    fun sleep(){
        age += 1        
    }
}

val person = Person()
with(person){
    name = "Coo"
    age = 20
    sleep()
    work()
    
    this.money
}
