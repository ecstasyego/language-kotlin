open class Parent00
class Child00:Parent00(){
}

open class Parent01{
    init{}
}
class Child01:Parent01(){
    init{}
}

open class Parent02{
    val property00:Int by lazy{1} 
    init{property00}
}
class Child02:Parent02(){
    val property01:Int by lazy{1} 
    init{property01}
}

open class Parent03(param00:Int){
    val property00:Int by lazy{param00} 
    init{property00}
}
class Child03(param01:Int):Parent03(param01){
    val property01:Int by lazy{param01}
    init{property01}
}
