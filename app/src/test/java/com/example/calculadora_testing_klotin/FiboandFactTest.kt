package com.example.calculadora_testing_klotin

import junit.framework.TestCase

class FiboandFactTest : TestCase() {

    private lateinit var fiboandFact: FiboandFact

    override fun setUp() {
        super.setUp()
        fiboandFact = FiboandFact()
    }

    /* hacemos el respectivo testing de las operaciones de finonacci y factorial en este caso nos quedo bien*/
    fun testCalcularFactorial() {
        try {
            fiboandFact.calcularFactorial(5.0)
        } catch (e: IllegalArgumentException) {
            // Éxito: Se lanzó la excepción esperada.
        }
    }

    fun testCalcularFibonacci() {
        try {
            fiboandFact.calcularFibonacci(6.0)
        } catch (e: IllegalArgumentException) {
            // Éxito: Se lanzó la excepción esperada.
        }
    }
}