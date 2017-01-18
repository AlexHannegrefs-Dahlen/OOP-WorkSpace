package store.grocery;

public class Orange extends GroceryItem {
	public Orange() {

	}

	public Orange(double weight, double price) {
		this.setWeight(weight);
		this.setPrice(price);
	}

	@Override
	public void printItemName() {
		System.out.println("Orange");
	}
}