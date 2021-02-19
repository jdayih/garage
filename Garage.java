package Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public List<Vehicle> vehicle = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		vehicle.add(v);
	}

	public void removeVehicle(Vehicle v) {
		vehicle.remove(v);
	}

	public void emptyGarage() {
		vehicle.clear();
	}

}
