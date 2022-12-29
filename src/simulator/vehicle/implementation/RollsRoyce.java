package simulator.vehicle.implementation;

import simulator.vehicle.car.Car;
import simulator.vehicle.car.VehicleCharacteristic;
import simulator.vehicle.driver.Driver;

public class RollsRoyce extends Car {

	// constructor of rolls royce called when creating object
	public RollsRoyce(Driver driver) {

		VehicleCharacteristic rollsRoyceCharacteristics = new VehicleCharacteristic();
		rollsRoyceCharacteristics.cc = 3000;
		rollsRoyceCharacteristics.hasSeatBelt = true;
		rollsRoyceCharacteristics.headLights = "led";
		rollsRoyceCharacteristics.model = "RollsRoyal";
		rollsRoyceCharacteristics.seatCapacity = 5;
		rollsRoyceCharacteristics.wheelSize = 20;

		super.characteristics = rollsRoyceCharacteristics;
		super.carDriver = driver;
	}

}