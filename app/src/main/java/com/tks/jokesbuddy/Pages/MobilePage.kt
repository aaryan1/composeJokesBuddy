package com.tks.jokesbuddy.Pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.tks.jokesbuddy.Extensions.visible
import com.tks.jokesbuddy.R
import com.tks.jokesbuddy.ui.theme.BackgroundColor
import com.tks.jokesbuddy.ui.theme.TextFieldColor

@Composable
fun MobilePage()
{
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize(), color = colors.BackgroundColor) {


        Column( modifier = androidx.compose.ui.Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            val textFieldMobile= remember { mutableStateOf("") }

            TextField(value = textFieldMobile.value, onValueChange ={newValue-> textFieldMobile.value=newValue},
                leadingIcon = { Image(painter = painterResource(id = R.drawable.ic_phone_24), contentDescription ="Mobile" )},
                label = { Text(text = stringResource(id = R.string.str_enter_mobile_number))},
                modifier = Modifier
                    .padding(25.dp)
                    .background(color = MaterialTheme.colors.TextFieldColor).visible(true)

            )

            SignIn()

        }



    }


}