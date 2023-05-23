package com.angelobezutti.exintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Calendar

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val textView = findViewById<TextView>(R.id.text_view)

        // Obtém a string extra da Intent enviada pela MainActivity
        val message = intent.getStringExtra("EXTRA_MESSAGE")

        // Exibe a mensagem recebida na TextView
        textView.text = message

//        intent.extras?.let { bundle ->
//            val currentTime = bundle.getLong(MainActivity.CURRENT_TIME)
//            val calendar = Calendar.getInstance()
//            calendar.timeInMillis = currentTime
//
//            val txtNow: TextView = findViewById(R.id.txtTime)
//            txtNow.text = "${calendar.get(Calendar.DAY_OF_MONTH)} - ${calendar.get(Calendar.MONTH) + 1} - ${calendar.get(Calendar.YEAR)}"
//        }
    }
}