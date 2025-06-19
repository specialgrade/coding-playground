import java.awt.event.*;
import javax.swing.*;

public class SwingQuestionnaire extends JFrame implements ActionListener {
    JLabel resultLabel;
    JButton checkButton;
    ButtonGroup group;
    JRadioButton charRadioButton, booleanRadioButton, intRadioButton, stringRadioButton;

    public SwingQuestionnaire() {
        setTitle("Questionnaire");
        setSize(400, 500);
        setLayout(null);

        group = new ButtonGroup();

        charRadioButton = new JRadioButton("char");
        charRadioButton.setBounds(150, 90, 200, 30);
        charRadioButton.setName("charRadioButton");

        booleanRadioButton = new JRadioButton("boolean");
        booleanRadioButton.setBounds(150, 130, 200, 30);
        booleanRadioButton.setName("booleanRadioButton");

        intRadioButton = new JRadioButton("int");
        intRadioButton.setBounds(150, 170, 200, 30);
        intRadioButton.setName("intRadioButton");

        stringRadioButton = new JRadioButton("String");
        stringRadioButton.setBounds(150, 210, 200, 30);
        stringRadioButton.setName("stringRadioButton");

        group.add(charRadioButton);
        group.add(booleanRadioButton);
        group.add(intRadioButton);
        group.add(stringRadioButton);

        checkButton = new JButton("Check");
        checkButton.setBounds(150, 250, 200, 30);
        checkButton.setName("checkButton");
        checkButton.addActionListener(this);

        resultLabel = new JLabel("");
        resultLabel.setBounds(150, 290, 200, 30);
        resultLabel.setName("resultLabel");

        add(charRadioButton);
        add(booleanRadioButton);
        add(intRadioButton);
        add(stringRadioButton);
        add(checkButton);
        add(resultLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (stringRadioButton.isSelected()) {
            resultLabel.setText("Correct!");
        } else {
            resultLabel.setText("Incorrect!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingQuestionnaire::new);
    }
}
