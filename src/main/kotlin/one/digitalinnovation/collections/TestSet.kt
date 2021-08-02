package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Jõao", 1000.00, "CLT")
    val pedro = Funcionario("Pedro", 800.00, "PJ")
    val maria = Funcionario("Maria", 8000.00, "CLT")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2) //faz a união de conjuntos
    resultUnion.forEach { println(it) }

    println("______________________")
    val funcionarios3 = setOf(joao, pedro, maria) //retira (subtrai) o conjunto
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("______________________")
    val resultIntersect = funcionarios3.intersect(funcionarios2) //faz a intersecção de conjuntos
    resultIntersect.forEach { println(it) }


}