package ru.otus.cars

class TankStation {
    fun fillUpCar(car: Car, fuel: Int) {
        try {
            if (car.tankMouth is LpgMouth) {
                (car.tankMouth as LpgMouth).fuelLpg(fuel)
            } else {
                (car.tankMouth as PetrolMouth).fuelPetrol(fuel)
            }
        } catch (e: NotImplementedError) {
            //noop
        }
    }

    fun fillUpCars(cars: List<Car>) {
        cars.forEach({ println(it) })
        cars.forEach({ this.fillUpCar(it, 100) })
        cars.forEach({ println(it) })
    }
}
