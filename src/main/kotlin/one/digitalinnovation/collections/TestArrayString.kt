package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Mayara"

    for (nome in nomes) {
        println(nome)
    }
    println("____________")
    nomes.sort()
    nomes.forEach { println(it) }

    println("____________")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}