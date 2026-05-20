package com.sena.interfaz2.ui.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.interfaz2.R
import com.sena.interfaz2.ui.components.CirculosComponent
import com.sena.interfaz2.ui.components.CirculosImageComponent

@Composable

fun ProximasTareasSection(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CirculosImageComponent(
            icono = R.drawable.web,
            diametro = 40.dp,
            colorFondo = Color(169, 196, 216)
        )
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
            Text(
                text = "Estudiar Jetpack Compose",
                modifier = Modifier.width(180.dp),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Repasar layouts basicos",
                    modifier = Modifier.width(180.dp),
                    fontSize = 12.sp
                )
            }
        }

        Spacer(modifier = Modifier.width(30.dp))
        Text(
            text = "1 h",
            textAlign = TextAlign.Center,
            fontSize = 12.sp
        )
        Spacer(modifier = Modifier.width(5.dp))
        CirculosComponent(
            texto = "",
            diametro = 10.dp,
            colorFondo = Color.Blue
        )
    }
    Spacer(modifier = Modifier.height(2.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CirculosImageComponent(
            icono = R.drawable.book,
            diametro = 40.dp,
            colorFondo = Color(169, 216, 171)
        )
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Leer documentacion",
                    modifier = Modifier.width(180.dp),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Column, Row y Box",
                    modifier = Modifier.width(180.dp),
                    fontSize = 12.sp
                )
            }
        }

        Spacer(modifier = Modifier.width(30.dp))
        Text(
            text = "30 min",
            textAlign = TextAlign.Center,
            fontSize = 12.sp
        )
        Spacer(modifier = Modifier.width(2.dp))
        CirculosComponent(
            texto = "",
            diametro = 10.dp,
            colorFondo = Color.Green
        )
    }
    Spacer(modifier = Modifier.height(5.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CirculosImageComponent(
            icono = R.drawable.brackets,
            diametro = 40.dp,
            colorFondo = Color(216, 213, 169)
        )
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Practicar UI",
                    modifier = Modifier.width(180.dp),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "Crear 3 pantallas distintas",
                    modifier = Modifier.width(180.dp),
                    fontSize = 12.sp
                )
            }
        }

        Spacer(modifier = Modifier.width(30.dp))
        Text(
            text = "45 min",
            textAlign = TextAlign.Center,
            fontSize = 12.sp
        )
        Spacer(modifier = Modifier.width(5.dp))
        CirculosComponent(
            texto = "",
            diametro = 10.dp,
            colorFondo = Color.Yellow
        )
    }
}