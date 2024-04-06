package com.example.calculadora_testing_klotin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /* Inicializamos nuestras variables las que vamos a llamar y utilizar en nuestra calculadora */
    /* para declarar variables en klotin utiliamos var para variables mutables las cuales sus valores pueden variar como las operaciones matematicas en esta caso*/
    /* lateinit var la utilizamos para inicializar variables que serán inicializadas más tarde*/
    private lateinit var buttonSum: Button
    private lateinit var buttonRes: Button
    private lateinit var buttonMul: Button
    private lateinit var buttonDiv: Button
    private lateinit var buttonFact: Button
    private lateinit var buttonFibo: Button
    private lateinit var editTextNum1: EditText
    private lateinit var editTextNum2: EditText
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Inicializar las variables de clase con las vistas reales */
        editTextNum1 = findViewById(R.id.texto1)
        editTextNum2 = findViewById(R.id.texto2)
        textViewResultado = findViewById(R.id.resultado)
        buttonSum = findViewById(R.id.buttonsum)
        buttonRes = findViewById(R.id.buttonres)
        buttonMul = findViewById(R.id.buttonmulti)
        buttonDiv = findViewById(R.id.buttondiv)
        buttonFact = findViewById(R.id.buttonfact)
        buttonFibo = findViewById(R.id.buttonfibo)

        // utilizamos onclickListener para el evento del click de cada botomn para las operaciones matematicas
        //Es una expresión lambda que llama a la función calcularSuma() cuando se hace clic en el botón.
        // la expresion lambda es uan forma concisa de definir una función anónima que puede ser tratada como un valor.o en este  caso la funcion de cada operacion en especifico
        buttonSum.setOnClickListener { calcularSuma() }
        buttonRes.setOnClickListener { calcularResta() }
        buttonMul.setOnClickListener { calcularMultiplicacion() }
        buttonDiv.setOnClickListener { calcularDivision() }
        buttonFact.setOnClickListener { calcularFactorial() }
        buttonFibo.setOnClickListener { calcularFibonacci() }
    }
    //fun decine una funcion en klotin en este caso calcularResta que es privada
    private fun calcularResta() {
        val texto1 = editTextNum1.text.toString()
        val texto2 = editTextNum2.text.toString()
        if (texto1.isEmpty() || texto2.isEmpty()) {
            textViewResultado.text = "Ingresa un número en el primer y segundo campo"
            return
        }
        val num1 = texto1.toDouble()
        val num2 = texto2.toDouble()
        val resultado = num1 - num2
        textViewResultado.text = resultado.toString()
    }

    private fun calcularMultiplicacion() {
        val texto1 = editTextNum1.text.toString()
        val texto2 = editTextNum2.text.toString()
        if (texto1.isEmpty() || texto2.isEmpty()) {
            textViewResultado.text = "Ingresa un número en el primer y segundo campo"
            return
        }
        val num1 = texto1.toDouble()
        val num2 = texto2.toDouble()
        val resultado = num1 * num2
        textViewResultado.text = resultado.toString()
    }

    private fun calcularSuma() {
        val texto1 = editTextNum1.text.toString()
        val texto2 = editTextNum2.text.toString()
        if (texto1.isEmpty() || texto2.isEmpty()) {
            textViewResultado.text = "Ingresa un número en el primer y segundo campo"
            return
        }
        val num1 = texto1.toDouble()
        val num2 = texto2.toDouble()
        val resultado = num1 + num2
        textViewResultado.text = resultado.toString()
    }

    @SuppressLint("SuspiciousIndentation")
    private fun calcularFibonacci() {
        val texto = editTextNum1.text.toString()
        if (texto.isEmpty()) {
            textViewResultado.text = "Ingresa un número solo en el primer campo"
            return
        }
        try {
            val num1 = texto.toDouble()
            val resultado = calcularFibonacci(num1)
            textViewResultado.text = resultado.toString()
        } catch (e: NumberFormatException) {
            // Manejo de la excepción si el texto no puede ser convertido a double
            textViewResultado.text = "Error: Entrada no válida"
        }
    }

    // Métodos convertidos a Kotlin

    private fun calcularFibonacci(n: Double): Double {
        return if (n <= 2) 1.0 else calcularFibonacci(n - 1) + calcularFibonacci(n - 2)
    }

    private fun calcularFactorial() {
        val texto = editTextNum1.text.toString()
        if (texto.isEmpty()) {
            textViewResultado.text = "Ingresa un número solo en el primer campo"
            return
        }
        try {
            val num1 = texto.toDouble()
            val resultado = calcularFactorial(num1)
            textViewResultado.text = resultado.toString()
        } catch (e: NumberFormatException) {
            textViewResultado.text = "Por favor, ingresa un número válido"
        }
    }

    private fun calcularFactorial(n: Double): Double {
        return if (n == 0.0) 1.0 else n * calcularFactorial(n - 1)
    }

    private fun calcularDivision() {
        val texto1 = editTextNum1.text.toString()
        val texto2 = editTextNum2.text.toString()
        if (texto1.isEmpty() || texto2.isEmpty()) {
            textViewResultado.text = "Ingresa un número en el primer y segundo campo"
            return
        }
        val num1 = texto1.toDouble()
        val num2 = texto2.toDouble()
        if (num2 != 0.0) {
            val resultado = num1 / num2
            textViewResultado.text = resultado.toString()
        }
    }
}