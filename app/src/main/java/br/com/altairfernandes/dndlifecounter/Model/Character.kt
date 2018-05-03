package br.com.altairfernandes.dndlifecounter.Model

import java.math.BigDecimal

data class  Character (val id: Int, val name: String, var totalPV: Int, var actualPV: Int) {
    fun damage(amount: Int) {
        this.actualPV = this.totalPV - amount
    }

    fun heal(amount: Int) {
        this.actualPV = this.totalPV + amount
    }
}

