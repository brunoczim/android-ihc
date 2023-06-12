package io.github.brunoczim.shortmessenger

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.sendButton)

        button.setOnClickListener {
            val messageInput: EditText = findViewById(R.id.messageInput)
            val intent = Intent(this, FinalActivity::class.java)
            intent.putExtra("message", messageInput.text.toString())
            startActivity(intent)
        }
    }
}