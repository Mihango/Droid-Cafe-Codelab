package com.techmashinani.droidcafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val message = intent.getStringExtra("message")
        text_message.text = message

        setup()
    }

    private fun setup() {
        val data = resources.getStringArray(R.array.phone_types)
        val adapter = ArrayAdapter<String>(this@OrderActivity, android.R.layout.simple_spinner_item, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_phone.adapter = adapter
        spinner_phone.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@OrderActivity, data[position], Toast.LENGTH_LONG).show()
            }

        }
    }

    fun onRadioButtonClicked(view: View) {
        when(view.id) {
            R.id.radio_same_day -> Toast.makeText(this@OrderActivity, (view as RadioButton).text, Toast.LENGTH_LONG).show()
            R.id.radio_next -> Toast.makeText(this@OrderActivity, (view as RadioButton).text, Toast.LENGTH_LONG).show()
            R.id.radio_pick -> Toast.makeText(this@OrderActivity, (view as RadioButton).text, Toast.LENGTH_LONG).show()
        }
    }
}
