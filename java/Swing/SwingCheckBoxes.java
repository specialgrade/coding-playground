import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class SwingCheckBoxes extends JFrame implements ActionListener {
    JCheckBox firstCheckBox, secondCheckBox, thirdCheckBox;
    JButton displaySelectedButton;
    JLabel checkBoxesLabel;

    public SwingCheckBoxes() {
        setTitle("CheckBoxes");
        setSize(350, 250);
        setLayout(null);

        firstCheckBox = new JCheckBox("First");
        firstCheckBox.setBounds(50, 50, 100, 20);
        firstCheckBox.setName("firstCheckBox");

        secondCheckBox = new JCheckBox("Second");
        secondCheckBox.setBounds(50, 80, 100, 20);
        secondCheckBox.setName("secondCheckBox");

        thirdCheckBox = new JCheckBox("Third");
        thirdCheckBox.setBounds(50, 110, 100, 20);
        thirdCheckBox.setName("thirdCheckBox");

        displaySelectedButton = new JButton("Display");
        displaySelectedButton.setBounds(100, 150, 100, 30);
        displaySelectedButton.setName("displaySelectedButton");
        displaySelectedButton.addActionListener(this);

        checkBoxesLabel = new JLabel();
        checkBoxesLabel.setBounds(50, 190, 250, 20);
        checkBoxesLabel.setName("checkBoxesLabel");

        add(firstCheckBox);
        add(secondCheckBox);
        add(thirdCheckBox);
        add(displaySelectedButton);
        add(checkBoxesLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        List<String> selected = new ArrayList<>();

        if (firstCheckBox.isSelected()) selected.add("First");
        if (secondCheckBox.isSelected()) selected.add("Second");
        if (thirdCheckBox.isSelected()) selected.add("Third");

        checkBoxesLabel.setText(String.join(", ", selected));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingCheckBoxes::new);
    }
}
