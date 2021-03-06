package store.grocery;

abstract public class GroceryItem implements GroceryInterface, java.lang.Comparable<GroceryItem> {
	private double weight;
	private double price;
	
	abstract public void printItemName();
	
	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setWeight(double weight) {
		if (weight <= 0)
			throw new IllegalArgumentException("Weight must be greater than 0");
		this.weight = weight;
	}

	@Override
	public void setPrice(double price) {
		if (this.getWeight() == 0)
			throw new IllegalArgumentException("Weight must be set before price");
		this.price = this.getWeight() * price;
	}

	@Override
	public int compareTo(GroceryItem o) {
		int returnVal = 0;
		if (this.getWeight() > o.getWeight())
			returnVal = 1;
		else if (this.getWeight() < o.getWeight())
			returnVal = -1;
		return returnVal;
	}

}
