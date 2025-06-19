import java.awt.*;
import java.awt.event.*;

public class TextDisplay extends Frame implements ActionListener {
    TextField nameTextField;
    Label nameLabel;
    Button displayButton;

    public TextDisplay() {
        setTitle("Text Display");
        setSize(350, 250);
        setLayout(null);

        nameTextField = new TextField();
        nameTextField.setBounds(50, 100, 250, 30);
        nameTextField.setName("nameTextField");

        nameLabel = new Label();
        nameLabel.setBounds(50, 190, 250, 20);
        nameLabel.setName("nameLabel");

        displayButton = new Button("Display Text");
        displayButton.setBounds(100, 150, 100, 30);
        displayButton.setName("displayButton");
        displayButton.addActionListener(this);

        add(nameTextField);
        add(nameLabel);
        add(displayButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = nameTextField.getText();
        nameLabel.setText("" + input);
    }

    public static void main(String[] args) {
        new TextDisplay();
    }
}
