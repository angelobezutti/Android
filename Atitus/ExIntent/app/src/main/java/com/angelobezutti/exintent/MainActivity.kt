package com.angelobezutti.exintent

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

//    companion object {
//        val CURRENT_TIME = "current_time"
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val message = editText.text.toString()

            // Cria uma Intent implícita para abrir a segunda tela
            val intent = Intent(this, OtherActivity::class.java)

            // Adiciona uma string extra na Intent com a mensagem digitada
            intent.putExtra("EXTRA_MESSAGE", message)
            startActivity(intent)
        }

//        val btnNext: Button = findViewById(R.id.btnNext)
//        btnNext.setOnClickListener {
//            val intent = Intent(
//                MainActivity@this,
//                OtherActivity::class.java
//            )
//
//            intent.putExtra(CURRENT_TIME, System.currentTimeMillis())
//            startActivity(intent)
//        }
//
//        var btnShare: Button = findViewById(R.id.btnShare)
//        btnShare.setOnClickListener {
//            val sendIntent = Intent().apply {
//                action = Intent.ACTION_SEND
//                putExtra(Intent.EXTRA_TEXT, "Hello Intents...")
//                type = "text/plain"
//            }
//
//            val title = resources.getString(R.string.chooser_title)
//            val chooser: Intent = Intent.createChooser(sendIntent, title)
//            if (sendIntent.resolveActivity(packageManager) != null) {
//                startActivity(chooser)
//            }
//        }
    }
}