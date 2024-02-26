package com.ballofknives.bluetoothbuttonjetpackcompose.models.data

import com.ballofknives.bluetoothbuttonjetpackcompose.models.domain.BluetoothMessage

fun Byte.toBluetoothMessage(isFromLocalUser: Boolean): BluetoothMessage {
    return BluetoothMessage(
        message = this,
        senderName = "name",
        isFromLocalUser = isFromLocalUser
    )
}

fun BluetoothMessage.toByteArray(): ByteArray {
    return byteArrayOf(this.message)
}