package com.cursoandroid.ph.smarthome

fun main () {
    var device: SmartDevice = SmartTvDevice ("Android TV", "Entertaiment")
    device.turnOn()
    device = SmartLightDevice ("Google Light", "Utility")
    device.turnOn()
}