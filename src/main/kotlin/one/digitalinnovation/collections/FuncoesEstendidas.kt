package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
    add, valor -> add + valor
} //Extension function

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
//Extension function