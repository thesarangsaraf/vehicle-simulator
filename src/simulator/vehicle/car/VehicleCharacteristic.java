package simulator.vehicle.car;

public class VehicleCharacteristic {

	// fixed state values
	public Integer seatCapacity;
	public String headLights; // LED / Halogen
	public Integer cc;
	public String model;
	public Integer wheelSize;
	public Boolean hasSeatBelt;

	@Override
	public String toString() {
		return "VehicleCharacteristic [seatCapacity=" + seatCapacity + ", headLights=" + headLights + ", cc=" + cc
				+ ", model=" + model + ", wheelSize=" + wheelSize + ", hasSeatBelt=" + hasSeatBelt + "]";
	}

}