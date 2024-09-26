package com.example.appdeportiva

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdeportiva.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WelcomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    TarjetaPresentacion()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TarjetaPresentacion() {
    Card(
        modifier = Modifier.fillMaxSize(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(17.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logoandroid),
                contentDescription = "Descripción de la imagen",
                modifier = Modifier.size(150.dp).padding(bottom = 20.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Dairk Camblor Duran",
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
            Text(
                text = "Programación Android",
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(100.dp))
            Divider()
            IconoConTexto(Icons.Filled.Email, "d.camblor@alumnos.santotomas.cl")
            Spacer(modifier = Modifier.height(8.dp))
            IconoConTexto(Icons.Filled.Phone, "+56958585824")
            Spacer(modifier = Modifier.height(8.dp))
            IconoConTexto(Icons.Filled.Share, "@DairkX")
            Divider()

        }
    }
}

@Composable
fun IconoConTexto(icono: ImageVector, texto: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icono,
            contentDescription = null,
            modifier = Modifier.size(30.dp)

        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = texto,
            fontSize = 14.sp
        )
    }
}