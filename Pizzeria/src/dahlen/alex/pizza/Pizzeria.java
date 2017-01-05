package dahlen.alex.pizza;

import java.util.ArrayList;

public class Pizzeria {

	public static void main(String[] args) {
		ArrayList<String> toppings = new ArrayList<>();
		toppings.add("Pepe");
		toppings.add("Chease");
		Pizza p1 = new Pizza(false, CrustType.DeepDish, toppings);
		
		Pizza p2 = new Pizza(false, CrustType.DeepDish, toppings);
		
		if(p1.equals(p2)){
			System.out.println("All thee same");
		}else{
			System.out.println("No thee same");
		}
	}

}
