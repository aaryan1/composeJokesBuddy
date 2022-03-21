package com.tks.jokesbuddy.Pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tks.jokesbuddy.ui.theme.BackgroundColor
import org.intellij.lang.annotations.JdkConstants


@Composable
fun profilePage()
{
      Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.BackgroundColor) {

       Column(Modifier.fillMaxSize(),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally) {

       }
      }
}
@Preview(showBackground = true)
@Composable
fun profilePage_Preview()
{
    profilePage()
}