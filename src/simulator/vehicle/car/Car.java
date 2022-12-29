package simulator.vehicle.car;

import simulator.vehicle.driver.Driver;

public abstract class Car {
	
	// the values which varies based on conditions
	public Integer currentCarSpeed;
	public Integer currentCarRpm;
	public Integer currentFuelLevel;
	public Boolean areHeadlightsOn;
	public Boolean isCarOn;
	public Driver carDriver;

	public VehicleCharacteristic characteristics;

	@Override
	public String toString() {
		return "Car [currentCarSpeed=" + currentCarSpeed + ", currentCarRpm=" + currentCarRpm + ", currentFuelLevel="
				+ currentFuelLevel + ", areHeadlightsOn=" + areHeadlightsOn + ", isCarOn=" + isCarOn + ", carDriver="
				+ carDriver + ", characteristics=" + characteristics + "]";
	}

}