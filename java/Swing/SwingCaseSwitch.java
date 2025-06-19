import java.awt.*;
import javax.swing.*;

public class SwingCaseSwitch extends JFrame {
    public SwingCaseSwitch() {
        setTitle("CaseSwitch");
        setSize(500, 400);
        setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("I love programming!");
        textLabel.setName("textLabel");

        JButton switchVowelCaseButton = new JButton("Vowel");
        switchVowelCaseButton.setName("switchVowelCaseButton");

        JButton switchConsonantCaseButton = new JButton("Consonant");
        switchConsonantCaseButton.setName("switchConsonantCaseButton");

        JButton switchAllCaseButton = new JButton("All");
        switchAllCaseButton.setName("switchAllCaseButton");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        buttonPanel.add(switchVowelCaseButton);
        buttonPanel.add(switchConsonantCaseButton);
        buttonPanel.add(switchAllCaseButton);

        add(textLabel);
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        switchVowelCaseButton.addActionListener(e -> {
            String text = textLabel.getText();
            StringBuilder updatedText = new StringBuilder();

            for (char c : text.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    updatedText.append(Character.toUpperCase(c));
                } else if ("AEIOU".indexOf(c) != -1) {
                    updatedText.append(Character.toLowerCase(c));
                } else {
                    updatedText.append(c);
                }
            }

            textLabel.setText(updatedText.toString());
        });

        switchConsonantCaseButton.addActionListener(e -> {
            String text = textLabel.getText();
            StringBuilder updatedText = new StringBuilder();

            for (char c : text.toCharArray()) {
                if (Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c))) {
                    if (Character.isUpperCase(c)) {
                        updatedText.append(Character.toLowerCase(c));
                    } else {
                        updatedText.append(Character.toUpperCase(c));
                    }
                } else {
                    updatedText.append(c);
                }
            }

            textLabel.setText(updatedText.toString());
        });

        switchAllCaseButton.addActionListener(e -> {
            String text = textLabel.getText();
            StringBuilder updatedText = new StringBuilder();

            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (Character.isUpperCase(c)) {
                        updatedText.append(Character.toLowerCase(c));
                    } else {
                        updatedText.append(Character.toUpperCase(c));
                    }
                } else {
                    updatedText.append(c);
                }
            }

            textLabel.setText(updatedText.toString());
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingCaseSwitch::new);
    }
}
