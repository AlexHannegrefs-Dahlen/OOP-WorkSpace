import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HelloWindow {
	public final static int TEXT_FIELD_WIDTH = 10;
	public final static int TO_BOX_HIEGHT = 4;
	private static final int ATTACH_BOX_HEIGHT = 2;
	private static final int TEXT_BOX_HEIGHT = 8;

	private static JFrame window;

	private static JPanel mainPanel;

	private static JLabel createdByLabel, fromLabel, toLabel, subjectLabel, attachLabel, textLabel;

	private static JTextField createdByField, fromField, subjectField;

	private static JTextArea toArea, attachArea, textArea;

	private static JButton addToButton, addAttachButton;

	public static void main(String[] args) {
		window = new JFrame("Dat window booi");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initGUI();

		window.setVisible(true);
	}

	private static void initGUI() {
		createdByLabel = new JLabel("Created By:");
		fromLabel = new JLabel("From:");
		toLabel = new JLabel("To:");
		subjectLabel = new JLabel("Subject:");
		attachLabel = new JLabel("Attachements:");
		textLabel = new JLabel("Message:");

		createdByField = new JTextField(TEXT_FIELD_WIDTH);
		fromField = new JTextField(TEXT_FIELD_WIDTH);
		toArea = new JTextArea(TO_BOX_HIEGHT, TEXT_FIELD_WIDTH);
		subjectField = new JTextField(TEXT_FIELD_WIDTH);
		attachArea = new JTextArea(ATTACH_BOX_HEIGHT, TEXT_FIELD_WIDTH);
		textArea = new JTextArea(TEXT_BOX_HEIGHT, TEXT_FIELD_WIDTH);

		addToButton = new JButton("Add");
		addAttachButton = new JButton("Add");
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 3));
		mainPanel.add(createdByLabel);
		mainPanel.add(createdByField);
		mainPanel.add(new JPanel());
		mainPanel.add(fromLabel);
		mainPanel.add(fromField);
		mainPanel.add(new JPanel());
		mainPanel.add(toLabel);
		mainPanel.add(toArea);
		mainPanel.add(addToButton);
		mainPanel.add(subjectLabel);
		mainPanel.add(subjectField);
		mainPanel.add(new JPanel());
		mainPanel.add(attachLabel);
		mainPanel.add(attachArea);
		mainPanel.add(addAttachButton);
		mainPanel.add(textLabel);
		mainPanel.add(textArea);

		window.getContentPane().add(mainPanel);
	}
}
