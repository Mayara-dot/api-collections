package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 5
    values[1] = 1
    values[2] = 4
    values[3] = 7
    values[4] = 10

    for (valor in values) {
        println(valor)
    }
    println("___________")

    values.forEach {
        println(it)
    }
    println("___________")

    values.forEach { valor ->
        println(valor)
    }
    println("___________")
    values.sort()
    for(valor in values) {
        println(valor)
    }




}