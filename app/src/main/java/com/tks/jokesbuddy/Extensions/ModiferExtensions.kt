package com.tks.jokesbuddy.Extensions

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha


fun Modifier.visible(visibility:Boolean):Modifier
{
return if(visibility)
    then(alpha(1f))
   else
       then(alpha(0f))
}