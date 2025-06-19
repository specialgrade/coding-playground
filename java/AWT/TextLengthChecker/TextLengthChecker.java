import java.awt.*;
import java.awt.event.*;

public class TextLengthChecker extends Frame {
    TextField wordTextField;
    Label messageLabel;

    public TextLengthChecker() {
        setTitle("Text Length Checker");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        wordTextField = new TextField();
        wordTextField.setName("wordTextField");

        messageLabel = new Label("");
        messageLabel.setName("messageLabel");
        
        add(wordTextField, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.CENTER);

        wordTextField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String input = wordTextField.getText();
                if(input.length() <= 10) {
                    messageLabel.setText("The text is short.");
                } else {
                    messageLabel.setText("The text is long.");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextLengthChecker();
    }
}