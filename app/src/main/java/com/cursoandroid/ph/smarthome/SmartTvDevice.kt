package com.cursoandroid.ph.smarthome

class SmartTvDevice (deviceName: String, deviceCategory: String) :
    SmartDevice (name = deviceName, category = deviceCategory){
    override val deviceType = "Smart TV"
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
    set (value) {
        if (value in 0..200) {
            field = value
        }
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun increaseSpeakerVolume () {
        speakerVolume ++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel () {
        channelNumber ++
        println("Channel number increased to $channelNumber.")
    }
}