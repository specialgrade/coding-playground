import java.awt.*;
import java.awt.event.*;

public class TextFieldDisplay extends Frame implements ActionListener {
    TextField textField;
    Button enableButton, disableButton;

    public TextFieldDisplay() {
        setTitle("Text Field Enable/Disable");
        setSize(350, 250);
        setLayout(null);

        textField = new TextField();
        textField.setBounds(50, 100, 250, 30);
        textField.setName("textField");

        enableButton = new Button("Enable");
        enableButton.setBounds(50, 150, 100, 30);
        enableButton.setName("enableButton");
        enableButton.addActionListener(this);

        disableButton = new Button("Disable");
        disableButton.setBounds(200, 150, 100, 30);
        disableButton.setName("disableButton");
        disableButton.addActionListener(this);

        add(textField);
        add(enableButton);
        add(disableButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enableButton) textField.setEnabled(true);
        if(e.getSource() == disableButton) textField.setEnabled(false);
        
    }

    public static void main(String[] args) {
        new TextFieldDisplay();
    }
}
