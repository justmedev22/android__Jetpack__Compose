package pe.edu.idat.appotroscomponentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.idat.appotroscomponentes.ui.theme.AppOtrosComponentesTheme


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppOtrosComponentesTheme {
        // desde aqui se puede añadir row y column

        Column(Modifier.padding(top = 25.dp)) {
            ejemploBadgeBox()
            EjemploDivider()
            EjemploCard()
        }

    }
}

@Composable  // RADIO BUTTON
fun EjemploRadioButton(nombre: String, onItemSelected:(String)->Unit){
    Column(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)) {
            RadioButton(selected = nombre == "Ciclo 1",
                onClick = { onItemSelected ("Ciclo 1")  })
            Text(text = "Ciclo 1", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)) {
            RadioButton(selected = nombre == "Ciclo 2",
                onClick = { onItemSelected ("Ciclo 2")  })
            Text(text = "Ciclo 2", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)) {
            RadioButton(selected = nombre == "Ciclo 3",
                onClick = { onItemSelected ("Ciclo 3")  })
            Text(text = "Ciclo 3", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)) {
            RadioButton(selected = nombre == "Ciclo 4",
                onClick = { onItemSelected ("Ciclo 4")  })
            Text(text = "Ciclo 4", Modifier.padding(top = 10.dp))
        }
    }
}


@Composable // forma un slider pero mas definido con niveles
fun EEjemploSlider2() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var posicion by rememberSaveable {
            mutableStateOf(0f)
        }
        Slider(value = posicion, onValueChange = { posicion = it },
            valueRange = 0f..10f,
            steps = 9) // aca colocas los niveles
        Text(text = posicion.toString())
    }
}


@Composable  // esto arma una especie de volumen o una barra qque aumenta  y disminuye
fun EjemploSlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        var posicion by rememberSaveable {
            mutableStateOf(0f)
        }
        Slider(value = posicion, onValueChange = {posicion = it})
        Text(text = posicion.toString())
    }
}


@Composable   // Componente DROPDOWN
fun EjemploCombo() {
    // al trabajar con outlinedtextfield debemos trabajar con
    // by rememberSaveable  // esto es para completar el codigo
    var texto by rememberSaveable {
        mutableStateOf( "")
    }
    var expandir by rememberSaveable {
        mutableStateOf(false)
    }

    val golosinas = listOf("Chocolates","Caramelos","Pastelitos","Grageas","Mashmellow")
    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(value = texto, onValueChange = {texto = it},
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expandir = true }
                .fillMaxWidth()
        )
        DropdownMenu(expanded = expandir,
            onDismissRequest = { expandir = false},
            Modifier.background(Color.White)) {
            golosinas.forEach {
                itemGolosina ->
                DropdownMenuItem(
                    text = { Text(text = itemGolosina, modifier = Modifier,
                    color = Color.Black)  },
                    onClick = {
                        expandir = false
                        texto = itemGolosina
                    }, Modifier.fillMaxWidth())
            }
        }
    }
}


@Composable // revisar en gpt todo el codigo
fun EjemploCard() {  // el card es un componente donde se puede armar cards xd
    Card (modifier = Modifier.fillMaxWidth()
        .padding(12.dp)
        .size(width = 240.dp, height = 150.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Green
            ),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(1.dp, Color.Blue)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(text = "Hola Card")
            Text(text = "Hola Card")
            Text(text = "Hola Card")
        }
    }
}


@Composable  // genera un espacio parecido al spacer
fun EjemploDivider() {  // una linea que divide , es un componente
    Divider(
        Modifier
            .fillMaxWidth()
            .padding(top = 14.dp),
        color = Color.Red
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable  // genera como una notifiacion o la ilusion similar
fun ejemploBadgeBox() {  // se usa como para una alerta o notificacion


    BadgedBox(badge = {
        Badge( // la aleerta
            containerColor = Color.Red,
            contentColor = Color.White
        ) {  // el detalle o contenido
            Text(text = "26")
        }
    }, Modifier.padding(16.dp)) {  // el icono de abajo de la app , tiktok , ig
        Icon(Icons.Filled.Star, contentDescription = "Favoritos")
    }
}

