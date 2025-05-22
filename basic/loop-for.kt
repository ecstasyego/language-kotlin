// range object
1..10
1..<11
1 until 11
10 downTo 1

for (i in 1..10) {
    println(i)
}

for (i in 1..10 step 1) {
    println(i)
}

for (i in 1 until 11) {
    println(i)
}

for (i in 1 until 11 step 1) {
    println(i)
}

// reverse
for (i in 10 downTo 1) {
    println(i)
}

for (i in 10 downTo 1 step 1) {
    println(i)
}


// continue and break
for (i in 1..10) {
    if (i % 2 == 0) {continue}
    else if ( i == 9) {break}
    else {println(i)}
}
