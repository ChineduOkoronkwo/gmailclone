package com.ochinedu.gmailclone.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ochinedu.gmailclone.mailList
import com.ochinedu.gmailclone.model.MailData

@Composable
fun MailList(paddingValues: PaddingValues) {
    Box(modifier = Modifier.padding(paddingValues)) {
        LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            items(mailList) {
                mailData ->
                MailItem(mailData = mailData)
            }
        }
    }
}

@Composable
fun MailItem(mailData: MailData, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    ) {
        Card(
            modifier = modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape),
            backgroundColor = Color.Gray
        ) {
            Text(
                text = mailData.userName[0].toString(),
                textAlign = TextAlign.Center, modifier = modifier.padding(8.dp)
            )
        }
        Column(modifier.weight(2.0f)) {
            Text(
                text = mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.body,
                fontSize = 14.sp,
            )
        }
        Column{
            Text(text=mailData.timestamp)
            IconButton(onClick = {}, modifier = Modifier
                .size(50.dp)
                .padding(top = 16.dp)) {
                Icon(imageVector = Icons.Outlined.StarOutline, contentDescription = "")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MailItemPreview() {
    MailItem(
        mailData = MailData(
            mailId = 4,
            userName = "Alfred",
            subject = "Android Development Course",
            body = "This is regarding the importance of the android development course to our team.",
            timestamp = "22:22"
        )
    )
}