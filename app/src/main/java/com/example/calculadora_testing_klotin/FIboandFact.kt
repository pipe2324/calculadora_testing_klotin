package com.example.calculadora_testing_klotin

class FiboandFact {
    fun calcularFactorial(num1: Double): Double {
        return if (num1 == 0.0) {
            1.0
        } else {
            num1 * calcularFactorial(num1 - 1)
        }
    }

    fun calcularFibonacci(num1: Double): Double {
        return if (num1 <= 2) {
            1.0
        } else {
            calcularFibonacci(num1 - 1) + calcularFibonacci(num1 - 2)
        }
    }
}
