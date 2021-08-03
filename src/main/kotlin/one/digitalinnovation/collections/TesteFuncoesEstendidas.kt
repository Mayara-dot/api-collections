package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println("________________")
    println(salarios.somatoria())

    println("__________________")
    println(salarios.media())
}