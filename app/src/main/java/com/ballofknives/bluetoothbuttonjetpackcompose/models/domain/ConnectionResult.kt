package com.ballofknives.bluetoothbuttonjetpackcompose.models.domain

sealed interface ConnectionResult {
    object ConnectionEstablishedByMe: ConnectionResult

    object ConnectionEstablishedByOtherDevice: ConnectionResult

    data class TransferSucceeded(val message: BluetoothMessage): ConnectionResult
    data class Error(val message: String): ConnectionResult
}