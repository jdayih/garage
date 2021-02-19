package Garage;

public class Motorbike extends Vehicle {
	private boolean isItASportsBike;

	public Motorbike(int mileage, int id, String colour, int manufactureYear, boolean isItASportsBike) {
		super(mileage, id, colour, manufactureYear);
		this.setIsItASportsBike(isItASportsBike);
	}

	public boolean getIsItASportsBike() {
		return isItASportsBike;
	}

	public void setIsItASportsBike(boolean isItASportsBike) {
		this.isItASportsBike = isItASportsBike;
	}

}
