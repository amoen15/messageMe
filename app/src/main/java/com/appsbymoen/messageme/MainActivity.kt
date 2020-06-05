package com.appsbymoen.messageme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        regButton.setOnClickListener {

            val email = editTextTextEmailAddress.text.toString()
            val password = editTextTextPassword.text.toString()
            val user =editTextTextPersonName.text.toString()

            Log.d("MainActivity", "Name is:" + user )
            Log.d("MainActivity", "Email is:" + email)
            Log.d("MainActivity", "Password is:$password")

            val t = makeText(this, "user: $user Email: $email PW: $password", LENGTH_LONG)
            t.show()
        }

        tvAlreadyHaveAccount.setOnClickListener {
           val t = makeText(this, "You have account clicked!", LENGTH_LONG)
            t.show()


            //Launch the login activity

            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
        }


    }
}