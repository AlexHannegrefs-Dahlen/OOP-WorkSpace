
public class FibNumbs {

	public static void main(String[] args) {
		System.out.println(fibr(70));
	}
	
	public static int fibr(int n) {
		if(n<=1)
			return n;
		return fibr(n-1) + fibr(n-2);
	}
	
	public static int fib(int n){
		int in = 0, addIn = 1, keIn = 0;
		for(int i = 1; i <=n; i++){
			keIn = in;
			in = addIn;
			addIn = keIn + addIn;
		}
		return in;
	}
}
