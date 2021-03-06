package edu.neumont.csc150.messageinterface.view;

import java.io.IOException;

import ConsoleUI.ConsoleUI;
import edu.neumont.csc150.messageinterface.controller.MessageApp;

public class MessageUI {

	public String getFromEmailFromUser() throws IOException {
		return getRecipient();
	}

	public int getMainMenuSelection() throws IOException {
		final int COUNT_CHOICES = MessageApp.UserAction.COUNT_OF_USER_ACTIONS;
		String[] menuOptions = new String[COUNT_CHOICES];
		menuOptions[MessageApp.UserAction.SET_SUBJECT] = "Set subject";
		menuOptions[MessageApp.UserAction.SET_BODY] = "Set body";
		menuOptions[MessageApp.UserAction.ADD_RECIPIENT] = "Add recipient";
		menuOptions[MessageApp.UserAction.ADD_ATTACHMENT] = "Add attchment";
		menuOptions[MessageApp.UserAction.DISPLAY_MESSAGE] = "Display Message";
		menuOptions[MessageApp.UserAction.SAVE] = "Save message";
		menuOptions[MessageApp.UserAction.LOAD] = "Load message";
		return ConsoleUI.promptForMenuSelection(menuOptions, true);
	}

	public String getAttachmentFile() throws IOException {
		return ConsoleUI.promptForInput("Enter full path for attachment", false);
	}

	public String getRecipient() throws IOException {
		boolean isValid = false;
		String input = null;
		while (!isValid) {
			input = ConsoleUI.promptForInput("Enter email address", false).trim();
			if (input.length() == 0)
				displayString("must enter something");
			else if (!input.contains("@") || !input.contains("."))
				displayString("doesn't look like an email address");
			else
				isValid = true;
		}
		return input;
	}

	public String getMessageBody() throws IOException {
		boolean valid = false;
		String message = null;
		while (!valid) {
			message = ConsoleUI.promptForInput("Enter message", false).trim();
			if (message.length() == 0)
				displayString("Must enter something");
			else
				valid = true;
		}
		return message;
	}

	public String getMessageSubject() throws IOException {
		boolean valid = false;
		String subject = null;
		while (!valid) {
			subject = ConsoleUI.promptForInput("Enter subject", false).trim();
			if (subject.length() == 0)
				displayString("Must enter something");
			else
				valid = true;
		}
		return subject;
	}

	public void displayString(String string) {
		System.out.println(string);
	}

	public boolean startANewMessage() throws IOException {
		return ConsoleUI.promptForBool("New message or load a message? [New/Load]", "New", "Load");
	}

}
