tailrec fun denestingPair( nestedRow: Any, unnestedRow: MutableList<Any?> = mutableListOf<Any?>() ): MutableList<Any?> {
    if (nestedRow is Pair<*, *>) {
        if (nestedRow.first is Pair<*, *>){
            unnestedRow.add(nestedRow.second)
            return denestingPair(nestedRow.first as Pair<*, *>, unnestedRow)
        } else {
            unnestedRow.add(nestedRow.second)
            unnestedRow.add(nestedRow.first)
        }
    } 
    return unnestedRow.reversed().toMutableList()
}

denestingPair(1 to 2 to 3 to 4 to 5)
