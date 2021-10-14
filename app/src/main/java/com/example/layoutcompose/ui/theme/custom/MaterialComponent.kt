package com.example.layoutcompose.ui.theme.custom

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutcompose.ui.theme.LayoutComposeTheme


@Composable
fun LayoutCodeLab() {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "Layout app",
                )
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Favorite,contentDescription = null)
                }
            }
        )

    }) { innerPadding ->

        BodyContent(Modifier.padding(innerPadding))

    }
}

@Composable
private fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Text(text = "hi lokesh ")
        Text(text = "hi lokesh ")
    }
}

@Preview
@Composable
fun preview() {
    androidx.compose.material.Surface() {
        LayoutComposeTheme {
            LayoutCodeLab()
        }
    }
}