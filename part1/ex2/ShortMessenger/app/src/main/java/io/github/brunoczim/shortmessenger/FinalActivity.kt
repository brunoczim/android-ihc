package io.github.brunoczim.shortmessenger

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class FinalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val messageOutput: TextView = findViewById(R.id.messageSent)
        val message = intent.extras?.getString("message", "") ?: ""

        messageOutput.text = message
    }
}