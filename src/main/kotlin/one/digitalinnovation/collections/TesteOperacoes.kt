package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.00, 5000.00, 3500.00)

    for (salario in salarios) {
        println(salario)
    }

    println("____________________")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.00 }
    println("____________________")
    salariosMaiorQue2500.forEach { println(it) }

    println("____________________")
    println(salarios.count { it in 2000.0..5000.00 })

    println("____________________")
    println(salarios.find { it == 3500.00 })
    println("____________________")
    println(salarios.find { it == 500.00 })

    println("____________________")
    println(salarios.any { it == 1000.00 })
    println("____________________")
    println(salarios.any { it == 500.00 })
}