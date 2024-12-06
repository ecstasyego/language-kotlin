/* Scope Function : Reference : Return : Usage 
let: it: last expression in block: nullable object
run: this: last expression in block: object
with: this: last expression in block: object
apply: this: self: object initialization
also: it: self: object debuging
*/

val str:String = "ABC"

str.let{it}
str.run{this}
str.apply{this}
with(str){this}
str.also{it}



