package com.kasanderh.myformapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_summary.*

class SummaryActivity : AppCompatActivity() {

    private lateinit var formData: FormData
    private lateinit var summaryText: String
//    private lateinit var summaryTextName: String
//    private lateinit var summaryTextEmail: String
//    private lateinit var summaryTextNumber: String
//    private lateinit var summaryTextTitle: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        displaySummary()



    }

    private fun displaySummary() {
        formData = intent.getSerializableExtra("FormData") as FormData

        summaryText = """
            Contact Name: 
            ${formData.jobTitle} ${formData.contactNameFirst} ${formData.contactNameLast}
            
            Contact Email:
            ${formData.contactEmail}
            
            Contact Number:
            ${formData.contactNumber}
            
            ${formData.passwordStrength()}            
        """.trimIndent()

        text_view_name.text = summaryText

//        summaryTextName = """
//            Contact Name:
//            ${formData.contactNameFirst} ${formData.contactNameLast}
//        """.trimIndent()
////        text_view_name.text = summaryTextName
//
//        summaryTextEmail = """
//            Contact Email:
//            ${formData.contactEmail}
//        """.trimIndent()
////        text_view_email.text = summaryTextEmail
//
//        summaryTextNumber = """
//            Contact Number:
//            ${formData.contactNumber}
//        """.trimIndent()
////        text_view_number.text = summaryTextNumber
//
//        summaryTextTitle = """
//            Title:
//            ${formData.jobTitle}
//        """.trimIndent()
////        text_view_title.text = summaryTextTitle
////
////        text_view_password.text = formData.passwordStrength()

    }
}