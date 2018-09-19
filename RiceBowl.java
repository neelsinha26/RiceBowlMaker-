package riceBowlHPEAssign;

//RiceBowl class with different attributes

public class RiceBowl {

	private Rice rice;
	private Meat meat;
	private Sauce sauceType;
	private Boolean sourCream = false;
	private Boolean guaceMole = false;
	private Boolean mixVegetables = false;

	private RiceBowl(Builder builder) {
		this.rice = builder.rice;
		this.meat = builder.meat;
		this.sauceType = builder.sauceType;
		this.sourCream = builder.sourCream;
		this.guaceMole = builder.guaceMole;
		this.mixVegetables = builder.mixVegetables;

	}

	// getter methods 
	
	public Rice getRice() {
		return rice;
	}

	public Meat getMeat() {
		return meat;
	}

	public Sauce getSauceType() {
		return sauceType;
	}

	public Boolean getSourCream() {
		return sourCream;
	}

	public Boolean getGuaceMole() {
		return guaceMole;
	}

	public Boolean getMixVegetables() {
		return mixVegetables;
	}
	
	// Builder class

	public static class Builder {

		private Rice rice;
		private Meat meat;
		private Sauce sauceType;
		private Boolean sourCream;
		private Boolean guaceMole;
		private Boolean mixVegetables;

		// Constructor for the builder class
		
		public Builder(Rice rice, Meat meat, Sauce sauceType) {
			if (rice == null || meat == null || sauceType == null) {
				throw new IllegalArgumentException("rice, meat and sauce type can not be null");
			}
			this.rice = rice;
			this.meat = meat;
			this.sauceType = sauceType;
		}

		public Builder withSourCream(Boolean sourCream) {
			this.sourCream = sourCream;
			return this;
		}

		public Builder withGuacaMole(Boolean guaceMole) {
			this.guaceMole = guaceMole;
			return this;
		}

		public Builder withMixVegetables(Boolean mixVegetables) {
			this.mixVegetables = mixVegetables;
			return this;
		}

		public RiceBowl build() {
			return new RiceBowl(this);
		}

	}

}
