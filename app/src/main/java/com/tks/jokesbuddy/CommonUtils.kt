package com.tks.jokesbuddy

import android.content.Context
import android.widget.Toast


public fun showToast(context: Context, msg:String)
{
    Toast.makeText(context,msg, Toast.LENGTH_LONG).show()
}