import java.awt.event.*;
import javax.swing.*;

public class SwingTextRepeater extends JFrame implements ActionListener {
    JTextField stringTextField, numberTextField;
    JButton displayTextButton;
    JTextArea resultTextArea;

    public SwingTextRepeater() {
        setTitle("Text Repeater");
        setSize(400, 350);
        setLayout(null);

        stringTextField = new JTextField();
        stringTextField.setBounds(50, 50, 250, 30);
        stringTextField.setName("stringTextField");

        numberTextField = new JTextField();
        numberTextField.setBounds(50, 100, 250, 30);
        numberTextField.setName("numberTextField");

        displayTextButton = new JButton("Display");
        displayTextButton.setBounds(200, 150, 100, 30);
        displayTextButton.setName("displayTextButton");
        displayTextButton.addActionListener(this);

        resultTextArea = new JTextArea();
        resultTextArea.setBounds(50, 200, 250, 100);
        resultTextArea.setName("resultTextArea");
        resultTextArea.setLineWrap(true);
        resultTextArea.setWrapStyleWord(true);

        add(stringTextField);
        add(numberTextField);
        add(displayTextButton);
        add(resultTextArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String str = stringTextField.getText();
        String numText = numberTextField.getText();
        StringBuilder result = new StringBuilder();

        try {
            int num = Integer.parseInt(numText);
            for (int i = 0; i < num; i++) {
                result.append(str).append(" ");
            }
            resultTextArea.setText(result.toString().trim());
        } catch (NumberFormatException ex) {
            resultTextArea.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingTextRepeater::new);
    }
}
