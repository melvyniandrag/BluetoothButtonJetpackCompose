package com.ballofknives.bluetoothbuttonjetpackcompose.models.domain

data class BluetoothMessage(
    val message: String,
    val senderName: String,
    val isFromLocalUser: Boolean
)
