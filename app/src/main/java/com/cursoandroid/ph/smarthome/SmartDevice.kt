package com.cursoandroid.ph.smarthome

class SmartDevice {
    val name = "Android TV"
    val category = "Entertaiment"
    var deviceStatus = "online"
    fun turnOn () {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart devive is turned off.")
    }
}