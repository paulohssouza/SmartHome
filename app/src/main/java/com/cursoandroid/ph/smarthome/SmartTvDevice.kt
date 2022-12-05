package com.cursoandroid.ph.smarthome

class SmartTvDevice (deviceName: String, deviceCategory: String) :
    SmartDevice (name = deviceName, category = deviceCategory){
    override val deviceType = "Smart TV"
    private var speakerVolume by RangeRegulator (initialValue = 0, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun printDeviceInfo() {
        super.printDeviceInfo()
        println("type: $deviceType.")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun increaseSpeakerVolume () {
        speakerVolume ++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun decreaseSpeakerVolume () {
        speakerVolume --
        println("Speaker volume decreased to $speakerVolume.")
    }

    fun nextChannel () {
        channelNumber ++
        println("Channel number increased to $channelNumber.")
    }

    fun previousChannel () {
        channelNumber --
        println("Channel number decreased to $channelNumber.")
    }
}