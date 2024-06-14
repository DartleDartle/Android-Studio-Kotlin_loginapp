package com.example.logintoapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AccountDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_details)

        val username = intent.getStringExtra("username")
        val profileImageView = findViewById<ImageView>(R.id.profile_image)
        val usernameTextView = findViewById<TextView>(R.id.username_text)

        // Set the profile image and username (example with a static image and username)
        profileImageView.setImageResource(R.drawable.profile_image) // Assicurati di avere un'immagine chiamata profile_image in drawable
        usernameTextView.text = username
    }
}
