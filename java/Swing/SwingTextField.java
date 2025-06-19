import java.awt.event.*;
import javax.swing.*;

public class SwingTextField extends JFrame implements ActionListener {
    JTextField textField;
    JButton enableButton, disableButton;

    public SwingTextField() {
        setTitle("Text Field Enable/Disable");
        setSize(350, 250);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 100, 250, 30);
        textField.setName("textField");

        enableButton = new JButton("Enable");
        enableButton.setBounds(50, 150, 100, 30);
        enableButton.setName("enableButton");
        enableButton.addActionListener(this);

        disableButton = new JButton("Disable");
        disableButton.setBounds(200, 150, 100, 30);
        disableButton.setName("disableButton");
        disableButton.addActionListener(this);

        add(textField);
        add(enableButton);
        add(disableButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enableButton) {
            textField.setEnabled(true);
        } else if (e.getSource() == disableButton) {
            textField.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingTextField::new);
    }
}
