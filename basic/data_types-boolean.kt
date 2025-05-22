true
false

!true
!false

1 in 1..10
-1 in 1..10

1 !in 1..10
-1 !in 1..10

1 == 1
1 == 2

1 == 1 && 1 == 2
1 == 1 || 1 == 2

1 is Int
1 !is Int


// booleans from range object
(0..<10).map{it == 3}
(0..<10).map{true}
(0..<10).map{false}

// booleans from list object
List(10){ it == 3 }
List<Boolean>(10){true}
List<Boolean>(10){false}
List<Boolean?>(10){null}

MutableList(10){ it == 3 }
MutableList<Boolean>(10){true}
MutableList<Boolean>(10){false}
MutableList<Boolean?>(10){null}

// booleans from mapper
val mapper = mapOf(0 to false, 1 to true)
(0..<10).map{mapper[it]}
(0..<10).map{mapper[it] is Boolean}
(0..<10).map{mapper[it] !is Boolean}
