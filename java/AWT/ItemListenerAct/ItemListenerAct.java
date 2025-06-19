import java.awt.*;
import java.awt.event.*;

public class ItemListenerAct extends Frame {
    Checkbox cCheckBox, cppCheckBox, cSharpCheckBox, javaCheckBox, pythonCheckBox;
    Label languageLabel, proficiencyLabel;
    Choice proficiencyChoice;
    Panel checkboxPanel, proficiencyPanel;

    public ItemListenerAct() {
        setTitle("Item Listener Act");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        checkboxPanel = new Panel(new GridLayout(5, 1));
        cCheckBox = new Checkbox("C");
        cCheckBox.setName("cCheckBox");
        cppCheckBox = new Checkbox("C++");
        cppCheckBox.setName("cppCheckBox");
        cSharpCheckBox = new Checkbox("C#");
        cSharpCheckBox.setName("cSharpCheckBox");
        javaCheckBox = new Checkbox("Java");
        javaCheckBox.setName("javaCheckBox");
        pythonCheckBox = new Checkbox("Python");
        pythonCheckBox.setName("pythonCheckBox");

        checkboxPanel.add(cCheckBox);
        checkboxPanel.add(cppCheckBox);
        checkboxPanel.add(cSharpCheckBox);
        checkboxPanel.add(javaCheckBox);
        checkboxPanel.add(pythonCheckBox);

        languageLabel = new Label("");
        languageLabel.setName("languageLabel");

        proficiencyChoice = new Choice();
        proficiencyChoice.setName("proficiencyChoice");
        proficiencyChoice.add("Low");
        proficiencyChoice.add("Medium");
        proficiencyChoice.add("High");

        proficiencyLabel = new Label("");
        proficiencyLabel.setName("proficiencyLabel");

        proficiencyPanel = new Panel(new GridLayout(2, 1));
        proficiencyPanel.add(proficiencyChoice);
        proficiencyPanel.add(proficiencyLabel);

        ItemListener checkboxListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                StringBuilder selected = new StringBuilder();
                if(cppCheckBox.getState()) selected.append("C++, ");
                if(cCheckBox.getState()) selected.append("C, ");
                if(pythonCheckBox.getState()) selected.append("Python, ");
                if(cSharpCheckBox.getState()) selected.append("C#, ");
                if(javaCheckBox.getState()) selected.append("Java, ");
                
                if(selected.length() > 0) {
                    selected.setLength(selected.length() - 2);
                }
                languageLabel.setText(selected.toString());
            }
        };

        cCheckBox.addItemListener(checkboxListener);
        cppCheckBox.addItemListener(checkboxListener);
        cSharpCheckBox.addItemListener(checkboxListener);
        javaCheckBox.addItemListener(checkboxListener);
        pythonCheckBox.addItemListener(checkboxListener);

        add(checkboxPanel, BorderLayout.WEST);
        add(languageLabel, BorderLayout.SOUTH);
        add(proficiencyPanel, BorderLayout.EAST);

        proficiencyChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                proficiencyLabel.setText(proficiencyChoice.getSelectedItem());
                
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ItemListenerAct();
    }
}