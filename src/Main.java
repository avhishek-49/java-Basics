
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public Main() {
        setTitle("Sum and Difference Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(num1Field);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(num2Field);
        inputPanel.add(calculateButton);

        resultLabel = new JLabel("Result: ");
        JPanel outputPanel = new JPanel();
        outputPanel.add(resultLabel);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));
        contentPane.add(inputPanel);
        contentPane.add(outputPanel);

        calculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });
    }

    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;
            resultLabel.setText("Sum: " + sum);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    private void calculateDifference() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double difference = num1 - num2;
            resultLabel.setText("Difference: " + difference);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main calculator = new Main();
            calculator.setVisible(true);
        });
    }
}



