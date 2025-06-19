import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingText extends JFrame {
    JTextField wordTextField;
    JLabel messageLabel;

    public SwingText() {
        setTitle("Text Length Checker");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        wordTextField = new JTextField();
        wordTextField.setName("wordTextField");

        messageLabel = new JLabel("");
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

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingText();
            }
        });
    }
}