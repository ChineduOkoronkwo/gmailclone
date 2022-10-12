package com.ochinedu.gmailclone.model

data class Account(
    val icon: Int? = null,
    val username: String,
    val email: String,
    val unreadMails: Int
)