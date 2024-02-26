package com.ballofknives.bluetoothbuttonjetpackcompose.models.domain

data class BluetoothMessage(
    val message: Byte,
    val senderName: String,
    val isFromLocalUser: Boolean
)
