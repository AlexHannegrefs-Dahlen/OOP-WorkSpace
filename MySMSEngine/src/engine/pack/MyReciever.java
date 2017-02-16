package engine.pack;

import edu.neumont.csc150.TextMessageReceiverExercise.ISMSReceiver;
import edu.neumont.csc150.TextMessageReceiverExercise.SMSCommunicationEngine;

public class MyReciever implements ISMSReceiver {
	public static void main(String[] args) {
		SMSCommunicationEngine engine = new SMSCommunicationEngine();
		engine.registerReceiver(new MyReciever());
		engine.startReceivingMessages(9999);
	}

	@Override
	public void messageReceived(String arg0) {
		System.out.println(arg0);
	}

}
