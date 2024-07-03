package com.example.siliconandroidbatch2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.sp
import com.example.siliconandroidbatch2.ui.theme.SiliconAndroidBatch2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SiliconAndroidBatch2Theme {
                val LightBlue = Color(0xFFADD8E6)
                val Purple = Color(0xFF800080)

                val gradientColors = listOf(Color.Cyan, LightBlue, Purple, Color.Yellow)

                Text(
                    text = "As you can see here a gradient is applied, " +
                            " in the text " +
                            "to enhance the looks of the page",
                    fontSize = 30.sp,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            colors = gradientColors
                        )
                    )
                )
            }
        }
    }

    override fun onStart(){
        super.onStart()
        println("LifeCycle:- On Create Started")
    }

    override fun onResume(){
        super.onResume()
        println("LifeCycle:- On Resume Started")
    }

    override fun onPause(){
        super.onPause()
        println("LifeCycle:- On Pause called")
    }

    override fun onStop(){
        super.onStop()
        println("LifeCycle:- On Stop called")
    }

    override fun onDestroy(){
        super.onDestroy()
        println("LifeCycle:- On Destroy called")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SiliconAndroidBatch2Theme {
        Greeting("Android")
    }
}
