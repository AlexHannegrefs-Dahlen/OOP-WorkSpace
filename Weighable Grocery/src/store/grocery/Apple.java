package store.grocery;

public class Apple extends GroceryItem{
	public Apple(){
		
	}
	
	public Apple(double weight, double price){
		this.setWeight(weight);
		this.setPrice(price);
	}

	@Override
	public void printItemName() {
		System.out.println("Apple");	
	}
	
}
