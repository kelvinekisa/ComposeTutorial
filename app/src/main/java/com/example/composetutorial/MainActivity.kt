package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { // defines the activities layout where composable functions are called.
            Text("Hello world!")
//            MessageCard("Kelvin EKisa")
            MessageCard(Message("Kelvin", "Android Jetpack"))
        }
    }
}
// Define a composable function


// layout
data class Message(val author: String, val body: String)

//@Composable
//fun MessageCard(name: String) {
//    Text(text = "Hello $name!",
//        color = Color.Red
//    )
//}
@Composable
fun MessageCard(msg: Message) {
    Text(text = msg.author)
    Text(text = msg.body)
}

// preview your composable annotation

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Kelvin", "Hey, take a look at jetpack compose")
    )
}