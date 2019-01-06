package com.techmashinani.droidcafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
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
        when(view.id) {
            R.id.radio_same_day -> Toast.makeText(this@OrderActivity, (view as RadioButton).text, Toast.LENGTH_LONG).show()
            R.id.radio_next -> Toast.makeText(this@OrderActivity, (view as RadioButton).text, Toast.LENGTH_LONG).show()
            R.id.radio_pick -> Toast.makeText(this@OrderActivity, (view as RadioButton).text, Toast.LENGTH_LONG).show()
        }
    }
}
