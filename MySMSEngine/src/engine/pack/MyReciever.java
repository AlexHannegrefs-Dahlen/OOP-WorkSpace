package engine.pack;

import edu.neumont.csc150.TextMessageReceiverExercise.ISMSReceiver;
import edu.neumont.csc150.TextMessageReceiverExercise.SMSCommunicationEngine;

public class MyReciever implements ISMSReceiver {
	public static void main(String[] args) {
		SMSCommunicationEngine engine = new SMSCommunicationEngine();
		MyReciever reciever = new MyReciever();
		engine.registerReceiver(reciever);
		engine.startReceivingMessages(7);
	}

	@Override
	public void messageReceived(String arg0) {
		System.out.println(arg0);
	}

}
