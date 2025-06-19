import java.awt.event.*;
import javax.swing.*;

public class SwingWordChar extends JFrame implements ActionListener {
    JLabel wordCountLabel, charCountLabel;
    JButton countButton;
    JTextArea textArea;

    public SwingWordChar() {
        setTitle("Word & Character Counter");
        setSize(400, 350);
        setLayout(null);

        wordCountLabel = new JLabel();
        wordCountLabel.setBounds(50, 50, 150, 30);
        wordCountLabel.setName("wordCountLabel");

        charCountLabel = new JLabel();
        charCountLabel.setBounds(50, 90, 150, 30);
        charCountLabel.setName("charCountLabel");

        countButton = new JButton("Display Count");
        countButton.setBounds(220, 60, 120, 30);
        countButton.setName("countButton");
        countButton.addActionListener(this);

        textArea = new JTextArea();
        textArea.setBounds(50, 200, 250, 100);
        textArea.setName("textArea");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        add(wordCountLabel);
        add(charCountLabel);
        add(countButton);
        add(textArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        SwingUtilities.invokeLater(SwingWordChar::new);
    }
}
