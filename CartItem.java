package programs;

//CartItem.java
public class CartItem {
	private Fruit fruit;
	private int quantity;

	public CartItem(Fruit fruit, int quantity) {
		this.fruit = fruit;
		this.quantity = quantity;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return fruit.getPricePerUnit() * quantity;
	}

	@Override
	public String toString() {
		return fruit.getName() + " x " + quantity + " = $" + getTotalPrice();
	}
}
