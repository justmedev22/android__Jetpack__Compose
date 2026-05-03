package pe.edu.idat.appbasiccomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.idat.appbasiccomponents.ui.theme.AppbasiccomponentsTheme

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
        .padding(top = 25.dp))

    /*
        var ec1 by rememberSaveable() {
            mutableSetOf("")
        }
  var ec1 by rememberSaveable {
        mutableStateOf("")
    }

    {
      
*/
    Column {
            Text(text = "PROMEDIO DE NOTAS IDAT",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            // sp unidad de medida para textos
            Spacer(modifier = Modifier.size(16.dp))
            OutlinedTextField(
                value = ec1,
                onValueChange = { ec1 = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Ingrese EC 1") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                ))

        }
    }
}

