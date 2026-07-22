package com.lazyee.rebasetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lazyee.rebasetest.ui.theme.RebaseTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RebaseTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge2]mother fucker2",
        modifier = modifier
    )
}

@Composable
fun MotherFucker(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1]mother fucker Widget",
        modifier = modifier
    )
}

@Composable
fun Leeorz1(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [rebase2] Hello",
        modifier = modifier
    )
}
@Composable
fun Leeorz2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [rebase2] Hello",
        modifier = modifier
    )
}


@Composable
fun MotherFucker2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1]mother fucker Widget",
        modifier = modifier
    )
}

@Composable
fun MotherFucker3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1]mother fucker Widget",
        modifier = modifier
    )
}

@Composable
fun MasterWidget(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}

@Composable
fun MasterWidget33(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}

@Composable
fun MasterWidget44(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}
@Composable
fun MasterWidget45(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}

@Composable
fun MasterWidget46(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}

@Composable
fun MasterWidget47(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}

@Composable
fun MasterWidget49999(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}

@Composable
fun MasterWidget49123(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! [merge1] Master Widget",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RebaseTestTheme {
        Greeting("Android")
    }
}