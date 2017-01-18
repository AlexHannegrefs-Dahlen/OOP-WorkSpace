package edu.neumont.csc150.myClass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.neumont.csc150.messageinterface.Message;

/**
 * 
 * @author Alex
 *
 */
public class messageMaker implements Message {
	private String sender;
	private String messageDate;
	private ArrayList<String> recipients = new ArrayList<>();
	private ArrayList<File> attachmentFiles = new ArrayList<>();
	private String subject;
	private String msg;

	/**
	 * 
	 */
	public messageMaker() {

	}

	/**
	 * 
	 * @param sender
	 * @param subject
	 * @param msg
	 */
	public messageMaker(String sender, String subject, String msg) {
		this.setSender(sender);
		this.setSubject(subject);
		this.setMessageBody(msg);
		this.createDate();
	}

	private String getAllFiles() {
		String file = null;
		for (int i = 0; i < this.attachmentFiles.size(); i++) {
			if (i == 0)
				file = "\t" + this.attachmentFiles.get(i).getPath();
			else
				file += "\n\t" + this.attachmentFiles.get(i).getPath();
		}
		return file;
	}

	private String getAllRecipients() {
		String recipient = null;
		for (int i = 0; i < this.recipients.size(); i++) {
			if (i == 0)
				recipient = this.recipients.get(i);
			else
				recipient += ", " + this.recipients.get(i);
		}
		return recipient;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		String email = "Created-Date: " + this.getCreatedDate() + "\nFROM: " + this.getSender() + "\nTo: "
				+ this.getAllRecipients() + "\nSubject: " + this.getSubject() + "\nMessage Text: \n"
				+ this.getMessageBody() + "\n\nAttachemts: \n" + this.getAllFiles();
		return email;

	}

	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		messageMaker message;
		try {
			message = (messageMaker) obj;
		} catch (Exception e) {
			throw new IllegalArgumentException("Can only check to messages for equality");
		}
		return this.getSender().equals(message.getSender()) && this.getSubject().equals(message.getSubject())
				&& this.getRecipients() == message.getRecipients() && this.msg.equals(message.msg);
	}

	/**
	 * 
	 */
	@Override
	public void addRecipient(String recipient) {

		this.recipients.add(recipient);
	}

	/**
	 * 
	 */
	@Override
	public void addAttachment(File attachmentFile) {
		if (attachmentFile == null) {
			throw new NullPointerException("File attachment cannot be null");
		}
		this.attachmentFiles.add(attachmentFile);
	}

	/**
	 * 
	 */
	@Override
	public void setSubject(String subject) {
		if (subject == null) {
			throw new IllegalArgumentException("Subject cannot be null");
		}
		this.subject = subject;
	}

	/**
	 * 
	 */
	@Override
	public void setMessageBody(String msg) {
		if (msg == null) {
			throw new IllegalArgumentException("Messages cannot be null");
		}
		this.msg = msg;
	}

	/**
	 * 
	 */
	public void createDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.messageDate = dateFormat.format(date);
	}

	/**
	 * 
	 */
	@Override
	public String getCreatedDate() {
		return this.messageDate;
	}

	/**
	 * 
	 * @param sender
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * 
	 */
	@Override
	public String getSender() {
		return this.sender;
	}

	/**
	 * 
	 */
	@Override
	public String getSubject() {
		return this.subject;
	}

	/**
	 * 
	 */
	@Override
	public String getMessageBody() {
		return this.msg;
	}

	/**
	 * 
	 */
	@Override
	public String[] getRecipients() {
		return (String[]) this.recipients.toArray();
	}

	/**
	 * 
	 */
	@Override
	public File[] getAttachments() {
		return (File[]) this.attachmentFiles.toArray();
	}

}