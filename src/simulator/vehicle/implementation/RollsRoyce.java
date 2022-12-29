package simulator.vehicle.implementation;

import simulator.vehicle.car.Car;
import simulator.vehicle.car.VehicleCharacteristic;
import simulator.vehicle.driver.Driver;

public class RollsRoyce extends Car {

	// constructor of rolls royce called when creating object
	public RollsRoyce(Driver driver) {

		VehicleCharacteristic rollsRoyceCharacteristics = new VehicleCharacteristic();
		rollsRoyceCharacteristics.setCc(3000);
		rollsRoyceCharacteristics.setHasSeatBelt(true);
		rollsRoyceCharacteristics.setHeadLights("LED");
		rollsRoyceCharacteristics.setModel("ROLLS_ROYCE");
		rollsRoyceCharacteristics.setSeatCapacity(5);
		rollsRoyceCharacteristics.setWheelSize(20);

		super.setCharacteristics(rollsRoyceCharacteristics);
		super.setCarDriver(driver);
	}

}