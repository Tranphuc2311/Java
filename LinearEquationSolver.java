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

public class LinearEquationSolver extends JFrame {

	private JTextField coefficientAField;
	private JTextField coefficientBField;
	private JButton solveButton;
	private JLabel resultLabel;

	public LinearEquationSolver() {
		initializeUI();
	}

	private void initializeUI() {
		setTitle("Linear Equation Solver");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(4, 2));

		JLabel labelA = new JLabel("Enter coefficient a:");
		mainPanel.add(labelA);
		coefficientAField = new JTextField();
		mainPanel.add(coefficientAField);

		JLabel labelB = new JLabel("Enter coefficient b:");
		mainPanel.add(labelB);
		coefficientBField = new JTextField();
		mainPanel.add(coefficientBField);

		solveButton = new JButton("Solve");
		solveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				solveEquation();
			}
		});
		mainPanel.add(solveButton);

		resultLabel = new JLabel("Result: ");
		mainPanel.add(resultLabel);

		add(mainPanel);
		setVisible(true);
	}

	private void solveEquation() {
		try {
			double a = Double.parseDouble(coefficientAField.getText());
			double b = Double.parseDouble(coefficientBField.getText());
			if (a == 0) {
				resultLabel.setText("No solution (a cannot be zero)");
			} else {
				double x = -b / a;
				resultLabel.setText("Solution: x = " + x);
			}
		} catch (NumberFormatException ex) {
			resultLabel.setText("Invalid input");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LinearEquationSolver();
			}
		});
	}
}
