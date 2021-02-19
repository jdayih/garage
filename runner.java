package Garage;

public class runner {

	public static void main(String[] args) {

		Car bmw = new Car(20000, 897194, "Blue", 1987, "Yes");

		Garage myGarage = new Garage();
		myGarage.addVehicle(bmw);

	}

}
