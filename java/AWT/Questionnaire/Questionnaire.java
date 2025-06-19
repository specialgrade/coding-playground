import java.awt.*;
import java.awt.event.*;

public class Questionnaire extends Frame implements ActionListener {
    Label resultLabel;
    Button checkButton;
    CheckboxGroup group;
    Checkbox charCheckBox, booleanCheckBox, intCheckBox, stringCheckBox;

    public Questionnaire() {
        setTitle("Questionnaire");
        setSize(400, 500);
        setLayout(null);
    
        group = new CheckboxGroup();
        charCheckBox = new Checkbox("char", group, false);
        charCheckBox.setBounds(150, 90, 200, 30);
        charCheckBox.setName("charCheckBox");

        booleanCheckBox = new Checkbox("boolean", group, false);
        booleanCheckBox.setBounds(150, 130, 200, 30);
        booleanCheckBox.setName("booleanCheckBox");

        intCheckBox = new Checkbox("int", group, false);
        intCheckBox.setBounds(150, 170, 200, 30);
        intCheckBox.setName("intCheckBox");

        stringCheckBox = new Checkbox("String", group, false);
        stringCheckBox.setBounds(150, 210, 200, 30);
        stringCheckBox.setName("stringCheckBox");

        checkButton = new Button("Check");
        checkButton.setBounds(150, 250, 200, 30);
        checkButton.setName("checkButton");
        checkButton.addActionListener(this);

        resultLabel = new Label("");
        resultLabel.setBounds(150, 290, 200, 30);
        resultLabel.setName("resultLabel");

        add(charCheckBox);
        add(booleanCheckBox);
        add(intCheckBox);
        add(stringCheckBox);
        add(checkButton);
        add(resultLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Checkbox selected = group.getSelectedCheckbox();
        if(selected == stringCheckBox) {
            resultLabel.setText("Correct!");
        } else {
            resultLabel.setText("Incorrect!");
        }
    }

    public static void main(String[] args) {
        new Questionnaire();
    }
}