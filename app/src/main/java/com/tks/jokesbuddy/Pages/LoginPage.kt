package com.tks.jokesbuddy.Pages

import android.content.Context
import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tks.jokesbuddy.R
import com.tks.jokesbuddy.showToast
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
      Text(text = stringResource(id = R.string.str_welcome), color = Color.White, fontSize = 25.sp, modifier = Modifier.padding(top = 40.dp))
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
      leadingIcon = {Image(painter = painterResource(id = R.drawable.ic_email_24), contentDescription = "email")},
      label = {Text(text = stringResource(id = R.string.str_email),color = MaterialTheme.colors.TextFieldTextColor)},
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
      modifier = Modifier
         .padding(top = 25.dp)
         .background(color = MaterialTheme.colors.TextFieldColor)
   )
   var TextFieldPasswordState = remember{mutableStateOf("")}
   TextField(value = TextFieldPasswordState.value,
      onValueChange = { newInput -> TextFieldPasswordState.value = newInput },
      leadingIcon = {Image(painter = painterResource(id = R.drawable.ic_email_24), contentDescription = "password")},
      label = {Text(text = stringResource(id = R.string.str_password),color = MaterialTheme.colors.TextFieldTextColor)},
      visualTransformation = PasswordVisualTransformation(),
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
      modifier = Modifier
         .padding(top = 25.dp)
         .background(color = MaterialTheme.colors.TextFieldColor)
   )

   var result = "incorrect"
   var textColor = Color.Red
   if (TextFieldPasswordState.value == "secret"){
      result = "correct"
      textColor = Color.White
   }

   Text(
      text = "Password : $result",
      fontSize = 22.sp,
      color = textColor,
      fontFamily = FontFamily.SansSerif,
      fontStyle = FontStyle.Italic,
      modifier = Modifier.padding(top = 25.dp)
   )
}
@Composable
fun SignIn(){
   val context= LocalContext.current;
   Button(onClick = { showToast(context = context, msg = "Login")},modifier = Modifier
      .padding(top = 25.dp)
      .requiredWidth(277.dp)){
      Text(text = stringResource(id = R.string.str_login))
   }
}
@Composable
fun ForgotPasswordText(){
   Text(text = stringResource(id = R.string.str_forgot_password),color = MaterialTheme.colors.TextFieldTextColor,
      modifier = Modifier.padding(top = 70.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   JokesBuddyTheme {
      LoginPage()
   }
}
