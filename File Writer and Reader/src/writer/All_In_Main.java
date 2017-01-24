package writer;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class All_In_Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		System.out.println("Enter line one");
		String one = in.readLine();
		System.out.println("Enter line two");
		String two = in.readLine();
		System.out.println("Enter line three");
		String three = in.readLine();
		PrintStream out = new PrintStream(new FileOutputStream("thisText.txt"));
		out.println(one);
		out.println(two);
		out.println(three);
		out.close();
	}

}
