package com.cursoandroid.ph.smarthome

class SmartLightDevice (deviceName: String, deviceCategory: String) :
    SmartDevice (name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart Light"
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }

    fun increaseBrightness() {
        brightnessLevel ++
        println("Brightness increased to $brightnessLevel.")
    }
}