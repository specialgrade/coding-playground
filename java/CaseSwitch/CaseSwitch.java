import java.awt.*;
import java.awt.event.*;

public class CaseSwitch extends Frame {
    public CaseSwitch() {
        setTitle("CaseSwitch");
        setSize(500, 400);
        setLayout(new FlowLayout());

        Label textLabel = new Label("I love programming!");
        textLabel.setName("textLabel");

        Button switchVowelCaseButton = new Button("Vowel");
        switchVowelCaseButton.setName("switchVowelCaseButton");

        Button switchConsonantCaseButton = new Button("Consonant");
        switchConsonantCaseButton.setName("switchConsonantCaseButton");

        Button switchAllCaseButton = new Button("All");
        switchAllCaseButton.setName("switchAllCaseButton");

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        buttonPanel.add(switchVowelCaseButton);
        buttonPanel.add(switchConsonantCaseButton);
        buttonPanel.add(switchAllCaseButton);

        add(textLabel);
        add(buttonPanel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        switchVowelCaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textLabel.getText();
                String updatedText = "";

                for(char c : text.toCharArray()) {
                    if("aeiou".indexOf(c) != -1) {
                        updatedText += Character.toUpperCase(c);
                    } else if("AEIOU".indexOf(c) != -1) {
                        updatedText += Character.toLowerCase(c);
                    } else {
                        updatedText += c;
                    }
                    textLabel.setText(updatedText);
                }
            }
        });

        switchConsonantCaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textLabel.getText();
                String updatedText = "";

                for(char c : text.toCharArray()) {
                    if(Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c))) {
                        if(Character.isUpperCase(c)) {
                            updatedText += Character.toLowerCase(c);
                        } else {
                            updatedText += Character.toUpperCase(c);
                        }      
                    } else {
                        updatedText += c;
                    }
                    textLabel.setText(updatedText);
                }
            }
        });

        switchAllCaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textLabel.getText();
                String updatedText = "";

                for(char c : text.toCharArray()) {
                    if(Character.isLetter(c)) {
                        if(Character.isUpperCase(c)) {
                            updatedText += Character.toLowerCase(c);
                        } else {
                            updatedText += Character.toUpperCase(c);
                        }      
                    } else {
                        updatedText += c;
                    }
                    textLabel.setText(updatedText);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CaseSwitch();
    }
}
