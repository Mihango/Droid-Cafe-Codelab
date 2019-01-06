package com.techmashinani.droidcafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val message = intent.getStringExtra("message")
        text_message.text = message
    }

    fun onRadioButtonClicked(view: View) {
        Toast.makeText(this@OrderActivity, "Delivery clicked", Toast.LENGTH_LONG).show()
    }
}
