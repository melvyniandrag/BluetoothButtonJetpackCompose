
package com.ballofknives.bluetoothbuttonjetpackcompose.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ballofknives.bluetoothbuttonjetpackcompose.models.domain.BluetoothDevice
import com.ballofknives.bluetoothbuttonjetpackcompose.viewmodels.BluetoothUiState

@Composable
fun ButtonScreen(
    state: BluetoothUiState,
    onDisconnect: () -> Unit,
    onSendMessage: (String) -> Unit
) {
    Text(
        text = "Hello !"
    )
}