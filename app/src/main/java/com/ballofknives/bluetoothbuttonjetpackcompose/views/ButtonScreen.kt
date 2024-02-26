
package com.ballofknives.bluetoothbuttonjetpackcompose.views

import android.widget.Toast
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.ballofknives.bluetoothbuttonjetpackcompose.viewmodels.BluetoothUiState

@Composable
fun ButtonScreen(
    state: BluetoothUiState,
    onDisconnect: () -> Unit,
    onSendMessage: (Byte) -> Unit
) {
    val context = LocalContext.current
    if(state.buttonIsClicked){
        Column(Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Canvas(modifier = Modifier.size(80.dp), onDraw = {
                drawCircle(color = Color.Red)
            })

        }
    }
    else{
        Column(Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Canvas(modifier = Modifier.size(100.dp).clickable(onClick = {
                onSendMessage(0x01.toByte())
            }), onDraw = {
                drawCircle(color = Color.Green)
            })
        }
    }
}