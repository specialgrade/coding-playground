import java.awt.*;
import java.awt.event.*;

public class TextRepeater extends Frame implements ActionListener {
    TextField stringTextField, numberTextField;
    Button displayTextButton;
    TextArea resultTextArea;

    public TextRepeater() {
        setTitle("Text Repeater");
        setSize(400, 350);
        setLayout(null);

        stringTextField = new TextField();
        stringTextField.setBounds(50, 50, 250, 30);
        stringTextField.setName("stringTextField");

        numberTextField = new TextField();
        numberTextField.setBounds(50, 100, 250, 30);
        numberTextField.setName("numberTextField");

        displayTextButton = new Button("Display Text");
        displayTextButton.setBounds(200, 150, 100, 30);
        displayTextButton.setName("displayTextButton");
        displayTextButton.addActionListener(this);

        resultTextArea = new TextArea();
        resultTextArea.setBounds(50, 200, 250, 100);
        resultTextArea.setName("resultTextArea");

        add(stringTextField);
        add(numberTextField);
        add(displayTextButton);
        add(resultTextArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String result = "", str = stringTextField.getText();
        int i, num = Integer.parseInt(numberTextField.getText());

        for(i = 0; i < num; i++) {
            result += str + " ";
        }
        resultTextArea.setText(result.trim());
    }

    public static void main(String[] args) {
        new TextRepeater();
    }
}
