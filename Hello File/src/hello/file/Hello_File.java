package hello.file;

import java.io.File;
import java.io.IOException;

public class Hello_File {

	public static void main(String[] args) throws IOException {
		Hello_Input_Output io = new Hello_Input_Output();
		File file = new File("thisText.txt");
		System.out.println("Enter line one");
		String one = io.readTextLine();
		System.out.println("Enter line two");
		String two = io.readTextLine();
		System.out.println("Enter line three");
		String three = io.readTextLine();
		io.setOutputToFile(file);
		io.writeTextLine(one);
		io.writeTextLine(two);
		io.writeTextLine(three);
		io.setInputToFile(file);
		io.setOutputWriter(System.out);
		boolean valid = true;
		while (valid) {
			if (io.checkIfReady()) {
				io.writeTextLine(io.readTextLine());
			} else
				valid = false;
		}
	}

}
