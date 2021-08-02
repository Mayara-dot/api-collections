package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Jõao", 1000.00, "CLT")
    val pedro = Funcionario("Pedro", 800.00,"PJ")
    val maria = Funcionario("Maria", 8000.00, "CLT")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach { println(it) }

    println("_____________")
    println(funcionarios.find { it.nome == "Maria" })

    println("_____________")
    funcionarios
        .sortedBy { it.salario } //imprime de acordo com a ordem decrescente do parâmetro
        .forEach { println(it) }

    println("_____________")
    funcionarios
        .groupBy { it.tipoContratacao } //agrupa por um tipo de parâmetro
        .forEach{ println(it)}

    //esse tipo de lista não conseguimos fazer mudanças
}

