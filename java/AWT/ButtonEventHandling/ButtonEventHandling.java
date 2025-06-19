import java.awt.*;
import java.awt.event.*;

public class ButtonEventHandling extends Frame {
    Checkbox smallCheckBox, mediumCheckBox, largeCheckBox;
    Label helperLabel;
    Button mainButton;
    Panel checkboxPanel, centerPanel;

    final int SMALL_WIDTH = 80;
    final int SMALL_HEIGHT = 30;

    public ButtonEventHandling() {
        setTitle("Button Event Handling");
        setSize(600, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        checkboxPanel = new Panel(new FlowLayout());
        smallCheckBox = new Checkbox("Small");
        smallCheckBox.setName("smallCheckBox");
        smallCheckBox.setState(true);

        mediumCheckBox = new Checkbox("Medium");
        mediumCheckBox.setName("mediumCheckBox");

        largeCheckBox = new Checkbox("Large");
        largeCheckBox.setName("largeCheckBox");
        
        checkboxPanel.add(smallCheckBox);
        checkboxPanel.add(mediumCheckBox);
        checkboxPanel.add(largeCheckBox);
        
        mainButton = new Button("Button");
        mainButton.setName("mainButton");
        mainButton.setSize(SMALL_WIDTH, SMALL_HEIGHT);

        helperLabel = new Label("");
        helperLabel.setName("helperLabel");

        ItemListener checkboxListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox selected = (Checkbox) e.getSource();
                smallCheckBox.setState(selected == smallCheckBox);
                mediumCheckBox.setState(selected == mediumCheckBox);
                largeCheckBox.setState(selected == largeCheckBox);

                if(selected == smallCheckBox) {
                    mainButton.setSize(SMALL_WIDTH, SMALL_HEIGHT);
                } else if(selected == mediumCheckBox) {
                    mainButton.setSize(SMALL_WIDTH * 2, SMALL_HEIGHT * 2);
                } else if(selected == largeCheckBox) {
                    mainButton.setSize(SMALL_WIDTH * 3, SMALL_HEIGHT * 3);
                }
            }
        };

        smallCheckBox.addItemListener(checkboxListener);
        mediumCheckBox.addItemListener(checkboxListener);
        largeCheckBox.addItemListener(checkboxListener);
        
        MouseAdapter hoverListener = new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == smallCheckBox) {
                    helperLabel.setText("Set the button's size to small");
                } else if (e.getSource() == mediumCheckBox) {
                    helperLabel.setText("Set the button's size to medium");
                } else if (e.getSource() == largeCheckBox) {
                    helperLabel.setText("Set the button's size to large");
                }
            }

            public void mouseExited(MouseEvent e) {
                helperLabel.setText(""); 
            }
        };

        smallCheckBox.addMouseListener(hoverListener);
        mediumCheckBox.addMouseListener(hoverListener);
        largeCheckBox.addMouseListener(hoverListener);

        centerPanel = new Panel();
        centerPanel.add(mainButton);

        add(checkboxPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(helperLabel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEventHandling();
    }
}