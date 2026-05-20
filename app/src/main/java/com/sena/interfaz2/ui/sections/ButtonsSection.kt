package com.sena.interfaz2.ui.sections

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.interfaz2.R

@Composable

fun ButtonsSection(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Button(
            onClick = {},
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(
                    width = 1.dp,
                    color = Color(111, 0, 216)
                ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color(111, 0, 216)
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.delete),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "Eliminar completadas",
                fontSize = 10.sp
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Button(
            onClick = {},
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(111, 0, 216),
                contentColor = Color.White
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "Nueva tarea",
                fontSize = 10.sp
            )
        }
    }
}