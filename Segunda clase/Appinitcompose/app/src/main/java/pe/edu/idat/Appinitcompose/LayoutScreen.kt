package pe.edu.idat.Appinitcompose

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.idat.Appinitcompose.ui.theme.AppinitcomposeTheme

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppinitcomposeTheme {
        ejemploRow()
    }
}


@Composable
fun ejemploRow(){
    Row(
        // fill para definir la altura , ancho , que tome todo max size
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
           text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = "Hola mundo, compose",
            modifier = Modifier.width(100.dp)
        )


    }
}