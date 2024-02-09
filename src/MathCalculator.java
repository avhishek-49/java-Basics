import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MathCalculator extends JFrame {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public MathCalculator() {
        setTitle("Math Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create text fields for input
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);

        // Create label for output
        resultLabel = new JLabel("Result");

        // Create panel for components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Number 2:"));
        panel.add(num2Field);
        panel.add(resultLabel);

        // Add mouse listener to calculate sum and difference
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    private void calculateSum() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int sum = num1 + num2;
            resultLabel.setText("Sum: " + sum);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

    private void calculateDifference() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int difference = num1 - num2;
            resultLabel.setText("Difference: " + difference);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MathCalculator calculator = new MathCalculator();
            calculator.setVisible(true);
        });
    }
}
