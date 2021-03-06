import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Alex Temp GUI
 */
public class TEMP_GUI implements ActionListener {
	JFrame window = new JFrame("Temp converter");

	JPanel mainpanel = new JPanel();

	JTextField input = new JTextField();
	JTextField output = new JTextField();

	JButton convert = new JButton("Convert");

	/**
	 * Create gui sets window to visible
	 */
	public void initGUI() {
		mainpanel.setLayout(new GridLayout(0, 3));

		Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 36);

		input.setFont(font1);
		input.setSize(50, 140);
		output.setFont(font1);
		output.setSize(550, 140);
		convert.setFont(font1);
		convert.setSize(400, 140);

		mainpanel.add(input);
		mainpanel.add(convert);
		mainpanel.add(output);

		convert.addActionListener(this);

		window.add(mainpanel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1000, 150);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	@Override
	/**
	 * Convert F to C and K when convert is pressed
	 */
	public void actionPerformed(ActionEvent e) {
		output.setText(null);
		String temp = input.getText();
		double FTemp = 0;
		try {
			FTemp = Double.parseDouble(temp);
			double CTemp = (FTemp - 32) * (.555);
			double KTemp = CTemp + 273;
			String Tempoutput = ("C: " + String.valueOf(CTemp) + " K: " + String.valueOf(KTemp));
			output.setText(Tempoutput);
		} catch (Exception E) {
			JOptionPane.showMessageDialog(window, "Invalid input");
		}

	}
}
