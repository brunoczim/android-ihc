package io.github.brunoczim.summer

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

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