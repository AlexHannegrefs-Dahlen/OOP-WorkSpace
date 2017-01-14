package store.grocery;

public class Celery extends GroceryItem {
	public Celery() {

	}

	public Celery(double weight, double price) {
		this.setWeight(weight);
		this.setPrice(price);
	}

	@Override
	public void printItemName() {
		System.out.println("Celery");
	}
}
