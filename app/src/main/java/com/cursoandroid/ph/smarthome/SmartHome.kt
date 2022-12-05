package com.cursoandroid.ph.smarthome

class SmartHome (
    private val smartTvDevice: SmartTvDevice,
    private val smartLightDevice: SmartLightDevice
) {
    var deviceTurnOnCount = 0
        private set
    fun turnOnTv () {
        deviceTurnOnCount ++
        smartTvDevice.turnOn()
    }
    private fun turnOffTv () {
        deviceTurnOnCount --
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun deacreasedTvVolume () {
        smartTvDevice.decreaseSpeakerVolume()
    }

    fun printSmartTvInfo () {
        smartTvDevice.printDeviceInfo()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun changeTvChannelToPrevious() {
        smartTvDevice.previousChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount ++
        smartLightDevice.turnOn()
    }

    private fun turnOffLight() {
        deviceTurnOnCount --
        smartLightDevice.turnOff()
    }
    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun decreaseLightBrightness() {
        smartLightDevice.decreaseBrightness()
    }

    fun printSmartLightInfo () {
        smartLightDevice.printDeviceInfo()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}