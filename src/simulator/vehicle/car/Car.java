package simulator.vehicle.car;

import lombok.Data;
import simulator.vehicle.driver.Driver;

@Data
public abstract class Car {

	// the values which varies based on conditions
	private Integer currentCarSpeed;
	private Integer currentCarRpm;
	private Integer currentFuelLevel;
	private Boolean areHeadlightsOn;
	private Boolean isCarOn;
	private Driver carDriver;

	// these values are constant and assigned when new vehicle is created
	private VehicleCharacteristic characteristics;

}