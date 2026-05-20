package com.sena.interfaz2.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable

fun CirculosImageComponent(
    @DrawableRes icono: Int,
    diametro: Dp,
    colorFondo: Color
){
    Box(
        modifier = Modifier
            .size(diametro)
            .clip(CircleShape)
            .background(colorFondo),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id = icono),
            contentDescription = null,
            modifier = Modifier.size((diametro.value * 0.4).dp)
        )
    }
}