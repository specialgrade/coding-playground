import java.awt.*;
import java.awt.event.*;

public class MostFrequentCharacter extends Frame {
    TextArea textArea;
    Label frequentCharLabel;

    public MostFrequentCharacter() {
        setTitle("Most Frequent Character");
        setSize(600, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        textArea = new TextArea();
        textArea.setName("textArea");

        frequentCharLabel = new Label();
        frequentCharLabel.setName("frequentCharLabel");

        add(textArea, BorderLayout.CENTER);
        add(frequentCharLabel, BorderLayout.SOUTH);

        textArea.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                updateMostFrequentChar();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
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
        new MostFrequentCharacter();
    }
}