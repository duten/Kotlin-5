package ru.otus.cars

interface Tank {

    var tankMouth: TankMouth

    fun getContents(): Int

    fun receiveFuel(liters: Int){
    }
}

abstract class TankMouth {
    abstract fun open()

    abstract fun close()
}

class PetrolMouth(var tank: Tank): TankMouth() {
    fun fuelPetrol(liters: Int) {
        this.tank.receiveFuel(liters)
    }
    override fun open() {}
    override fun close() {}
}

class LpgMouth(var tank: Tank): TankMouth() {
    fun fuelLpg(liters: Int) {
        this.tank.receiveFuel(liters)
    }
    override fun open() {}
    override fun close() {}
}