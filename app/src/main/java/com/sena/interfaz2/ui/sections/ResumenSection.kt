package com.sena.interfaz2.ui.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.interfaz2.ui.components.CirculosComponent



@Composable

fun ResumenSection(){
    Row() {



        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            CirculosComponent(
                texto = "8",
                diametro = 50.dp,
                colorFondo = Color(169, 196, 216),
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Pendientes",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }

        Spacer(modifier = Modifier.width(20.dp))

        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            CirculosComponent(
                texto = "3",
                diametro = 50.dp,
                colorFondo = Color(169, 216, 171)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Completadas",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }

        Spacer(modifier = Modifier.width(20.dp))

        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            CirculosComponent(
                texto = "2",
                diametro = 50.dp,
                colorFondo = Color(197, 169, 216)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "En progreso",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        }

    }
}