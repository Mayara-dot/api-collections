package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Jõao", 1000.00, "CLT")
    val pedro = Funcionario("Pedro", 800.00, "PJ")
    val maria = Funcionario("Maria", 8000.00, "CLT")

    val repositorio = Repositorio<Funcionario>() //<T>

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(joao.nome))

    println("_______________________")
    repositorio.findAll().forEach { println(it) }

    println("______________________")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}