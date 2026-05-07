package com.example.composearticlereader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticlereader.ui.theme.ComposeArticleReaderTheme
import com.example.composearticlereader.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleReaderTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Body()
                }
            }
        }
    }
}

@Composable
fun Body() {
    Column(
    ) {
         ImageApp()
         TitleArticle(text =  "Jetpack Compose tutorial\n", modifier = Modifier.padding(16.dp))
         TextApp(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",  modifier = Modifier.padding(16.dp))
         TextApp(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",  modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun TextApp(text: String, modifier: Modifier) {
    Text(text, modifier = modifier, textAlign = TextAlign.Justify)
}

@Composable
fun TitleArticle(text: String, modifier: Modifier) {
    Text(text, modifier = modifier, fontSize = 24.sp, fontWeight = FontWeight.Bold)
}

@Composable
fun ImageApp() {
    val image = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.padding(top = 60.dp).fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleReaderTheme {
    }
}