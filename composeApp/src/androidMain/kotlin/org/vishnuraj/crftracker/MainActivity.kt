package org.vishnuraj.crftracker

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
                RecyclerView()
           //App()
        }
    }
}
val CRFIDLabel = Typography(
    h6 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 8.sp
    )
)
val CRFIDValue = Typography(
    h6 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        fontSize = 12.sp
    )
)
@Composable
fun RecyclerView(names : List<String> = List(20){"$it"}){
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)){
        items(items = names){ name ->
            ListItem(name = name)
        }

    }

}

@Composable
fun ListItem(name : String){

    Surface(color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 2.dp, horizontal = 4.dp)){
        Column(modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .padding(2.dp)
                    .fillMaxWidth()
            ) {
                Row {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(text = "CRF ID", style = CRFIDLabel.h6)
                        Text(text = name, style = CRFIDValue.h6)
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(text = "Target Date", style = CRFIDLabel.h6)
                        Text(text = name, style = CRFIDValue.h6)
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(text = "Status", style = CRFIDLabel.h6)
                        Text(text = name, style = CRFIDValue.h6)
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(2.dp)
                    .fillMaxWidth()
            ) {
                Row {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(text = "Subject", style = CRFIDLabel.h6)
                        Text(text = name, style = CRFIDValue.h6)
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(text = "Start date", style = CRFIDLabel.h6)
                        Text(text = name, style = CRFIDValue.h6)
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(text = "End date", style = CRFIDLabel.h6)
                        Text(text = name, style = CRFIDValue.h6)
                    }
                }
            }
        }

    }
}


@Preview
@Composable
fun AppAndroidPreview() {
        RecyclerView()
    //App()
}