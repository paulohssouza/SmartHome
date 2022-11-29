package com.cursoandroid.ph.smarthome

fun main () {
    val device = SmartDevice(name = "Android TV", category = "Entertaiment")
    println("Device name is: ${device.name}")
    device.turnOn()
    device.turnOff()
}