package Garage;

public class helicopter extends vehicle {

	public helicopter(int mileage, int id, String colour, int manufactureYear, int bladeNumber) {
		super(mileage, id, colour, manufactureYear);
		this.setBladeNumber = (bladeNumber);
	}

	public int getBladeNumber() {
		return bladeNumber;
	}

	public void setBladeNumber(int bladeNumber) {
		this.bladeNumber = bladeNumber;
	}

}
