package com.example.pertemuan2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan2.ui.theme.Pertemuan2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "Login",
            style = TextStyle(fontSize = 35.sp,
                fontWeight = FontWeight.Bold)
        )
        Text(text = "Ini adalah halaman login",
            style = TextStyle(fontSize = 10.sp,)
        )

        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier.padding(40.dp).size(200.dp))

        Text(text = "Nama",
            style = TextStyle(fontSize = 20.sp,),
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(text = "Muhammad Ilham Cahyadi",
            style = TextStyle(fontSize = 10.sp,),
            )

        Text(text = "20220141086",
            style = TextStyle(fontSize = 30.sp,
                fontWeight = FontWeight.Bold)
        )

        Image(painter = painterResource(id = R.drawable.ilham), contentDescription = null, modifier = Modifier.padding(40.dp).size(400.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pertemuan2Theme {
        Greeting()
    }
}