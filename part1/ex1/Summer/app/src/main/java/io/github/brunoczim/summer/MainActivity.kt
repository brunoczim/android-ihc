package io.github.brunoczim.summer

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.brunoczim.summer.ui.theme.SummerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val number0: EditText = findViewById(R.id.number0)
            val number1: EditText = findViewById(R.id.number1)
            val output: TextView = findViewById(R.id.output)

            val parsed0 = number0.text.toString().toLongOrNull() ?: 0L
            val parsed1 = number1.text.toString().toLongOrNull() ?: 0L

            output.text = (parsed0 + parsed1).toString();
        }
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
    SummerTheme {
        Greeting("Android")
    }
}