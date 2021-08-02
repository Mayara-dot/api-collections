package one.digitalinnovation.collections

fun main() { //mpa é uma coleção de chaves e valores
    val pair: Pair<String, Double> = Pair("João", 100.00)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2= mapOf( // essa interação é de recurso infix
        "Pedro" to 2500.00,
        "Maria" to 8000.50
    ) //outra forma de sintaxe
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}