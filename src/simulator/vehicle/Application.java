package simulator.vehicle;

import simulator.vehicle.implementation.Jairaj;
import simulator.vehicle.implementation.RollsRoyce;

public class Application {

	public static void main(String[] args) {
		Jairaj jj = new Jairaj();
		RollsRoyce rr = new RollsRoyce(jj);
		System.out.println(rr);
	}

}
