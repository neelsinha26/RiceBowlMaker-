package riceBowlHPEAssign;

//Enum for Meat

public enum Meat {

	CHICKEN, BEEF, PORK;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
