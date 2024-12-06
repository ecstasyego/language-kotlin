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



