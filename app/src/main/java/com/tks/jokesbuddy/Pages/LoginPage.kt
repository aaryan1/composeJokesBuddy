package com.tks.jokesbuddy.Pages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tks.jokesbuddy.R
import com.tks.jokesbuddy.ui.theme.*
import androidx.compose.material.Text as Text


@Composable fun LoginPage() {

   Surface(
      modifier = androidx.compose.ui.Modifier.fillMaxSize(),
      color = MaterialTheme.colors.BackgroundColor
   ) {

      Column(
         modifier = androidx.compose.ui.Modifier.fillMaxSize(),
         verticalArrangement = Arrangement.Top,
         horizontalAlignment = Alignment.CenterHorizontally
      ) {
         welcomeText()
        purposeImage()
         text_field(InputType = KeyboardType.Email,"E-mail address",IconImage = painterResource(id = R.drawable.ic_launcher_foreground))
         SignIn()
         ForgotPasswordText()
      }

   }
}
   @Composable fun welcomeText()
   {
      Text(text = "Welcome", color = Color.White, fontSize = 25.sp, modifier = Modifier.padding(top = 40.dp))
   }

@Composable fun purposeImage(){
   Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "LocationPin",
      modifier = Modifier.size(300.dp))
}
@Composable
fun text_field(InputType : KeyboardType,placeholder : String,IconImage : Painter){
   var TextFieldEmailState = remember{mutableStateOf("")}

   TextField(value = TextFieldEmailState.value,
      onValueChange = { newInput -> TextFieldEmailState.value = newInput },
      leadingIcon = {Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "email")},
      label = {Text(text = "E-mail address",color = MaterialTheme.colors.TextFieldTextColor)},
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
      modifier = Modifier
         .padding(top = 25.dp)
         .background(color = MaterialTheme.colors.TextFieldColor)
   )
   var TextFieldPasswordState = remember{mutableStateOf("")}
   TextField(value = TextFieldPasswordState.value,
      onValueChange = { newInput -> TextFieldPasswordState.value = newInput },
      leadingIcon = {Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "password")},
      label = {Text(text = "Password",color = MaterialTheme.colors.TextFieldTextColor)},
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
      modifier = Modifier
         .padding(top = 25.dp)
         .background(color = MaterialTheme.colors.TextFieldColor)
   )
}
@Composable
fun SignIn(){
   Button(onClick = {},modifier = Modifier
      .padding(top = 25.dp)
      .requiredWidth(277.dp)){
      Text(text = "Sign In")
   }
}
@Composable
fun ForgotPasswordText(){
   Text(text = "Forgot Password ?",color = MaterialTheme.colors.TextFieldTextColor,
      modifier = Modifier.padding(top = 70.dp))
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   JokesBuddyTheme {
      LoginPage()
   }
}




