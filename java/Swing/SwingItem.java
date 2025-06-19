import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingItem extends JFrame {
    JCheckBox cCheckBox, cppCheckBox, cSharpCheckBox, javaCheckBox, pythonCheckBox;
    JLabel languageLabel, proficiencyLabel;
    JComboBox<String> proficiencyComboBox;

    public SwingItem() {
        setTitle("Item Listener Act (Swing)");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel checkboxPanel = new JPanel(new GridLayout(5, 1));
        cCheckBox = new JCheckBox("C");
        cCheckBox.setName("cCheckBox");

        cppCheckBox = new JCheckBox("C++");
        cppCheckBox.setName("cppCheckBox");

        cSharpCheckBox = new JCheckBox("C#");
        cSharpCheckBox.setName("cSharpCheckBox");

        javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setName("javaCheckBox");

        pythonCheckBox = new JCheckBox("Python");
        pythonCheckBox.setName("pythonCheckBox");

        checkboxPanel.add(cCheckBox);
        checkboxPanel.add(cppCheckBox);
        checkboxPanel.add(cSharpCheckBox);
        checkboxPanel.add(javaCheckBox);
        checkboxPanel.add(pythonCheckBox);

        languageLabel = new JLabel("");
        languageLabel.setName("languageLabel");

        JPanel proficiencyPanel = new JPanel(new GridLayout(2, 1));
        proficiencyComboBox = new JComboBox<>(new String[] {"Low", "Medium", "High"});
        proficiencyComboBox.setName("proficiencyComboBox");

        proficiencyLabel = new JLabel("");
        proficiencyLabel.setName("proficiencyLabel");

        proficiencyPanel.add(proficiencyComboBox);
        proficiencyPanel.add(proficiencyLabel);

        ItemListener checkboxListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                StringBuilder selected = new StringBuilder();
                if (cppCheckBox.isSelected()) selected.append("C++, ");
                if (cCheckBox.isSelected()) selected.append("C, ");
                if (pythonCheckBox.isSelected()) selected.append("Python, ");
                if (cSharpCheckBox.isSelected()) selected.append("C#, ");
                if (javaCheckBox.isSelected()) selected.append("Java, ");

                if (selected.length() > 0)
                    selected.setLength(selected.length() - 2);
                languageLabel.setText(selected.toString());
            }
        };

        cCheckBox.addItemListener(checkboxListener);
        cppCheckBox.addItemListener(checkboxListener);
        cSharpCheckBox.addItemListener(checkboxListener);
        javaCheckBox.addItemListener(checkboxListener);
        pythonCheckBox.addItemListener(checkboxListener);

        proficiencyComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    proficiencyLabel.setText((String) proficiencyComboBox.getSelectedItem());
                }
            }
        });

        add(checkboxPanel, BorderLayout.WEST);
        add(languageLabel, BorderLayout.SOUTH);
        add(proficiencyPanel, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingItem();
            }
        });
    }
}
