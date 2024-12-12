class Collection<T>(val items: List<T>) {
    operator fun get(index: Int): T {
        return items[index]
    }

    operator fun set(index: Int, value: T) {
        items.toMutableList()[index] = value
    }
}

val collection = Collection(listOf("A", "B", "C"))
collection[0]
collection[1]
collection[2]
