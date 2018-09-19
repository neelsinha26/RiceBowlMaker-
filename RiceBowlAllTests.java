package riceBowlHPEAssign;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RicebowlTests {

	// test whether we get an exception when we create RiceBowl object without Rice

	@Test
	void testMissingRice() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> new RiceBowl.Builder(null, Meat.BEEF, Sauce.SPICY));
	}

	// test whether we get an exception when we create RiceBowl object without meat

	@Test
	void testMissingMeat() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> new RiceBowl.Builder(Rice.BROWN_RICE, null, Sauce.SPICY));
	}

	// test whether we get an exception when we create RiceBowl object without Sauce

	@Test
	void testMissingSauce() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> new RiceBowl.Builder(Rice.BROWN_RICE, Meat.BEEF, null));
	}

	// test whether we get an exception when we create RiceBowl object without all
	// necessary ingredients

	@Test
	void testMissingAll() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> new RiceBowl.Builder(null, null, null));
	}

	// test to create RiceBowl object with No guacamole

	@Test
	public void testAttributeswithNoGuacamole() throws Exception {

		RiceBowl riceBowl = new RiceBowl.Builder(Rice.BROWN_RICE, Meat.BEEF, Sauce.SWEET).withMixVegetables(true)
				.withGuacaMole(false).withSourCream(true).build();

		assertNotNull(riceBowl);
		assertEquals(riceBowl.getRice(), Rice.BROWN_RICE);
		assertEquals(riceBowl.getMeat(), Meat.BEEF);
		assertEquals(riceBowl.getSauceType(), Sauce.SWEET);
		assertEquals(riceBowl.getGuaceMole(), false);
		assertEquals(riceBowl.getSourCream(), true);
		assertEquals(riceBowl.getMixVegetables(), true);

	}

	// test to create RiceBowl object with no sour cream

	@Test
	public void testAttributeswithNoSourcream() throws Exception {

		RiceBowl riceBowl = new RiceBowl.Builder(Rice.BROWN_RICE, Meat.BEEF, Sauce.SWEET).withMixVegetables(true)
				.withGuacaMole(true).withSourCream(false).build();

		assertNotNull(riceBowl);
		assertEquals(riceBowl.getRice(), Rice.BROWN_RICE);
		assertEquals(riceBowl.getMeat(), Meat.BEEF);
		assertEquals(riceBowl.getSauceType(), Sauce.SWEET);
		assertEquals(riceBowl.getGuaceMole(), true);
		assertEquals(riceBowl.getSourCream(), false);
		assertEquals(riceBowl.getMixVegetables(), true);

	}

	// test to create RiceBowl object with no mix vegetables

	@Test
	public void testAttributeswithNoMixVegetables() throws Exception {

		RiceBowl riceBowl = new RiceBowl.Builder(Rice.BROWN_RICE, Meat.BEEF, Sauce.SWEET).withMixVegetables(false)
				.withGuacaMole(true).withSourCream(true).build();

		assertNotNull(riceBowl);
		assertEquals(riceBowl.getRice(), Rice.BROWN_RICE);
		assertEquals(riceBowl.getMeat(), Meat.BEEF);
		assertEquals(riceBowl.getSauceType(), Sauce.SWEET);
		assertEquals(riceBowl.getGuaceMole(), true);
		assertEquals(riceBowl.getSourCream(), true);
		assertEquals(riceBowl.getMixVegetables(), false);

	}

	// test to create RiceBowl object with no mixvegetables and no guacamole

	@Test
	public void testAttributeswithNoMixVegetablesNoGaucamole() throws Exception {

		RiceBowl riceBowl = new RiceBowl.Builder(Rice.BROWN_RICE, Meat.BEEF, Sauce.SWEET).withMixVegetables(false)
				.withGuacaMole(false).withSourCream(true).build();

		assertNotNull(riceBowl);
		assertEquals(riceBowl.getRice(), Rice.BROWN_RICE);
		assertEquals(riceBowl.getMeat(), Meat.BEEF);
		assertEquals(riceBowl.getSauceType(), Sauce.SWEET);
		assertEquals(riceBowl.getGuaceMole(), false);
		assertEquals(riceBowl.getSourCream(), true);
		assertEquals(riceBowl.getMixVegetables(), false);

	}

	// test to create RiceBowl object with no sour cream and no guacamole

	@Test
	public void testAttributeswithNoGaucamoleNoSourcream() throws Exception {

		RiceBowl riceBowl = new RiceBowl.Builder(Rice.BROWN_RICE, Meat.BEEF, Sauce.SWEET).withMixVegetables(true)
				.withGuacaMole(false).withSourCream(false).build();

		assertNotNull(riceBowl);
		assertEquals(riceBowl.getRice(), Rice.BROWN_RICE);
		assertEquals(riceBowl.getMeat(), Meat.BEEF);
		assertEquals(riceBowl.getSauceType(), Sauce.SWEET);
		assertEquals(riceBowl.getGuaceMole(), false);
		assertEquals(riceBowl.getSourCream(), false);
		assertEquals(riceBowl.getMixVegetables(), true);

	}

	// test to create RiceBowl object with no sour cream ,no mixvegetable no
	// guacamole

	@Test
	public void testAttributeswithNoMixVegetablesNoGaucamoleNoSourcream() throws Exception {

		RiceBowl riceBowl = new RiceBowl.Builder(Rice.BROWN_RICE, Meat.BEEF, Sauce.SWEET).withMixVegetables(false)
				.withGuacaMole(false).withSourCream(false).build();

		assertNotNull(riceBowl);
		assertEquals(riceBowl.getRice(), Rice.BROWN_RICE);
		assertEquals(riceBowl.getMeat(), Meat.BEEF);
		assertEquals(riceBowl.getSauceType(), Sauce.SWEET);
		assertEquals(riceBowl.getGuaceMole(), false);
		assertEquals(riceBowl.getSourCream(), false);
		assertEquals(riceBowl.getMixVegetables(), false);

	}
}

