package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(5,10,7,8,29,4)
    for (valor in values) {
        println(valor)
    }
    println("___________")
    values.sort()
    values.forEach {
        println(it)
    }


}