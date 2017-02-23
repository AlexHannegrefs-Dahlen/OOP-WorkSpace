
public class Tower_Solver {

	public static void main(String[] args) {
		Tower_Solver towersOfHanoi = new Tower_Solver();
		towersOfHanoi.moveDisc(Integer.parseInt(args[0]), "Left", "Middle", "Right");
	}

	private void moveDisc(int n, String pegOne, String pegTwo, String pegThree) {
		if (n == 1)
			printLn(pegOne + " ---> " + pegThree);
		else {
			moveDisc(n - 1, pegOne, pegThree, pegTwo);
			printLn(pegOne + " ---> " + pegThree);
			moveDisc(n - 1, pegTwo, pegOne, pegThree);
		}
	}

	private void printLn(String print) {
		System.out.println(print);
	}
}
