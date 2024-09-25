package com.cscorner.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme()
        }
    }
}

class GreetingCardTheme {

}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Text()
    }
}

fun Text() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme()
}