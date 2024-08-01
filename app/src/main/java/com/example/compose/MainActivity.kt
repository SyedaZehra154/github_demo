package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                BlueBackground()
            }
        }
    }
}

@Composable
fun BlueBackground() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        // Add any other UI elements here if needed
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        BlueBackground()
    }
}
