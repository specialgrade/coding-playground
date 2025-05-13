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
        wordCountLabel.setBounds(50, 50, 150, 30);
        wordCountLabel.setName("wordCountLabel");

        charCountLabel = new Label();
        charCountLabel.setBounds(50, 90, 150, 30);
        charCountLabel.setName("charCountLabel");

        countButton = new Button("Display Count");
        countButton.setBounds(220, 60, 100, 30);
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
        String input = textArea.getText().trim();
        int wordCount = input.isEmpty() ? 0 : input.split("\\s+").length;
        int charCount = input.length();

        wordCountLabel.setText(String.valueOf(wordCount));
        charCountLabel.setText(String.valueOf(charCount));
    }

    public static void main(String[] args) {
        new TextSegregation();
    }
}
