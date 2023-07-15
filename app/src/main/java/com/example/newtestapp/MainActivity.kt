package com.example.newtestapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.Dimension
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
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
//            val scrollState = rememberScrollState()
//
//            LazyColumn{
//                itemsIndexed(
//                    listOf("this", "is", "Jetpack", "Compose")
//                ){ index, string ->
//                    Text(
//                        text =string ,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
////                items(5000){
////
////                }
//            }

//            val constraints = ConstraintSet{
//                val greenBox = createRefFor("greenbox")
//                val redBox = createRefFor("redbox")
//
//                constrain(greenBox){
//                    top.linkTo(parent.top)
//                    start.linkTo(parent.start)
//                    width = androidx.constraintlayout.compose.Dimension.value(100.dp)
//                    height = androidx.constraintlayout.compose.Dimension.value(100.dp)
//                }
//                constrain(redBox){
//                    top.linkTo(parent.top)
//                    start.linkTo(greenBox.end)
//                    width = androidx.constraintlayout.compose.Dimension.value(100.dp)
//                    height = androidx.constraintlayout.compose.Dimension.value(100.dp)
//                }
//            }
//
//            ConstraintLayout(constraints, modifier =  Modifier.fillMaxSize()) {
//                Box(modifier = Modifier
//                    .background(Color.Green)
//                    .layoutId("greenBox")
//                )
//                Box(modifier = Modifier
//                    .background(Color.Red)
//                    .layoutId("redbox")
//                )
//
//
//            }

//            var sizeState by remember { mutableStateOf(200.dp) }
//            val size by animateDpAsState(targetValue = sizeState,
//            tween(
//                durationMillis = 1000
//            )
//                )
//            val infinitetransition = rememberInfiniteTransition()
//            val color by infinitetransition.animateColor(
//                initialValue = Color.Red,
//                targetValue = Color.Green,
//                animationSpec = infiniteRepeatable(
//                    tween(durationMillis = 2000),
//                    repeatMode = RepeatMode.Reverse
//                )
//            )
//            Box(modifier = Modifier
//                .size(size)
//                .background(color),
//                contentAlignment = Alignment.Center
//            )
//            {
//                Button(onClick = { sizeState += 50.dp }) {
//                    Text(text = "Increase Size")
//
//                }
//
//            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                CircularProgressBar(percentage = 0.8f, number = 100)
            }

        }
    }
}

@Composable
fun CircularProgressBar(
    percentage: Float,
    number: Int,
    fontSize: TextUnit = 28.sp,
    radius: Dp = 50.dp,
    color: Color = Color.Green,
    strokeWidth: Dp = 8.dp,
    animDuration: Int = 1000,
    animDelay: Int = 0
) {
    var animationPlayed by remember {
        mutableStateOf(false)
    }
    val curPercentage = animateFloatAsState(
        targetValue = if (animationPlayed) percentage else 0f,
        animationSpec = tween(
            durationMillis = animDuration,
            delayMillis = animDelay
        )
    )
    LaunchedEffect(key1 = true) {
        animationPlayed = true
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(radius * 2f)
    ) {
        Canvas(modifier = Modifier.size(radius * 2f)) {
            drawArc(
                color = color,
                -90f,
                360 * curPercentage.value,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )
        }
        androidx.compose.material3.Text(text = (curPercentage.value*number).toInt().toString(),
            color = Color.Black,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
            )
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updatecolor: (Color) -> Unit
) {
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
    ) {}
}
