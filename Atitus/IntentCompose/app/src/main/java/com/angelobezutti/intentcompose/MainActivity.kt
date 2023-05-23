package com.angelobezutti.intentcompose

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angelobezutti.intentcompose.ui.theme.IntentComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Options(firstClick = {
                        val intent = Intent("QueFaseDuplaGrenal")
                        startActivity(intent)
                    }, secondClick = {
                        val intent = Intent("CUSTOM_SHOW_IMAGE")
                        intent.setDataAndType(Uri.parse(
                            "https://molo17.com/wp-content/uploads/2021/11/StudioCompose10.jpg"),
                            "image/*")
                        startActivity(intent)
                    }, thirdClick = {
                        val intent = Intent(Intent.ACTION_DIAL)
                        startActivity(intent)
                    })
                }
            }
        }
    }
}

@Composable
fun Options(
    firstClick : () -> (Unit),
    secondClick : () -> (Unit),
    thirdClick : () -> (Unit)) {
    Column(Modifier.padding(all = 24.dp)) {
        Button(onClick = {
            firstClick.invoke()
        }) {
            Text(text = "First Example")
        }
        Button(onClick = {
            secondClick.invoke()
        }) {
            Text(text = "Second Example")
        }
        Button(onClick = {
            thirdClick.invoke()
        }) {
            Text(text = "Third Example")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IntentComposeTheme {
        Options(firstClick = {},
            secondClick = {},
            thirdClick = {})
    }
}
