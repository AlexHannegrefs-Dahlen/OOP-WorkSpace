
public class Tower_Solver {

	public static void main(String[] args) {
		solve(0);
	}
	
	private static void solve(int n){
		try{
			solve(n+1);
		}catch (StackOverflowError e) {
			System.out.println("OOPS");
		}
		System.out.println(n);
	}
}
