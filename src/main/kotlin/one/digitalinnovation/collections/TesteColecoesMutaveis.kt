package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Jõao", 1000.00, "CLT")
    val pedro = Funcionario("Pedro", 800.00, "PJ")
    val maria = Funcionario("Maria", 8000.00, "CLT")


    val funcionarios = mutableListOf(joao, maria) //a lista pode ser alterada
    funcionarios.forEach { println(it) }

    println("___________LIST_______________")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("______________________________")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("_____________SET______________")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{ println(it)}

    println("______________________________")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("______________________________")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}
