package com.ochinedu.gmailclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.ochinedu.gmailclone.R

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI()
    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier) {
    Card() {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {
            Row(modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Image(painter = painterResource(id = R.drawable.google),
                    contentDescription = "",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                )
            }
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp)) {
                Image(painter = painterResource(id = R.drawable.my_avator),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                )
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp, bottom = 16.dp)) {
                    Text(text = "Nene Okoronkwo", fontWeight = FontWeight.SemiBold)
                    Text(text = "nene@okoronkwo.com")
                }
                Text(text = "99+", modifier.padding(end = 16.dp))
            }
            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Card(modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, color = Color.Gray)
                ) {
                    Text(
                        text = "Google Account",
                        modifier.padding(8.dp),
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier.width(10.dp))
            }

            Divider(modifier.padding(top=16.dp))
        }
    }
}

@Composable
@Preview
fun AccountsDialogUIPreview() {
    AccountsDialogUI()
}