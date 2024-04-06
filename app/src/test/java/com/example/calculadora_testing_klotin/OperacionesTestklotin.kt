package com.example.calculadora_testing_klotin

import junit.framework.TestCase

class OperacionesTestklotin : TestCase() {

    private lateinit var operaciones: Operaciones

    override fun setUp() {
        super.setUp()
        operaciones = Operaciones()
    }

// la variable val quiere decir que no se puede modificar su valor
    // fun es la funcion que se utiliza para realizar el respectivo test y  la operacion en este caso calcularSuma y asi para todas las demas
    fun testCalcularSuma() {
        val resultado = operaciones.calcularSuma(8.0, 2.0)
        assertEquals(10.0, resultado, 0.001)
    }

    fun testCalcularResta() {
        val resultado = operaciones.calcularResta(20.0, 7.0)
        assertEquals(13.0, resultado, 0.001)
    }

    fun testCalcularMultiplicacion() {
        val resultado = operaciones.calcularMultiplicacion(7.0, 7.0)
        assertEquals(49.0, resultado, 0.001)
    }

    fun testCalcularDivision() {
        try {
            operaciones.calcularDivision(4.0, 4.0)

        } catch (e: IllegalArgumentException) {
            // Éxito: Se lanzó la excepción esperada.
        }
    }
}