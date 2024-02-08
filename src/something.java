import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloAbishekGUI extends JFrame implements ActionListener {
    private JTextField textField;

    public HelloAbishekGUI() {
        setTitle("Hello Abishek");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text field
        textField = new JTextField(20);
        textField.setEditable(false); // Make the text field read-only

        // Create a button
        JButton button = new JButton("Click Me");
        button.addActionListener(this); // Register the button for action events

        // Add components to the frame
        add(textField, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);

        pack(); // Adjust the size of the frame to fit its contents
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    public void actionPerformed(ActionEvent e) {
        // Set the text of the text field when the button is clicked
        textField.setText("Hello Abishek");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HelloAbishekGUI gui = new HelloAbishekGUI();
            gui.setVisible(true); // Display the GUI
        });
    }
}
