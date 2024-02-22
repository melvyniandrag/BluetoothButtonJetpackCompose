package com.ballofknives.bluetoothbuttonjetpackcompose.models.data

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.ballofknives.bluetoothbuttonjetpackcompose.models.domain.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}