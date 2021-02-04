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

    fun passwordStrength() = if(userPassword.length > 8) "The chosen password is strong." else "The chosen password is weak."


}
