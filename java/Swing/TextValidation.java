import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextValidation extends JFrame implements ActionListener {
    JPasswordField passwordTextField;
    JLabel resultLabel;
    JButton validateButton;

    public TextValidation() {
        setTitle("Text Validation");
        setSize(400, 300);
        setLayout(new GridLayout(4, 3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setName("resultLabel");

        passwordTextField = new JPasswordField();
        passwordTextField.setName("passwordTextField");

        validateButton = new JButton("Validate");
        validateButton.setName("validateButton");
        validateButton.addActionListener(this);

        add(new JLabel("Text:", SwingConstants.CENTER));
        add(passwordTextField);
        add(validateButton);
        add(resultLabel);

        setVisible(true);
    }

    public boolean hasSpecialChars(String input) {
        return !input.matches("[a-zA-Z0-9]+");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = new String(passwordTextField.getPassword());
        if(hasSpecialChars(input)) {
            resultLabel.setText("Has special characters");
        } else {
            resultLabel.setText("No special characters");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextValidation::new);
    }
}
