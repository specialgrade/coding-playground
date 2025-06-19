import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingInfoRecorder extends JFrame implements ActionListener {
    JPanel cardPanel, firstPanel, secondPanel, thirdPanel, navPanel;
    CardLayout cardLayout;
    JTextField nameTextField, ageTextField;
    JTextArea quoteTextArea;
    JLabel nameLabel, ageLabel, quoteLabel;
    JButton prevButton, nextButton;

    public SwingInfoRecorder() {
        setTitle("Info Recorder");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setName("cardPanel");

        firstPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        firstPanel.setName("firstPanel");

        nameTextField = new JTextField();
        nameTextField.setName("nameTextField");
        ageTextField = new JTextField();
        ageTextField.setName("ageTextField");

        firstPanel.add(new JLabel("Name:"));
        firstPanel.add(nameTextField);
        firstPanel.add(new JLabel("Age:"));
        firstPanel.add(ageTextField);

        secondPanel = new JPanel();
        secondPanel.setName("secondPanel");
        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.Y_AXIS));

        quoteTextArea = new JTextArea(5, 20);
        quoteTextArea.setName("quoteTextArea");

        secondPanel.add(new JLabel("Enter your quote:"));
        secondPanel.add(quoteTextArea);

        thirdPanel = new JPanel(new GridLayout(3, 1));
        thirdPanel.setName("thirdPanel");

        nameLabel = new JLabel();
        nameLabel.setName("nameLabel");
        ageLabel = new JLabel();
        ageLabel.setName("ageLabel");
        quoteLabel = new JLabel();
        quoteLabel.setName("quoteLabel");

        thirdPanel.add(nameLabel);
        thirdPanel.add(ageLabel);
        thirdPanel.add(quoteLabel);

        cardPanel.add(firstPanel, "First");
        cardPanel.add(secondPanel, "Second");
        cardPanel.add(thirdPanel, "Third");

        navPanel = new JPanel(new GridLayout(1, 2, 10, 0));
        navPanel.setName("navPanel");

        prevButton = new JButton("Previous");
        prevButton.setName("prevButton");
        nextButton = new JButton("Next");
        nextButton.setName("nextButton");

        prevButton.addActionListener(this);
        nextButton.addActionListener(this);

        navPanel.add(prevButton);
        navPanel.add(nextButton);

        add(cardPanel, BorderLayout.CENTER);
        add(navPanel, BorderLayout.SOUTH);

        setVisible(true);
        updateButtonVisibility();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        String currentCard = getCurrentCard();

        if (src == nextButton) {
            switch (currentCard) {
                case "First":
                    cardLayout.show(cardPanel, "Second");
                    break;
                case "Second":
                    nameLabel.setText(nameTextField.getText());
                    ageLabel.setText(ageTextField.getText());
                    quoteLabel.setText(quoteTextArea.getText());
                    cardLayout.show(cardPanel, "Third");
                    break;
                case "Third":
                    cardLayout.show(cardPanel, "First");
                    break;
            }
        } else if (src == prevButton) {
            switch (currentCard) {
                case "Third":
                    cardLayout.show(cardPanel, "Second");
                    break;
                case "Second":
                    cardLayout.show(cardPanel, "First");
                    break;
                case "First":
                    cardLayout.show(cardPanel, "Third");
                    break;
            }
        }

        updateButtonVisibility();
    }

    private String getCurrentCard() {
        for (Component comp : cardPanel.getComponents()) {
            if (comp.isVisible()) {
                if (comp == firstPanel) return "First";
                if (comp == secondPanel) return "Second";
                if (comp == thirdPanel) return "Third";
            }
        }
        return null;
    }

    private void updateButtonVisibility() {
        String currentCard = getCurrentCard();
        switch (currentCard) {
            case "First":
                prevButton.setVisible(false);
                nextButton.setVisible(true);
                break;
            case "Third":
                prevButton.setVisible(true);
                nextButton.setVisible(false);
                break;
            default:
                prevButton.setVisible(true);
                nextButton.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingInfoRecorder::new);
    }
}
