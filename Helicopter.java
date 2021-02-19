package Garage;

public class Helicopter extends Vehicle {
	private int bladeNumber;

	public Helicopter(int mileage, int id, String colour, int manufactureYear, int bladeNumber) {
		super(mileage, id, colour, manufactureYear);
		this.setBladeNumber(bladeNumber);
	}

	public int getBladeNumber() {
		return bladeNumber;
	}

	public void setBladeNumber(int bladeNumber) {
		this.bladeNumber = bladeNumber;
	}

	@Override
	public void makeNoise() {
		System.out.println("Whirrrrrrrr!");
	}

}
