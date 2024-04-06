package com.example.calculadora_testing_klotin

class Operaciones {
    /* Creamos las operaciones respectivas para hacer los testings respectivos */
    // fun se utiliza para estarblecer la funcion de cada operacion en donde se retornan los valores double de cada operacion en este caso suma y asi para todas las de mas
    fun calcularSuma(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun calcularResta(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun calcularMultiplicacion(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun calcularDivision(num1: Double, num2: Double): Double {
        if (num2 != 0.0) {
            return num1 / num2
        } else {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
    }
}
