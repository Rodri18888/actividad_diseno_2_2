package com.sena.interfaz2.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sena.interfaz2.R

@Composable

fun ClipboardSection(){
    Box(
        modifier = Modifier.size(220.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.clipboard),
            contentDescription = null,
            modifier = Modifier.size(220.dp),
            contentScale = ContentScale.Fit
        )
    }
}
