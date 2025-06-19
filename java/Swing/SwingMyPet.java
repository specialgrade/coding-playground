import java.awt.event.*;
import javax.swing.*;

public class SwingMyPet extends JFrame implements ActionListener {
    JTextField petNameTextField;
    JComboBox<String> petTypeComboBox;
    JLabel displayLabel;
    JButton generateTextButton;

    public SwingMyPet() {
        setTitle("My Pet");
        setSize(400, 350);
        setLayout(null);

        petNameTextField = new JTextField();
        petNameTextField.setBounds(50, 50, 150, 30);
        petNameTextField.setName("petNameTextField");

        petTypeComboBox = new JComboBox<>();
        petTypeComboBox.setBounds(50, 100, 150, 30);
        petTypeComboBox.setName("petTypeComboBox");
        petTypeComboBox.addItem("Dog");
        petTypeComboBox.addItem("Cat");
        petTypeComboBox.addItem("Rabbit");
        petTypeComboBox.addItem("Parrot");

        generateTextButton = new JButton("Generate");
        generateTextButton.setBounds(220, 100, 100, 30);
        generateTextButton.setName("generateTextButton");
        generateTextButton.addActionListener(this);

        displayLabel = new JLabel();
        displayLabel.setBounds(50, 150, 300, 30);
        displayLabel.setName("displayLabel");

        add(petNameTextField);
        add(petTypeComboBox);
        add(generateTextButton);
        add(displayLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String petType = ((String) petTypeComboBox.getSelectedItem()).toLowerCase();
        String petName = petNameTextField.getText().trim();
        displayLabel.setText("The pet is a " + petType + " named " + petName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingMyPet::new);
    }
}
