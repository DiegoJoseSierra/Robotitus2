package com.fggc.MascotaFeliz


import android.content.Intent
import android.graphics.drawable.shapes.Shape
import android.icu.text.LocaleDisplayNames.UiListItem
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fggc.MascotaFeliz.ui.theme.MascotaFelizTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MascotaFelizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Greeting("Android")
                    Elementos()
                }
            }
        }
    }
}

//zzzzzzzzzzzzzzz
@Composable
fun Elementos() {
    val mContext = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )

    {

        Box(
            modifier = Modifier
                .clip(shape = MaterialTheme.shapes.small)
                .background(MaterialTheme.colors.secondary)
                .border(4.dp, MaterialTheme.colors.primary)

        )

        {
            Image(
                painter = painterResource(id = R.drawable.imagen),
                contentDescription = "Robotitus",
                modifier = Modifier
                    .padding((20.dp))

            )
        }




        Text(
            "Mascota Digital",
            color = MaterialTheme.colors.secondary,
            style = MaterialTheme.typography.h1,
        )
        Text(
            "Bienvenido, Usuario",

            color = MaterialTheme.colors.primary,
            style = MaterialTheme.typography.body2,
        )

        Row {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(
                    "Tu Mazcota Digital",
                    color = MaterialTheme.colors.primary,
                    style = MaterialTheme.typography.body2,
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(onClick = {
                mContext.startActivity(Intent(mContext, ListActivity::class.java))
            }
            )
            {
                Text(
                    "Contenidos",
                    color = MaterialTheme.colors.primary,
                    style = MaterialTheme.typography.body2
                )
            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun ElementosPreview() {
    MascotaFelizTheme {
        Elementos()

    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MascotaFelizTheme {
        Greeting("Android")
    }
}


 */