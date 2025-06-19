import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingKeyEvent extends JFrame {
    JTextArea editableTextArea, nonEditableTextArea;

    public SwingKeyEvent() {
        setTitle("Key Event Act");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        editableTextArea = new JTextArea();
        editableTextArea.setName("editableTextArea");

        nonEditableTextArea = new JTextArea();
        nonEditableTextArea.setName("nonEditableTextArea");
        nonEditableTextArea.setEditable(false);

        editableTextArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String inputText = editableTextArea.getText();
                String modifiedInput = vowelsToUppercase(inputText);
                nonEditableTextArea.setText(modifiedInput);
            }
        });

        add(new JScrollPane(editableTextArea), BorderLayout.CENTER);
        add(new JScrollPane(nonEditableTextArea), BorderLayout.SOUTH);

        setVisible(true);
    }

    private String vowelsToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch)) != -1) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        new SwingKeyEvent();
    }
}
