import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HelloWindow implements ActionListener {
	public final int TEXT_FIELD_WIDTH = 16;
	public final int TO_BOX_HIEGHT = 4;
	private final int ATTACH_BOX_HEIGHT = 4;
	private final int TEXT_BOX_HEIGHT = 4;

	private JFrame window;

	private JPanel mainPanel;

	private JLabel createdByLabel, fromLabel, toLabel, subjectLabel, attachLabel, textLabel;

	private JTextField createdByField, fromField, subjectField;

	private JTextArea toArea, attachArea, textArea;

	private JButton addToButton, addAttachButton;

	public static void main(String[] args) {
		HelloWindow myInstance = new HelloWindow();
		myInstance.guiMain();
	}

	public void guiMain() {
		window = new JFrame("Dat window booi");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initGUI();
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	private void initGUI() {
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

		addToButton.addActionListener(this);
		addAttachButton.addActionListener(this);

		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(6, 3));
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addToButton)
			JOptionPane.showMessageDialog(window, "Clicked the add to button");
		else if (e.getSource() == addAttachButton)
			JOptionPane.showMessageDialog(window, "Clicked the add attachments button");
	}
}
