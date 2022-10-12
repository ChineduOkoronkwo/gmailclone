package com.ochinedu.gmailclone

import com.ochinedu.gmailclone.model.Account
import com.ochinedu.gmailclone.model.MailData

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Nathan",
        subject = "Weekly Android News",
        body = "Hello Christy we have got exciting addition to the android api",
        timestamp = "20:10"
    ),
    MailData(
        mailId = 2,
        userName = "Onyinyechi",
        subject = "Job Application",
        body = "This is regarding a job opportunity I found on your website.",
        timestamp = "20:10"
    ),
    MailData(
        mailId = 3,
        userName = "Jayamma",
        subject = "Flutter News",
        body = "Hello Jay we have got exciting addition  to the Flutter api",
        timestamp = "20:10"
    ),
    MailData(
        mailId = 4,
        userName = "Chinedum",
        subject = "Email regarding job opportunity",
        body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timestamp = "21:10"
    ),
    MailData(
        mailId = 5,
        userName = "Sam",
        subject = "New Event has been created",
        body = "A new event has been added to your dashboard go check it out",
        timestamp = "20:10"
    ),
    MailData(
        mailId = 6,
        userName = "Medium",
        subject = "JetPack compose for beginners",
        body = "This article will teach you all the basics of jetpack compose.",
        timestamp = "20:10"
    ),
    MailData(
        mailId = 7,
        userName = "Netflix",
        subject = "A new Device is using your account",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timestamp = "20:10"
    ),
    MailData(
        mailId = 8,
        userName = "Collins",
        subject = "A request for partnership",
        body = "This is a follow up email about the partnership request",
        timestamp = "20:50"
    ),
    MailData(
        mailId = 9,
        userName = "Amazon",
        subject = "Your account has been created",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timestamp = "20:10"
    ),
    MailData(
        mailId = 10,
        userName = "Jobs",
        subject = "New opportunity that suits you",
        body = "We have an opening that suits your profile kindly check it out and indicate your interest",
        timestamp = "20:10"
    )
)

val accountsList = listOf<Account>(
    Account(icon = R.drawable.my_avator, username = "Alfred Okoronkwo", email = "alfred.okoronkwo@gmail.com", unreadMails = 54),
    Account(username = "Nene Okoronkwo", email = "nene.okoronkwo@cmail.com", unreadMails = 80),
    Account(username = "Jayamma Okoronkwo", email = "jaylulu@cmail.com", unreadMails = 66),
    Account(username = "Nathan Okoronkwo", email = "nebubu@cmail.com", unreadMails = 10),
    Account(username = "Chloe Okoronkwo", email = "kloklo@cmail.com", unreadMails = 73)
)