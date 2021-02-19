package Garage;

public class Car extends Vehicle {
	private String hasAirbags;

	public Car(int mileage, int id, String colour, int manufactureYear, String hasAirbags) {
		super(mileage, id, colour, manufactureYear);
		this.setHasAirbags(hasAirbags);
	}

	public String getHasAirbags() {
		return hasAirbags;
	}

	public void setHasAirbags(String hasAirbags) {
		this.hasAirbags = hasAirbags;
	}

}
