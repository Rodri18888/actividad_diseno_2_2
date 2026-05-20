package com.sena.interfaz2.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp

@Composable

fun CirculosComponent(
    texto: String,
    diametro: Dp,
    colorFondo: Color,
    ColorTexto: Color = Color.Black,
){
    Box(
        modifier = Modifier
            .size(diametro)
            .clip(CircleShape)
            .background(colorFondo),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = texto,
            color = ColorTexto,
            fontSize = (diametro.value * 0.4).sp,
            fontWeight = FontWeight.Bold
        )
    }
}