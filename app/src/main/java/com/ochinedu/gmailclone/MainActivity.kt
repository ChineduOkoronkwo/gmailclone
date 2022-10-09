package com.ochinedu.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.ochinedu.gmailclone.components.GmailDrawerMenu
import com.ochinedu.gmailclone.components.HomeAppBar
import com.ochinedu.gmailclone.components.HomeBottomMenu
import com.ochinedu.gmailclone.components.MailList
import com.ochinedu.gmailclone.ui.theme.GmailcloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailcloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    val scaffoldState = rememberScaffoldState()
    Scaffold(scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, rememberCoroutineScope()) },
        drawerContent = { GmailDrawerMenu(rememberScrollState()) },
        bottomBar = { HomeBottomMenu()}
    ) {
        MailList(it)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailcloneTheme {
        GmailApp()
    }
}