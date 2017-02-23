package learn.recursion;

public class Recursion {

	public static void main(String[] args) {
		printHelloR(5);
		printHello(5);
	}

	private static void printHelloR(int r) {
		if (r > 0) {
			printHelloR(r - 1);
			System.out.println("Hello " + r);
		}
	}

	private static void printHello(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Hello " + i);
		}
	}

}
