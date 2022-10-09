package com.ochinedu.gmailclone.model

data class MailData(
    val mailId: Int,
    val userName: String,
    val subject: String,
    val body: String,
    val timestamp: String = ""
)