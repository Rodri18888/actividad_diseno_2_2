package com.sena.interfaz2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.interfaz2.ui.components.CirculosImageComponent
import com.sena.interfaz2.ui.sections.ButtonsSection
import com.sena.interfaz2.ui.sections.ClipboardSection
import com.sena.interfaz2.ui.sections.ProximasTareasSection
import com.sena.interfaz2.ui.sections.ResumenSection
import com.sena.interfaz2.ui.sections.TareasSection

@Composable

fun Screen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            TareasSection()

            Spacer(modifier = Modifier.height(20.dp))

            ClipboardSection()

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Resumen",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier.fillMaxWidth()
            )

            ResumenSection()

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Proximas tareas",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier.fillMaxWidth()
            )

            ProximasTareasSection()

            Spacer(modifier = Modifier.height(40.dp))

            ButtonsSection()

        }

    }
}



