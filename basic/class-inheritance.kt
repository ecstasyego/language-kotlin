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
