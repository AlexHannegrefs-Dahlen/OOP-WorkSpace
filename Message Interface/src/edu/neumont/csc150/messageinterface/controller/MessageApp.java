package edu.neumont.csc150.messageinterface.controller;

import java.io.File;
import java.io.IOException;

import edu.neumont.csc150.messageinterface.model.messageMaker;
import edu.neumont.csc150.messageinterface.view.MessageUI;

public class MessageApp {

	public class UserAction {
		public static final int EXIT = 0;
		public static final int CREATE_MESSAGE = 1;
		public static final int SET_SUBJECT = 2;
		public static final int SET_BODY = 3;
		public static final int ADD_RECIPIENT = 4;
		public static final int ADD_ATTACHMENT = 5;
		public static final int DISPLAY_MESSAGE = 6;
		public static final int SAVE = 7;
		public static final int LOAD = 8;
		public static final int COUNT_OF_USER_ACTIONS = 9;
	}

	private MessageUI ui = new MessageUI();

	private messageMaker msg;

	private String fromEmail;

	private boolean isExitTime = false;

	public void run() throws IOException, ClassNotFoundException {
		ui.displayString("Welcome");
		if (ui.startANewMessage()) {
			this.setFromEmail(ui.getFromEmailFromUser());
			this.handleUserSelection(UserAction.CREATE_MESSAGE);
		} else
			this.handleUserSelection(UserAction.LOAD);
		while (!isExitTime) {
			int selection = ui.getMainMenuSelection();
			this.handleUserSelection(selection);
		}
	}

	private void handleUserSelection(int selection) throws IOException, ClassNotFoundException {
		switch (selection) {
		case UserAction.EXIT:
			ui.displayString("Exit");
			isExitTime = true;
			break;
		case UserAction.CREATE_MESSAGE:
			this.msg = new messageMaker();
			this.msg.setSender(fromEmail);
			ui.displayString("New message created");
			break;
		case UserAction.SET_SUBJECT:
			this.handleSetSubject();
			ui.displayString("Subject set");
			break;
		case UserAction.SET_BODY:
			this.handleSetBody();
			ui.displayString("Body set");
			break;
		case UserAction.ADD_RECIPIENT:
			this.handleAddRecipient();
			ui.displayString("Recipient added");
			break;
		case UserAction.ADD_ATTACHMENT:
			this.handleAddAttachment();
			ui.displayString("Attachment added");
			break;
		case UserAction.DISPLAY_MESSAGE:
			ui.displayString(this.msg.toString());
			break;
		case UserAction.SAVE:
			this.handleSave();
			ui.displayString("Message Save");
			break;
		case UserAction.LOAD:
			this.handleLoad();
			ui.displayString("Message Loaded");
			break;
		default:
			throw new IllegalArgumentException("unrecognized selection: " + selection);
		}

	}

	private void handleLoad() throws IOException, ClassNotFoundException {
		msg = new messageMaker();
		msg = this.msg.loadMessage();
	}

	private void handleSave() throws IOException {
		this.msg.saveMessage(msg);
	}

	private void handleAddAttachment() throws IOException {
		File attachment = new File(ui.getAttachmentFile());
		this.msg.addAttachment(attachment);
	}

	private void handleAddRecipient() throws IOException {
		this.msg.addRecipient(ui.getRecipient());
	}

	private void handleSetBody() throws IOException {
		this.msg.setMessageBody(ui.getMessageBody());
	}

	private void handleSetSubject() throws IOException {
		this.msg.setSubject(ui.getMessageSubject());
	}

	/**
	 * @return the username
	 */
	public String getFromEmail() {
		return fromEmail;
	}

	/**
	 * @param fromEmail
	 *            the username to set
	 */
	public void setFromEmail(String fromEmail) {
		if (fromEmail == null || fromEmail.length() == 0) {

		}
		this.fromEmail = fromEmail;
	}

}
