import java.awt.*;
import java.awt.event.*;

public class MyPet extends Frame implements ActionListener {
    TextField petNameTextField;
    Choice petTypeChoice;
    Label displayLabel;
    Button generateTextButton;

    public MyPet() {
        setTitle("My Pet");
        setSize(400, 350);
        setLayout(null);

        petNameTextField = new TextField();
        petNameTextField.setBounds(50, 50, 150, 30);
        petNameTextField.setName("petNameTextField");

        petTypeChoice = new Choice();
        petTypeChoice.setBounds(50, 100, 150, 30);
        petTypeChoice.setName("petTypeChoice");
        petTypeChoice.add("Dog");
        petTypeChoice.add("Cat");
        petTypeChoice.add("Rabbit");
        petTypeChoice.add("Parrot");

        generateTextButton = new Button("Generate");
        generateTextButton.setBounds(220, 100, 100, 30);
        generateTextButton.setName("generateTextButton");
        generateTextButton.addActionListener(this);

        displayLabel = new Label();
        displayLabel.setBounds(50, 150, 300, 30);
        displayLabel.setName("displayLabel");

        add(petNameTextField);
        add(petTypeChoice);
        add(generateTextButton);
        add(displayLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        displayLabel.setText("The pet is a " + petTypeChoice.getSelectedItem().toLowerCase() + " named " + petNameTextField.getText().trim());
    }

    public static void main(String[] args) {
        new MyPet();
    }
}
