package com.example.applab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var loginButton: Button
    private lateinit var usernameTextEdit: EditText
    private lateinit var passwordTextEdit: EditText
    private lateinit var forgotPasswordTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.login_button)
        usernameTextEdit = findViewById(R.id.username_text)
        passwordTextEdit = findViewById(R.id.password_text)
        forgotPasswordTextView = findViewById(R.id.forgot_password_text)

        forgotPasswordTextView.setOnClickListener {
            Toast.makeText(this, "\"alexey\" + 1", Toast.LENGTH_SHORT).show()
        }

        loginButton.setOnClickListener {
            val text = if (usernameTextEdit.text.toString().isEmpty()) "Enter username"
                else if (passwordTextEdit.text.toString().isEmpty()) "Enter password"
                else if (usernameTextEdit.text.toString() == "alexey" && passwordTextEdit.text.toString() == "alexey1") "Logged in"
                else "Wrong username or password"

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}