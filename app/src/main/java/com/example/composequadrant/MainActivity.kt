package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    group()
                }
            }
        }
    }
}

@Composable
fun group(){

    Column(){
        Row(modifier = Modifier.weight(0.5F)) {
            Surface(modifier = Modifier.weight(0.5F)) {
                section(
                    androidx.compose.ui.graphics.Color.Green,
                    "Text composable",
                    "Displays text and follows Material Design guidelines."
                )
            }
            Surface(modifier = Modifier.weight(0.5F)) {
                section(
                    androidx.compose.ui.graphics.Color.Yellow,
                    "Image composable",
                    "Creates a composable that lays out and draws a given Painter class object."
                )
            }
        }
        Row(modifier = Modifier.weight(0.5F)) {
            Surface(modifier = Modifier.weight(0.5F)) {
                section(
                    androidx.compose.ui.graphics.Color.Cyan,
                    "Row composable",
                    "A layout composable that places its children in a horizontal sequence."
                )
            }
            Surface(modifier = Modifier.weight(0.5F)) {
                section(
                    androidx.compose.ui.graphics.Color.LightGray,
                    "Column composable",
                    "A layout composable that places its children in a vertical sequence."
                )
            }
        }
    }


}

@Composable
fun section(color: Color, title: String, text: String) {
    Surface(color = color, modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(all = 16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text=title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16. dp)
            )
            Text(
                text=text,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        group()
    }
}