package com.kasanderh.myformapplication

import java.io.Serializable

data class FormData(
    val jobTitle: String?,
    val contactNameFirst: String,
    val contactNameLast: String,
    val contactEmail: String,
    val contactNumber: String,
    val userPassword: String

) : Serializable {


}
