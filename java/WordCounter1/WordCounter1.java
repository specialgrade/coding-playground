import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WordCounter1 extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton countButton;
    private JLabel wordLabel, charLabel;

    public WordCounter1() {
        setTitle("Word Counter");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text area
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Count button
        countButton = new JButton("Count Words & Characters");
        countButton.addActionListener(this);

        // Labels
        wordLabel = new JLabel("Words: 0");
        charLabel = new JLabel("Characters: 0");

        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));
        bottomPanel.add(wordLabel);
        bottomPanel.add(charLabel);

        add(new JLabel("Enter your text below:"), BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(countButton, BorderLayout.SOUTH);
        add(bottomPanel, BorderLayout.EAST);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText().trim();
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
        int charCount = text.replaceAll("\\s", "").length();

        wordLabel.setText("Words: " + wordCount);
        charLabel.setText("Characters: " + charCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WordCounter1::new);
    }
}
