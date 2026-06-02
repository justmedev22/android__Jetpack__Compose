package pe.edu.idat.appmenucomponents

import android.R.attr.duration
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Label
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import kotlinx.coroutines.launch
import pe.edu.idat.appmenucomponents.ui.theme.AppMenuComponentsTheme

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppMenuComponentsTheme {
        EjemploScaffold()
    }
}



@Composable
fun EjemploBottomBar(){
    val items = listOf("Home", "Contantos", "Perfil", "Buzón")
    val itemSeleccionado by remember {
        mutableStateOf(0)
    }
    BottomAppBar(
        containerColor = Color.Red,
        contentColor = Color.White
    ){
        items.forEachIndexed { index, item ->
            NavigationBarItem(selected = itemSeleccionado == index,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(imageVector = Icons.Filled.Home, contentDescription = "")},
                    label = { Text(text = item) }

            )
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ejemplotoolbar() {
    TopAppBar( title = { Text(text = "Mi APP IDAT") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White
        ),
        navigationIcon = { IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Star,
                contentDescription = "", tint = Color.White)
        }},
        actions = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(imageVector = Icons.Filled.Star,
                    contentDescription = "", tint = Color.White)
            }
            IconButton(onClick = { /* TODO */ }) {
                Icon(imageVector = Icons.Filled.Star,
                    contentDescription = "", tint = Color.White)
            }
            IconButton(onClick = { /* TODO */ }) {
                Icon(imageVector = Icons.Filled.Call,
                    contentDescription = "", tint = Color.White)
            }
        }

        )
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun EjemploScaffold() {

    val estado by rememberSaveable {
    mutableStateOf(false)
    }
    val coroutineScope = rememberCoroutineScope()

    Scaffold (

        topBar = { Ejemplotoolbar() },
        snackbarHost = {
            SnackbarHost(hostState = estado)
        },
        content = {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center) {
                Button(onClick = {
                    coroutineScope.launch {
                       /* estado.snackSnacbar(  // nose pq pero me sale error
                                "Hola clickeaste el botton",
                        actionLabel = "OK",
                        duration = SnackbarDuration.Long) */
                    }
                }) {
                    Text(text = "Mostrar Snackbar")
                }
            }

        })

        bottomBar() {

        }
}

