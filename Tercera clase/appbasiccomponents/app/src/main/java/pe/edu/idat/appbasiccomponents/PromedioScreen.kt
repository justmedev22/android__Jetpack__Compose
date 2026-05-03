package pe.edu.idat.appbasiccomponents

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.idat.appbasiccomponents.ui.theme.AppbasiccomponentsTheme
import kotlin.math.round

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppbasiccomponentsTheme {
        //MiColumnPrueba()
        //MiComponenteComplejo()

        //EjemploConstraint()
        PromedioScreen()

    }
}
@Composable
fun PromedioScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = 55.dp)) {

    /*
        var ec1 by rememberSaveable() {
            mutableSetOf("")
        }
    {
*/
    // creacion de variables para las notas
    var ec1 by rememberSaveable {
        mutableStateOf("")
    }
    var ec2 by rememberSaveable {
        mutableStateOf("")
    }
    var ec3 by rememberSaveable {
        mutableStateOf("")
    }
    var ef by rememberSaveable {
        mutableStateOf("")
    }




        // se crea la variable resultado
    var resultado by rememberSaveable {
        mutableStateOf("")
    }

        val colorTexto = if (resultado.contains("DESAPROBADO")) {
            Color.Red
        } else {
            Color.Green
        }


    Column {
            Text(text = "PROMEDIO DE NOTAS IDAT",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            // sp unidad de medida para textos
            // -- > este es el codigo normal para un espaciado tipo margin
            // Spacer(modifier = Modifier.size(16.dp))
            // se reemplazo el codigo con una funcion composable
            mySpace(16) // facilita el codigo

            // cajas de textbox para ingresar las notas
            OutlinedTextField(
                value = ec1,
                onValueChange = { ec1 = it },
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .fillMaxWidth(),
                    //.border(border = Color.Black),
                    //(color = Color.Black),
                label = { Text(text = "Ingrese EC 1",
                    style = TextStyle(fontSize = 15.sp,
                        color = Color.Black) ) },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number),
                colors = coloresCampoTexto(colorNota(ec1))
            )
            mySpace(16)
            OutlinedTextField(
            value = ec2,
            onValueChange = { ec2 = it },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            label = { Text(text = "Ingrese EC 2",
                style = TextStyle(fontSize = 15.sp,
                    color = Color.Black)) },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number),
                colors = coloresCampoTexto(colorNota(ec2))
            )
            mySpace(16)
            OutlinedTextField(
            value = ec3,
            onValueChange = { ec3 = it },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            label = { Text(text = "Ingrese EC 3",
                style = TextStyle(fontSize = 15.sp,
                    color = Color.Black)) },
            maxLines = 1,
            singleLine = true,

            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number),
                colors = coloresCampoTexto(colorNota(ec3))
                )
            mySpace(16)
            OutlinedTextField(
            value = ef,
            onValueChange = { ef = it },
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth(),
            label = { Text(text = "Ingrese EF",
                style = TextStyle(fontSize = 15.sp,
                    color = Color.Black)) },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
                ),  // parte para el color interno de los textos
                colors = coloresCampoTexto(colorNota(ef))
            )
            mySpace(16)
            Button(onClick = {
                resultado = calcularPromedio(ec1.toInt(), ec2.toInt(), ec3.toInt(), ef.toInt())
            },
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .fillMaxWidth()) {
                Text(text = "CALCULAR")
            }
            mySpace(16)
            Text(text = resultado,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp,
                    color = colorTexto)

            )
        }
    }

}
@Composable
fun mySpace(espacio: Int) {
    Spacer(modifier = Modifier.size(espacio.dp))
}


// funcion que hace el calculo de las notas
fun calcularPromedio(ec1: Int, ec2: Int, ec3: Int, ef: Int): String {
    var promedio = round((ec1 * 0.04) + (ec2 * 0.12) + (ec3 * 0.24) + (ef * 0.60))
    var resultado = "DESAPROBADO"
    if(promedio > 12.5) {
        resultado = "APROBADO"
    }

    return "Su promedio es $promedio usted se encuentra $resultado"
}


// codigo para el texto claro
@Composable
fun coloresCampoTexto(colorTexto: Color) = OutlinedTextFieldDefaults.colors(
    focusedTextColor = colorTexto,
    unfocusedTextColor = colorTexto,
    cursorColor = colorTexto,
    focusedBorderColor = Color.DarkGray,
    unfocusedBorderColor = Color.Black,
    focusedLabelColor = Color.Black,
    unfocusedLabelColor = Color.Black
)

// funcion para cambiar de color los numeros ingresados
@Composable
fun colorNota(nota: String): Color {
    val numero = nota.toIntOrNull()

    return when {
        numero == null -> Color.Black
        numero >= 13 -> Color.Green
        else -> Color.Red
    }
}