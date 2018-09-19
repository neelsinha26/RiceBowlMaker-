package riceBowlHPEAssign;

// Enum for Sauce

public enum Sauce {

	SWEET("Sweet Sauce"), SPICY("Spicy Sauce");

	private String sauce;

	Sauce(String sauceType) {
		this.sauce = sauceType;
	}

	@Override
	public String toString() {
		return sauce;
	}
}
