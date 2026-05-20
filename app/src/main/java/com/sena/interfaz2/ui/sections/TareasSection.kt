package com.sena.interfaz2.ui.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.interfaz2.R

@Composable

fun TareasSection(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                "Mis Tareas",
                textAlign = TextAlign.Left,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                "Hoy es un buen dia para codificar",
                textAlign = TextAlign.Left,
                fontSize = 15.sp
            )
        }

        Image(
            painter = painterResource(id = R.drawable.sun),
            contentDescription = null,
            modifier = Modifier.size(50.dp),
            contentScale = ContentScale.Fit
        )
    }
}