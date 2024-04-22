package javaSwing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AverageScoreCalculator {

    private JFrame frame;
    private JTextField textFieldMath;
    private JTextField textFieldPhysics;
    private JTextField textFieldChemistry;
    private JTextField textFieldLiterature;
    private JLabel lblResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AverageScoreCalculator window = new AverageScoreCalculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AverageScoreCalculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 414, 239);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblMath = new JLabel("Math:");
        lblMath.setBounds(10, 11, 100, 20);
        panel.add(lblMath);

        textFieldMath = new JTextField();
        textFieldMath.setBounds(120, 11, 150, 20);
        panel.add(textFieldMath);
        textFieldMath.setColumns(10);

        JLabel lblPhysics = new JLabel("Physics:");
        lblPhysics.setBounds(10, 42, 100, 20);
        panel.add(lblPhysics);

        textFieldPhysics = new JTextField();
        textFieldPhysics.setColumns(10);
        textFieldPhysics.setBounds(120, 42, 150, 20);
        panel.add(textFieldPhysics);

        JLabel lblChemistry = new JLabel("Chemistry:");
        lblChemistry.setBounds(10, 73, 100, 20);
        panel.add(lblChemistry);

        textFieldChemistry = new JTextField();
        textFieldChemistry.setColumns(10);
        textFieldChemistry.setBounds(120, 73, 150, 20);
        panel.add(textFieldChemistry);

        JLabel lblLiterature = new JLabel("Literature:");
        lblLiterature.setBounds(10, 104, 100, 20);
        panel.add(lblLiterature);

        textFieldLiterature = new JTextField();
        textFieldLiterature.setColumns(10);
        textFieldLiterature.setBounds(120, 104, 150, 20);
        panel.add(textFieldLiterature);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAverage();
            }
        });
        btnCalculate.setBounds(120, 135, 89, 23);
        panel.add(btnCalculate);

        lblResult = new JLabel("");
        lblResult.setBounds(10, 169, 394, 14);
        panel.add(lblResult);
    }

    private void calculateAverage() {
        try {
            double math = Double.parseDouble(textFieldMath.getText());
            double physics = Double.parseDouble(textFieldPhysics.getText());
            double chemistry = Double.parseDouble(textFieldChemistry.getText());
            double literature = Double.parseDouble(textFieldLiterature.getText());

            if (math < 0 || math > 10 || physics < 0 || physics > 10 || chemistry < 0 || chemistry > 10 || literature < 0 || literature > 10) {
                lblResult.setText("Error: Scores must be between 0 and 10");
                return;
            }

            double average = (math + physics + chemistry + literature) / 4;
            lblResult.setText("Average score: " + average);
        } catch (NumberFormatException ex) {
            lblResult.setText("Error: Invalid input");
        }
    }
}
