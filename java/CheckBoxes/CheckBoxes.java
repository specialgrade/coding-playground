import java.awt.*;
import java.awt.event.*;

public class CheckBoxes extends Frame implements ActionListener {
    Checkbox firstCheckBox, secondCheckBox, thirdCheckBox;
    Button displaySelectedButton;
    Label checkBoxesLabel;

    public CheckBoxes() {
        setTitle("CheckBoxes");
        setSize(350, 250);
        setLayout(null);

        firstCheckBox = new Checkbox("First");
        firstCheckBox.setBounds(50, 50, 100, 20);
        firstCheckBox.setName("firstCheckBox");

        secondCheckBox = new Checkbox("Second");
        secondCheckBox.setBounds(50, 80, 100, 20);
        secondCheckBox.setName("secondCheckBox");

        thirdCheckBox = new Checkbox("Third");
        thirdCheckBox.setBounds(50, 110, 100, 20);
        thirdCheckBox.setName("thirdCheckBox");

        displaySelectedButton = new Button("Display");
        displaySelectedButton.setBounds(100, 150, 100, 30);
        displaySelectedButton.setName("displaySelectedButton");
        displaySelectedButton.addActionListener(this);

        checkBoxesLabel = new Label();
        checkBoxesLabel.setBounds(50, 190, 250, 20);
        checkBoxesLabel.setName("checkBoxesLabel");

        add(firstCheckBox);
        add(secondCheckBox);
        add(thirdCheckBox);
        add(displaySelectedButton);
        add(checkBoxesLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        java.util.List<String> selected = new java.util.ArrayList<>();

        if (firstCheckBox.getState()) selected.add("First");
        if (secondCheckBox.getState()) selected.add("Second");
        if (thirdCheckBox.getState()) selected.add("Third");

        checkBoxesLabel.setText(String.join(", ", selected));
    }


    public static void main(String[] args) {
        new CheckBoxes();
    }
}
