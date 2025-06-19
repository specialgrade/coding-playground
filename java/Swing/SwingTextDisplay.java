import java.awt.event.*;
import javax.swing.*;

public class SwingTextDisplay extends JFrame implements ActionListener {
    JTextField nameTextField;
    JLabel nameLabel;
    JButton displayButton;

    public SwingTextDisplay() {
        setTitle("Text Display");
        setSize(350, 250);
        setLayout(null);

        nameTextField = new JTextField();
        nameTextField.setBounds(50, 100, 250, 30);
        nameTextField.setName("inputTextField");

        nameLabel = new JLabel("");
        nameLabel.setBounds(50, 190, 250, 20);
        nameLabel.setName("displayLabel");

        displayButton = new JButton();
        displayButton.setBounds(100, 150, 100, 30);
        displayButton.setName("displayButton");
        displayButton.addActionListener(this);

        add(nameTextField);
        add(nameLabel);
        add(displayButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = nameTextField.getText();
        nameLabel.setText(input);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingTextDisplay::new);
    }
}
