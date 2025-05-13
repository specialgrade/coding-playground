import java.awt.*;
import java.awt.event.*;

public class TextSegregation extends Frame implements ActionListener {
    Label wordCountLabel, charCountLabel;
    Button countButton;
    TextArea textArea;

    public TextSegregation() {
        setTitle("Word & Character Counter");
        setSize(400, 350);
        setLayout(null);

        wordCountLabel = new Label();
        wordCountLabel.setBounds(200, 150, 100, 30);
        wordCountLabel.setName("wordCountLabel");

        charCountLabel = new Label();
        charCountLabel.setBounds(200, 150, 100, 30);
        charCountLabel.setName("charCountLabel");

        countButton = new Button("Display Count");
        countButton.setBounds(200, 150, 100, 30);
        countButton.setName("countButton");
        countButton.addActionListener(this);

        textArea = new TextArea();
        textArea.setBounds(50, 200, 250, 100);
        textArea.setName("textArea");

        add(wordCountLabel);
        add(charCountLabel);
        add(countButton);
        add(textArea);

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
        new TextSegregation();
    }
}
