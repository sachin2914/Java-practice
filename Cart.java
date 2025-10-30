package programs;

//Cart.java
import java.util.*;

public class Cart {
	private Map<String, CartItem> items = new HashMap<>();

	public void addFruit(Fruit fruit, int quantity) {
		if (items.containsKey(fruit.getName())) {
			CartItem existing = items.get(fruit.getName());
			existing.setQuantity(existing.getQuantity() + quantity);
		} else {
			items.put(fruit.getName(), new CartItem(fruit, quantity));
		}
	}

	public void removeFruit(String fruitName) {
		items.remove(fruitName);
	}

	public double getTotal() {
		return items.values().stream().mapToDouble(CartItem::getTotalPrice).sum();
	}

	public int getCartSize() {
		return items.size();
	}

	public Map<String, CartItem> getItems() {
		return items;
	}
}
