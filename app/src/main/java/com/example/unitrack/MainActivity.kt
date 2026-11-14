package com.example.unitrack

import android.content.ClipData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unitrack.ui.theme.UniTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun App() {
    var counter by rememberSaveable { mutableStateOf( value=0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                painter = painterResource(id = R.drawable.d_cyberpunk),
                contentDescription = "D"
            )

            Text(
                text = "Proyecto aplicaciones moviles",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Row(modifier = Modifier.padding(top = 8.dp)){
                Image(
                    painter = painterResource(id = R.drawable.favorite1),
                    contentDescription = "Like",
                    modifier = Modifier.clickable{counter ++}

                )
                Text(counter.toString(), color = Color.White, modifier = Modifier.padding(start = 4.dp ))
            }

            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp)


            ) {

                item {
                    Text(
                        text = "Stack:",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                    )
                    Text(
                        text = "C++",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                        )
                    Text(
                        text = "Kotlin",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                        )
                    Text(
                        text = "Java",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                        )
                    Text(
                        text = "PHP",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                        )
                    Text(
                        text = "CCS",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                        )
                    Text(
                        text = "Python",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                        )
                    Text(
                        text = "C#",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp))

                    Text(
                        text = "JavaScript",
                        color = Color.White,
                        modifier = Modifier.padding(16.dp)

                        )

                }

            }
        }

    }

}