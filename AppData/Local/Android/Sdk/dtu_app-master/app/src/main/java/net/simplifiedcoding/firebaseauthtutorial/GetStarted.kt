package net.simplifiedcoding.firebaseauthtutorial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import net.simplifiedcoding.firebaseauthtutorial.ui.LoginActivity
import net.simplifiedcoding.firebaseauthtutorial.ui.RegisterActivity

class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
    }

    fun LoginPage(view: View?) {
        // We will handle the click on the button here
        // Build an Intent to open another activity
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun RegisterPage(view: View?) {
        // We will handle the click on the button here
        // Build an Intent to open another activity
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

}