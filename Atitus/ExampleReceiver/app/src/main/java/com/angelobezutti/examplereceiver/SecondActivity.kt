package com.angelobezutti.examplereceiver

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var edtFirstNumber: EditText;
    lateinit var edtSecondNumber: EditText;
    lateinit var btnSum: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        edtFirstNumber = findViewById(R.id.edtFirstNumber);
        edtSecondNumber = findViewById(R.id.edtSecondNumber);
        btnSum = findViewById(R.id.edtFirstNumber);

        btnSum.setOnClickListener{
            var result = edtFirstNumber.text.toString().toInt() + edtSecondNumber.text.toString().toInt();
            val intent = Intent("my_sum");
            intent.putExtra("sum", result);
            sendBroadcast(intent);
        }

    }
}