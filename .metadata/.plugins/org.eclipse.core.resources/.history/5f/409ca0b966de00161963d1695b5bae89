package edu.neumont.csc150.tester;

import java.io.File;

import edu.neumont.csc150.myClass.messageMaker;

public class messageTester {

	public static void main(String[] args) {
		messageMaker myMessage = new messageMaker("Alex", "test subject", "test message");
		myMessage.addRecipient("Them");
		myMessage.addRecipient("They");
		File file = new File("C:\\Users\\Alex\\Desktop\\in.txt");
		myMessage.addAttachment(file);
		File file2 = new File("in.txt");
		myMessage.addAttachment(file2);
		System.out.println(myMessage.toString());
	}

}
