class Structure01 {
    var name: String? = null
}

class Structure02 {
    var name: String? = null
        get() = field
}

class Structure03 {
    var name: String? = null
        set(value) {
            field = value
        }
}

class Structure04 {
    var name: String? = null
        get() = field 
        set(value) {
            field = value
        }
}

class Structure05 {
    var name: String? = null
        get() = "Unknown"
} // write-only

class Structure06 {
    var name: String? = null
        set(value) {
            field = field
        }
} // read-only


val structure = Structure06()
structure.name = "John"
structure.name
