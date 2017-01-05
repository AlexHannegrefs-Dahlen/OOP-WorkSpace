package dahlen.alex.pizza;

import java.util.ArrayList;

/**
 * 
 * @author Alex
 *
 */
public class Pizza {
	private ArrayList<String> toppings;
	private CrustType crust;
	private boolean cooked;

	/* Pizza(){
		
	}*/
	/**
	 * 
	 * @param c
	 * @param ct
	 * @param toppings
	 */
	public Pizza(boolean c, CrustType ct, ArrayList<String> toppings){
		this.setCooked(c);
		this.setCrust(ct);
		this.setToppings(toppings);
	}
	
	/**
	 * @param ogj
	 *            - the other pizza
	 * @return true is pizzas are equal; otherwise false
	 */
	public boolean equals(Object obj) {
		Pizza other = (Pizza) obj;
		return (this.isCooked() == other.isCooked() && this.getCrust() == other.getCrust()
				&& this.getToppings().equals(other.getToppings()));
	}

	/**
	 * 
	 * @return the toppings
	 */
	public ArrayList<String> getToppings() {
		return toppings;
	}

	/**
	 * @param toppings
	 *            the toppings to set
	 */
	public void setToppings(ArrayList<String> toppings) {
		if (toppings == null) {
			throw new IllegalArgumentException("toppings connot be null");
		}
		this.toppings = toppings;
	}

	/**
	 * @return the crust
	 */
	public CrustType getCrust() {
		return crust;
	}

	/**
	 * @param crust
	 *            the crust to set
	 */
	public void setCrust(CrustType crust) {
		if (crust == null) {
			throw new IllegalArgumentException("crust cannot be null");
		}
		this.crust = crust;
	}

	/**
	 * @return the cooked
	 */
	public boolean isCooked() {
		return cooked;
	}

	/**
	 * @param cooked
	 *            the cooked to set
	 */
	public void setCooked(boolean cooked) {
		this.cooked = cooked;
	}

}