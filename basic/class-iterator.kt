// Iterator examples
generateSequence(Array(10){}){it}.takeWhile { it as Int <= 5 }
generateSequence(List(10){}){it}.takeWhile { it as Int <= 5 }

// Iter01
class Iter01(var cnt:Int=0){
    fun next(): Iter01{
        cnt += 1
        return this
    }
}
generateSequence(Iter01()){it.next()}.takeWhile{ it.cnt <= 5 }

// Iter02
class Iter02(var cnt:Int=0)
fun Iter02.next():Iter02 {cnt += 1; return this}
generateSequence(Iter02()){it.next()}.takeWhile{ it.cnt <= 5 }
