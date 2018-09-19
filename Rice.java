package riceBowlHPEAssign;

//Enum for Rice

public enum Rice {

	WHITE_RICE("White Rice"), BROWN_RICE("Brown Rice");

	private String riceType;

	Rice(String riceType) {
		this.riceType = riceType;
	}

	@Override
	public String toString() {
		return riceType;
	}
}