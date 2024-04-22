package javaSwing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class giaithuaswing {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaithuaswing window = new giaithuaswing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public giaithuaswing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setTitle("Giai thừa");
		frame.setBounds(100, 100, 324, 234);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nhập số nguyên:");
		lblNewLabel.setBounds(40, 53, 107, 31);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(160, 59, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Tính");
		btnNewButton.setBounds(115, 94, 85, 21);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Kết quả:");
		lblNewLabel_1.setBounds(66, 171, 163, 13);
		frame.getContentPane().add(lblNewLabel_1);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n = Integer.parseInt(textField.getText());
					long factorial = calculateRecursiveFactorial(n);
					lblNewLabel_1.setText("Result: " + factorial);
				} catch (NumberFormatException ex) {
					lblNewLabel_1.setText("Result: Invalid input");
				}
			}

			private long calculateRecursiveFactorial(int n) {
				if (n == 0 || n == 1)
					return 1;
				else
					return n * calculateRecursiveFactorial(n - 1);
			}

		});
	}

}
