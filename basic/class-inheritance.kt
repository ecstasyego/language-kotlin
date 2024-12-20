open class Parent00
class P00Child00:Parent00(){
}
class P00Child01:Parent00{
    constructor(): super(){}
}



open class Parent01{
    init{}
}
class P01Child00:Parent01(){
    init{}
}
class P01Child01:Parent01{
    init{}
    constructor(): super(){}
}



open class Parent02{
    val property00:Int by lazy{1} 
    init{property00}
}
class P02Child00:Parent02(){
    val property01:Int by lazy{1} 
    init{property01}
}



open class Parent03(param00:Int){
    val property00:Int by lazy{param00} 
    init{property00}
}
class P03Child00(param01:Int):Parent03(param01){
    val property01:Int by lazy{param01}
    init{property01}
}
