package com.ochinedu.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.ochinedu.gmailclone.components.*
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
    val scrollState = rememberScrollState()
    val openDialog = remember{
        mutableStateOf(false)
    }
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, rememberCoroutineScope(), openDialog) },
        drawerContent = { GmailDrawerMenu(scrollState) },
        bottomBar = { HomeBottomMenu() },
        floatingActionButton = { GmailFab(scrollState) },
    ) {
        MailList(it, scrollState)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailcloneTheme {
        GmailApp()
    }
}