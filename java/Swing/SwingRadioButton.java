import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingRadioButton extends JFrame {
    JRadioButton smallRadioButton, mediumRadioButton, largeRadioButton;
    JLabel helperLabel;
    JButton mainButton;
    JPanel checkboxPanel, centerPanel;
    ButtonGroup sizeGroup;

    final int SMALL_WIDTH = 80;
    final int SMALL_HEIGHT = 30;

    public SwingRadioButton() {
        setTitle("Event Handling");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        checkboxPanel = new JPanel(new FlowLayout());

        smallRadioButton = new JRadioButton("Small", true);
        smallRadioButton.setName("smallRadioButton");

        mediumRadioButton = new JRadioButton("Medium");
        mediumRadioButton.setName("mediumRadioButton");

        largeRadioButton = new JRadioButton("Large");
        largeRadioButton.setName("largeRadioButton");

        sizeGroup = new ButtonGroup();
        sizeGroup.add(smallRadioButton);
        sizeGroup.add(mediumRadioButton);
        sizeGroup.add(largeRadioButton);

        checkboxPanel.add(smallRadioButton);
        checkboxPanel.add(mediumRadioButton);
        checkboxPanel.add(largeRadioButton);

        mainButton = new JButton("Button");
        mainButton.setName("mainButton");
        mainButton.setPreferredSize(new Dimension(SMALL_WIDTH, SMALL_HEIGHT));

        helperLabel = new JLabel("");
        helperLabel.setName("helperLabel");

        ItemListener radioListener = e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                Object source = e.getSource();
                if (source == smallRadioButton) {
                    mainButton.setPreferredSize(new Dimension(SMALL_WIDTH, SMALL_HEIGHT));
                } else if (source == mediumRadioButton) {
                    mainButton.setPreferredSize(new Dimension(SMALL_WIDTH * 2, SMALL_HEIGHT * 2));
                } else if (source == largeRadioButton) {
                    mainButton.setPreferredSize(new Dimension(SMALL_WIDTH * 3, SMALL_HEIGHT * 3));
                }
                mainButton.revalidate();
                mainButton.repaint();
            }
        };

        smallRadioButton.addItemListener(radioListener);
        mediumRadioButton.addItemListener(radioListener);
        largeRadioButton.addItemListener(radioListener);

        MouseAdapter hoverListener = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Object source = e.getSource();
                if (source == smallRadioButton) {
                    helperLabel.setText("Set the button's size to small");
                } else if (source == mediumRadioButton) {
                    helperLabel.setText("Set the button's size to medium");
                } else if (source == largeRadioButton) {
                    helperLabel.setText("Set the button's size to large");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                helperLabel.setText("");
            }
        };

        smallRadioButton.addMouseListener(hoverListener);
        mediumRadioButton.addMouseListener(hoverListener);
        largeRadioButton.addMouseListener(hoverListener);

        centerPanel = new JPanel();
        centerPanel.add(mainButton);

        add(checkboxPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(helperLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingRadioButton::new);
    }
}
