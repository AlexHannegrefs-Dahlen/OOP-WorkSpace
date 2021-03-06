package store.grocery.driver;

import java.util.Arrays;

import store.grocery.Apple;
import store.grocery.Celery;
import store.grocery.GroceryItem;
import store.grocery.Orange;

public class Store {

	public static void main(String[] args) {
		GroceryItem[] stockItem = new GroceryItem[6];

		Apple RedApple = new Apple(.25, 1.99);
		Apple GreenApple = new Apple(.26, 1.99);
		Orange LargeOrange = new Orange(.24, .99);
		Orange OrangedJuice = new Orange(.23, .99);
		Celery GreenCelery = new Celery(.1, .5);
		Celery RottenCelery = new Celery(.12, .5);

		stockItem[0] = RedApple;
		stockItem[1] = GreenApple;
		stockItem[2] = LargeOrange;
		stockItem[3] = OrangedJuice;
		stockItem[4] = GreenCelery;
		stockItem[5] = RottenCelery;

		sort(stockItem);
	}

	private static void sort(GroceryItem[] list) {
		Arrays.sort(list);
	}

}
