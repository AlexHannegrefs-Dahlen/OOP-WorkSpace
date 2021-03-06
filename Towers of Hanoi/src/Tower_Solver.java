
public class Tower_Solver {
	int moves = 0;

	public static void main(String[] args) {
		Tower_Solver towersOfHanoi = new Tower_Solver();
		towersOfHanoi.moveDisc(Integer.parseInt(args[0]), "Left", "Middle", "Right");
		towersOfHanoi.printLn(String.valueOf("Discs: " + Integer.parseInt(args[0]) + "\nMoves: " + towersOfHanoi.moves));
	}

	private void moveDisc(int n, String pegOne, String pegTwo, String pegThree) {
		if (n == 1)
			printLn(pegOne + " ---> " + pegThree);
		else {
			moveDisc(n - 1, pegOne, pegThree, pegTwo);
			printLn(pegOne + " ---> " + pegThree);
			moveDisc(n - 1, pegTwo, pegOne, pegThree);
		}
		this.moves++;
	}

	private void printLn(String print) {
		System.out.println(print);
	}
}
