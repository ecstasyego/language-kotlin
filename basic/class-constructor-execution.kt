// Execution: primary-init-property-secondary

class Sturcture{
    val property00 = {println("1")}()
    
    init{
        println("2")
    }
    
    val property01 = {println("3")}()
    val property02 = {println("4")}()
    
    constructor() {
        println("LAST")
    }
    
    val property03 = {println("-")}()
    
} 

Sturcture()
