package com.example.newtestapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newtestapp.ui.theme.NewTestAppTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column(Modifier.fillMaxSize()) {
//                val color = remember {
//                    mutableStateOf(Color.Yellow)
//                }
//                ColorBox(
//                    Modifier
//                        .weight(1f)
//                        .fillMaxSize()
//                ){
//                    color.value = it
//                }
//                Box(modifier = Modifier
//                    .background(color.value)
//                    .weight(1f)
//                    .fillMaxSize()
//                )
//            }
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(Color(0xFF101010))
//                ) {
//                    Text(
//                        text = buildAnnotatedString {
//                            withStyle(
//                                style = SpanStyle(
//                                    color = Color.Green,
//                                    fontSize = 50.sp
//                                )
//                            ){
//                                append("J")
//                            }
//                            append("etpack")
//                            withStyle(
//                                style = SpanStyle(
//                                    color = Color.Green,
//                                    fontSize = 50.sp
//                                )
//                            ){
//                                append("C")
//                            }
//                            append("ompose")
//                        },
//                        color = Color.White,
//                        fontSize = 30.sp,
//                        fontWeight = FontWeight.Bold,
//                        fontStyle = FontStyle.Italic,
//                        textAlign = TextAlign.Center,
//                        textDecoration = TextDecoration.Underline
//                    )
//                }

//            Snackbar{
//                Text(text = "Hello world")
//            }
            val scrollState = rememberScrollState()

            LazyColumn{
                itemsIndexed(
                    listOf("this", "is", "Jetpack", "Compose")
                ){ index, string ->
                    Text(
                        text =string ,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                    )
                }
//                items(5000){
//
//                }
            }
        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updatecolor: (Color) -> Unit
){
    Box(
        modifier = modifier
            .background(Color.Red)
            .clickable {
                updatecolor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )
            }
    ){}
}
