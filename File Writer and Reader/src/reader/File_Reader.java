package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_Reader {
	public static void main(String[] args) throws IOException {
		File file = new File("thisText.txt");
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Make thisText.txt or run writer first");
		}
		boolean readlastLine = false;
		while (!readlastLine) {
			if (!in.ready()) {
				System.out.println("Read last line");
				readlastLine = true;
			} else
				System.out.println(in.readLine());

		}
		in.close();
	}
}
