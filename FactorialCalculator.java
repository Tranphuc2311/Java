package javaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FactorialCalculator extends JFrame {
	JTextField textField = new JTextField();
	JButton calculateButton = new JButton("Calculate");
	JLabel resultLabel = new JLabel("Result: ");

	public FactorialCalculator() {
		setTitle("Factorial Calculator");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initComponents();
	}

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));

		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateFactorial();
			}
		});

		panel.add(textField);
		panel.add(calculateButton);
		panel.add(resultLabel);

		add(panel);
	}

	private void calculateFactorial() {
		try {
			int n = Integer.parseInt(textField.getText());
			long factorial = calculateRecursiveFactorial(n);
			resultLabel.setText("Result: " + factorial);
		} catch (NumberFormatException ex) {
			resultLabel.setText("Result: Invalid input");
		}
	}

	private long calculateRecursiveFactorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * calculateRecursiveFactorial(n - 1);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FactorialCalculator().setVisible(true);
			}
		});
	}
}