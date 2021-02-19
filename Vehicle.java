package Garage;

public class Vehicle {

	private int mileage;
	private int id;
	private String colour;
	private int manufactureYear;

	public Vehicle() {
		super();
	}

	public Vehicle(int mileage, int id, String colour, int manufactureYear) {
		this.mileage = mileage;
		this.id = id;
		this.colour = colour;
		this.manufactureYear = manufactureYear;
	}

	public void makeNoise() {
		System.out.println("Vroom vroom!");
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public String getColour() {
		return colour;
	}

	public int getId() {
		return id;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return "vehicle [mileage=" + mileage + ", id=" + id + ", colour=" + colour + ", manufactureYear="
				+ manufactureYear + "]";
	}

}
