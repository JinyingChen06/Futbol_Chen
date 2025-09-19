package com.example.futbol_chen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.futbol_chen.ui.theme.Futbol_ChenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Futbol_ChenTheme {
                Scaffold (modifier = Modifier.fillMaxSize()){ innerPadding ->
                    FutbolPeople(modifier= Modifier
                        .padding(innerPadding)
                        .verticalScroll(rememberScrollState())
                        .fillMaxSize()
                        .padding(25.dp))
                }
            }
        }
    }
}

@Composable
fun FutbolPeople(modifier: Modifier = Modifier) {
    Column(modifier=modifier, verticalArrangement = Arrangement.spacedBy(12.dp)){
        Text(text = "Fitxa del futbolista", fontWeight = FontWeight.Bold)

        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Text(text = stringResource(R.string.nom_label), fontWeight = FontWeight.SemiBold)
            Text(text = stringResource(R.string.nom_value))
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(R.string.nacionalitat_label), fontWeight = FontWeight.SemiBold)
            Text(text = stringResource(R.string.nacionalitat_value))
        }

        Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Text(text = stringResource(R.string.naix_label), fontWeight = FontWeight.SemiBold)
            Text(text = stringResource(R.string.naix_value))
        }

        Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Text(text = stringResource(R.string.debut_label), fontWeight = FontWeight.SemiBold)
            Text(text = stringResource(R.string.debut_value))
        }

        Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()){
            Text(text = stringResource(R.string.team_label), fontWeight = FontWeight.SemiBold)
            Text(text = stringResource(R.string.team_value))
        }

        Image(
            painter = painterResource(R.drawable.messi),
            contentDescription = "Foto del futbolista",
            modifier = Modifier.fillMaxWidth().height(220.dp),
            contentScale = ContentScale.Crop
        )
    }
}



@Preview(showBackground = true)
@Composable
fun FutbolPreview() { FutbolPeople() }
