import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFile {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));

		while (in.ready()) {
			String line = in.readLine();
			System.out.println(line);
		}
		in.close();
		/*
		 * BufferedReader in = new BufferedReader(new
		 * InputStreamReader(System.in)); final int NUM_LINES = 3;
		 * 
		 * PrintStream out = new PrintStream(new FileOutputStream("text.txt"));
		 * 
		 * for(int i = 0; i < NUM_LINES; i++){
		 * System.out.println("Enter a line"); String line = in.readLine();
		 * out.println(line); }
		 * 
		 * out.close();
		 */
	}

}
