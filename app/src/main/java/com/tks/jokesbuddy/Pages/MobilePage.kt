package com.tks.jokesbuddy.Pages

import android.content.Context
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import com.tks.jokesbuddy.Extensions.ShowToast
import com.tks.jokesbuddy.Extensions.getActivity
import com.tks.jokesbuddy.Extensions.visible
import com.tks.jokesbuddy.R
import com.tks.jokesbuddy.ui.theme.BackgroundColor
import com.tks.jokesbuddy.ui.theme.TextFieldColor
import java.util.concurrent.TimeUnit

@Composable
fun MobilePage()
{
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize(), color = colors.BackgroundColor) {


        Column( modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            val textFieldMobile= remember { mutableStateOf("") }

            TextField(value = textFieldMobile.value, onValueChange ={newValue-> textFieldMobile.value=newValue},
                leadingIcon = { Image(painter = painterResource(id = R.drawable.ic_phone_24), contentDescription ="Mobile" )},
                label = { Text(text = stringResource(id = R.string.str_enter_mobile_number), color = Color.White)},
                modifier = Modifier
                    .padding(25.dp)
                    .background(color = MaterialTheme.colors.TextFieldColor).visible(true)

            )

            getPinButton()

        }
    }


}

@Composable
fun getPinButton()
{

    val context= LocalContext.current;
    Button(onClick = { sendPinRequest(context = context) },modifier = Modifier
        .padding(top = 25.dp)
        .requiredWidth(277.dp)){
        Text(text = stringResource(id = R.string.str_login))
    }
}

fun sendPinRequest(context: Context)
{
   /* val auth=FirebaseAuth.getInstance()
    val options = PhoneAuthOptions.newBuilder(auth)
        .setPhoneNumber("8439367525")       // Phone number to verify
        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
        .setActivity(context.getActivity()!!)                 // Activity (for callback binding)
        .setCallbacks(callbacks)          // OnVerificationStateChangedCallbacks
        .build()
    PhoneAuthProvider.verifyPhoneNumber(options)
    Log.d("Takendra","Request sent")*/

}
