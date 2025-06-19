import java.awt.*;
import javax.swing.*;

public class SwingMostFreqChar extends JFrame {
    JTextArea textArea;
    JLabel frequentCharLabel;

    public SwingMostFreqChar() {
        setTitle("Most Frequent Character");
        setSize(600, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setName("textArea");

        frequentCharLabel = new JLabel();
        frequentCharLabel.setName("frequentCharLabel");

        add(textArea, BorderLayout.CENTER);
        add(frequentCharLabel, BorderLayout.SOUTH);

        textArea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                updateMostFrequentChar();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                updateMostFrequentChar();
            }
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                updateMostFrequentChar();
            }
        });

        setVisible(true);
    }

    private void updateMostFrequentChar() {
        String text = textArea.getText().toLowerCase();
        int[] freq = new int[256]; 

        for (char ch : text.toCharArray()) {
            if (ch != ' ' && ch < 256) {
                freq[ch]++;
            }
        }

        int maxCount = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFrequent = (char) i;
            }
        }

        if (maxCount > 0) {
            frequentCharLabel.setText(String.valueOf(mostFrequent));
        } else {
            frequentCharLabel.setText("");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingMostFreqChar::new);
    }
}