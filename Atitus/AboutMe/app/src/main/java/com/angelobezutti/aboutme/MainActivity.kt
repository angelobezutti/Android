package com.angelobezutti.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var txtOp1: TextInputEditText
    private lateinit var txtOp2: TextInputEditText
    private lateinit var btnSoma: Button
    private lateinit var btnMultiplicacao: Button
    private lateinit var btnDivisao: Button
    private lateinit var btnSubtracao: Button
    private lateinit var container: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtOp1 = findViewById(R.id.txtOp1)
        txtOp2 = findViewById(R.id.txtOp2)

        btnSoma = findViewById(R.id.btnSoma)
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao)
        btnDivisao = findViewById(R.id.btnDivisao)
        btnSubtracao = findViewById(R.id.btnSubtracao)

        btnSoma.setOnClickListener {
            var op1 = txtOp1.text.toString().toInt()
            var op2 = txtOp2.text.toString().toInt()
            var result = op1.plus(op2)
            showResult(result)
        }
        btnMultiplicacao.setOnClickListener {
            var op1 = txtOp1.text.toString().toInt()
            var op2 = txtOp2.text.toString().toInt()
            var result = op1 * op2
            showResult(result)
        }
        btnDivisao.setOnClickListener {
            var op1 = txtOp1.text.toString().toInt()
            var op2 = txtOp2.text.toString().toInt()
            var result = op1 / op2
            showResult(result)
        }
        btnSubtracao.setOnClickListener {
            var op1 = txtOp1.text.toString().toInt()
            var op2 = txtOp2.text.toString().toInt()
            var result = op1 - op2
            showResult(result)
        }

    }

    private fun showResult(result: Int){
        MaterialAlertDialogBuilder(
            this,
            com.google.android.material.R.style.ThemeOverlay_MaterialComponents_MaterialAlertDialog)
            .setMessage("Resultado: $result")
            .setPositiveButton("OK") { _, _ ->
                // Respond to positive button press
            }
            .show()
    }
}