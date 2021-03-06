
public class FibNumbs {

	public static void main(String[] args) {
		System.out.println(fib(100000));
	}
	
	public static long fibr(long n) {
		if(n<=1)
			return n;
		return fibr(n-1) + fibr(n-2);
	}
	
	public static long fib(long n){
		int in = 0, addIn = 1, keIn = 0;
		for(long i = 1; i <=n; i++){
			keIn = in;
			in = addIn;
			addIn = keIn + addIn;
		}
		return in;
	}
}
