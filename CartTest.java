package programs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//CartTest.java


public class CartTest {

	@Test
	public void testAddSingleFruit() {
		Cart cart = new Cart();
		Fruit apple = new Fruit("Apple", 10.0);

		cart.addFruit(apple, 1);

		assertEquals(1, cart.getCartSize());
		assertEquals(10.0, cart.getTotal(), 0.001);
	}

	@Test
	public void testAddMultipleDifferentFruits() {
		Cart cart = new Cart();
		Fruit apple = new Fruit("Apple", 10.0);
		Fruit banana = new Fruit("Banana", 5.0);

		cart.addFruit(apple, 2); // 20
		cart.addFruit(banana, 3); // 15

		assertEquals(2, cart.getCartSize());
		assertEquals(35.0, cart.getTotal(), 0.001);
	}

	@Test
	public void testAddSameFruitIncrementsQuantity() {
		Cart cart = new Cart();
		Fruit mango = new Fruit("Mango", 8.0);

		cart.addFruit(mango, 2);
		cart.addFruit(mango, 3); // should merge, not duplicate

		assertEquals(1, cart.getCartSize());
		assertEquals(40.0, cart.getTotal(), 0.001);
		assertEquals(5, cart.getItems().get("Mango").getQuantity());
	}
}
