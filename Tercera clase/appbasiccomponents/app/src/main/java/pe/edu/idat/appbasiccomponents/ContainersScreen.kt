package pe.edu.idat.appbasiccomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.idat.appbasiccomponents.ui.theme.AppbasiccomponentsTheme


// previsualizar el componente

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppbasiccomponentsTheme {
        MiColumnPrueba()
    }
}





@Composable
fun MiComponenteComplejo(){
    Column (Modifier.fillMaxSize())
    {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Magenta)
        ) {

        }
    }
}


@Composable
fun MiCaja() {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text( text = "Box prueba" )
    }
}

@Composable
fun MiColumnPrueba() {
    Column (modifier = Modifier.fillMaxSize())
    {
        Text(
            text = "Texto 1",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Texto 1",
            modifier = Modifier.fillMaxWidth()
                .background(Color.Blue)
                .height(100.dp)                ,
                color = Color.White
        )
        Text(
            text = "Texto 1",
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Texto 1",
            modifier = Modifier.fillMaxWidth()
        )
    }
}

