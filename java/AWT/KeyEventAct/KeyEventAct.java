import java.awt.*;
import java.awt.event.*;

public class KeyEventAct extends Frame {
    TextArea editableTextArea, nonEditableTextArea;
        
    public KeyEventAct() {
        setTitle("Key Event Act");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        editableTextArea = new TextArea();
        editableTextArea.setName("editableTextArea");

        nonEditableTextArea = new TextArea();
        nonEditableTextArea.setName("nonEditableTextArea");
        nonEditableTextArea.setEditable(false);

        editableTextArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String inputText = editableTextArea.getText();
                String modifiedInput = vowelsToUppercase(inputText);
                nonEditableTextArea.setText(modifiedInput);
            }
        });

        add(editableTextArea, BorderLayout.CENTER);
        add(nonEditableTextArea, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private String vowelsToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for(char ch : input.toCharArray()) {
            if("aeiou".indexOf(Character.toLowerCase(ch)) != -1) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        new KeyEventAct();
    }
}