package pe.edu.idat.appcomponentsadvanced

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import pe.edu.idat.appcomponentsadvanced.model.Mascota



@Composable
fun EjemploRecicleVierItem() {
    LazyColumn( verticalArrangement = Arrangement.spacedBy(8.dp))
    {
        items(listarMascotas()) {
            mascota ->
            itemMascota(mascota = mascota)
        }
    }
}


@Composable
fun itemMascota(mascota: Mascota) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        shape = MaterialTheme.shapes.large,
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column( horizontalAlignment = Alignment.CenterHorizontally ) {
            Image(painter =
                painterResource(id = mascota.imagen),
                contentDescription = "",
                modifier = Modifier.width(200.dp),
                contentScale = ContentScale.Crop)
            Column( modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text(text = mascota.nombre , fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = mascota.raza)
            }

        }
    }
}



fun listarMascotas(): List<Mascota> {
    return listOf (
        Mascota("Pepa","Cooker",
            10, R.drawable.ic_launcher_background),
        Mascota("Hanna","Snauzer",
            12, R.drawable.ic_launcher_background),
        Mascota("Michel","Shitzu",
            7, R.drawable.ic_launcher_background),
        Mascota("Boby","Peruano",
            8, R.drawable.ic_launcher_background),
        Mascota("Toby","Egipcio",
            1, R.drawable.ic_launcher_background),
    )
}


@Composable
fun EjemploSimpleRecyclerView() {
    val listadoMascotas = listOf("Hanna","Wolverine","Simba","Zeus")
    LazyColumn { // 3 formas de mostrar en pantalla los datos
        item { Text(text = "Elemento 1") }
        item { Text(text = "Elemento 2") }
        item { Text(text = "Elemento 3") }
        items( 5 ) {
            Text(text = "Item $it ")
        }
        items(listadoMascotas) { mascota->
            Text(text = "Bienvenido $mascota")
        }
    }
}