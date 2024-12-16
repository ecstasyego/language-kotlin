import java.io.File
import java.io.BufferedReader
import java.io.BufferedWriter

fun writeCSV() {
    val file = File("data.csv")
    val writer = BufferedWriter(file.writer())

    writer.write("Name,Age,Location\n")
    writer.write("John,25,USA\n")
    writer.write("Jane,30,Canada\n")
    writer.close()
}

fun readCSV(): MutableList<Any?>{
    val file = File("data.csv")
    val reader = BufferedReader(file.reader())
    val csv = mutableListOf<Any?>()

    reader.forEachLine { line ->
        csv.add(line.split(","))
    }
    return csv
}

writeCSV()
readCSV()
