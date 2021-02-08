package com.kasanderh.myformapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSpinner()
        setupButton()
    }

    private fun setupSpinner() {
        val spinnerValues: Array<String> = arrayOf("Miss", "Mrs", "Ms", "Mr", "Mx", "Dr", "Professor")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
        spinner_job_title.adapter = spinnerAdapter
    }

    private fun setupButton() {
        button_submit.setOnClickListener {
            onSubmitClick()
        }
    }

    private fun onSubmitClick() {

        val formData = FormData(
                spinner_job_title.selectedItem as String,
                edit_text_contact_name_first.text.toString(),
                edit_text_contact_name_last.text.toString(),
                edit_text_contact_email.text.toString(),
                edit_text_phone_number.text.toString(),
                edit_text_user_password.text.toString()
        )

        val summaryActivityIntent = Intent(this, SummaryActivity::class.java)
        summaryActivityIntent.putExtra("FormData", formData)
        startActivity(summaryActivityIntent)

    }
}