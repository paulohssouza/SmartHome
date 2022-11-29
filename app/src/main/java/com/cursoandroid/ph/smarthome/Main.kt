package com.cursoandroid.ph.smarthome

fun main () {
    val device = SmartDevice()
    println("Device name is: ${device.name}")
    device.turnOn()
    device.turnOff()
}