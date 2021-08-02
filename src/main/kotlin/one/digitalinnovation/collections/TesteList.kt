package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Jõao", 1000.00, "CLT")
    val pedro = funcionario("Pedro", 800.00,"PJ")
    val maria = funcionario("Maria", 8000.00, "CLT")

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

data class funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
) {
    override fun toString(): String  =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
    } //tratamento da saída