package com.tks.jokesbuddy.Extensions

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.widget.Toast
/** extension function on Context*/
fun Context.ShowToast(message: CharSequence) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

/**  extension function on String */
fun String.ShowToast(context: Context)= Toast.makeText(context, this, Toast.LENGTH_SHORT).show()


fun Context.getActivity(): Activity? {
    var currentContext = this
    while (currentContext is ContextWrapper) {
        if (currentContext is Activity) {
            return currentContext
        }
        currentContext = currentContext.baseContext
    }
    return null
}