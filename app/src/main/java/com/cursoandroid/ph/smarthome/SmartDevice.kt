package com.cursoandroid.ph.smarthome

open class SmartDevice (val name: String, val category: String){
    var deviceStatus = "online"
        protected set
    open val deviceType = "unknown"
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    open fun turnOn () {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}