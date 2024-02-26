package com.ballofknives.bluetoothbuttonjetpackcompose.viewmodels

import com.ballofknives.bluetoothbuttonjetpackcompose.models.domain.BluetoothDevice
import com.ballofknives.bluetoothbuttonjetpackcompose.models.domain.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList(),
    val buttonIsClicked: Boolean = false
)
