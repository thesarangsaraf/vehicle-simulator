package simulator.vehicle.car;

import lombok.Data;

@Data
public class VehicleCharacteristic {

	// fixed state values
	private Integer seatCapacity;
	private String headLights; // LED / Halogen
	private Integer cc;
	private String model;
	private Integer wheelSize;
	private Boolean hasSeatBelt;

}