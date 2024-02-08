import javax.swing.*;
import java.awt.event.*;

public class ButtonExample implements ActionListener {
    JButton button;

    public ButtonExample() {
        JFrame frame = new JFrame("Button Example");
        button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 30);
        button.addActionListener(this); // Registering ActionListener
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}

