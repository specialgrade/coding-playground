import java.awt.*;
import java.awt.event.*;

public class InfoRecorder extends Frame implements ActionListener {
    Panel cardPanel, firstPanel, secondPanel, thirdPanel, navPanel;
    CardLayout cardLayout;
    TextField nameTextField, ageTextField;
    TextArea quoteTextArea;
    Label nameLabel, ageLabel, quoteLabel;
    Button prevButton, nextButton;

    public InfoRecorder() {
        setTitle("Info Recorder");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardPanel = new Panel(cardLayout);
        cardPanel.setName("cardPanel");

        firstPanel = new Panel(new GridLayout(2, 2, 5, 5));
        firstPanel.setName("firstPanel");

        nameTextField = new TextField();
        nameTextField.setName("nameTextField");
        ageTextField = new TextField();
        ageTextField.setName("ageTextField");

        firstPanel.add(new Label("Name:"));
        firstPanel.add(nameTextField);
        firstPanel.add(new Label("Age:"));
        firstPanel.add(ageTextField);

        secondPanel = new Panel(new GridLayout(2, 1));
        secondPanel.setName("secondPanel");

        quoteTextArea = new TextArea(5, 20);
        quoteTextArea.setName("quoteTextArea");

        secondPanel.add(new Label("Enter your quote:"));
        secondPanel.add(quoteTextArea);

        thirdPanel = new Panel(new GridLayout(3, 1));
        thirdPanel.setName("thirdPanel");

        nameLabel = new Label();
        nameLabel.setName("nameLabel");
        ageLabel = new Label();
        ageLabel.setName("ageLabel");
        quoteLabel = new Label();
        quoteLabel.setName("quoteLabel");

        thirdPanel.add(nameLabel);
        thirdPanel.add(ageLabel);
        thirdPanel.add(quoteLabel);

        cardPanel.add(firstPanel, "First");
        cardPanel.add(secondPanel, "Second");
        cardPanel.add(thirdPanel, "Third");

        navPanel = new Panel(new GridLayout(1, 2, 10, 0));
        prevButton = new Button("Previous");
        prevButton.setName("prevButton");
        prevButton.addActionListener(this);
        nextButton = new Button("Next");
        nextButton.setName("nextButton");
        nextButton.addActionListener(this);

        navPanel.add(prevButton);
        navPanel.add(nextButton);

        add(cardPanel, BorderLayout.CENTER);
        add(navPanel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
        updateButtonVisibility();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        String currentCard = getCurrentCard();

        if (btn == nextButton) {
            if ("firstPanel".equals(currentCard)) {
                cardLayout.show(cardPanel, "Second");
            } else if ("secondPanel".equals(currentCard)) {
                nameLabel.setText(nameTextField.getText());
                ageLabel.setText(ageTextField.getText());
                quoteLabel.setText(quoteTextArea.getText());

                cardLayout.show(cardPanel, "Third");
            } else if ("thirdPanel".equals(currentCard)) {
                cardLayout.show(cardPanel, "First");
            }
        } else if (btn == prevButton) {
            if ("thirdPanel".equals(currentCard)) {
                cardLayout.show(cardPanel, "Second");
            } else if ("secondPanel".equals(currentCard)) {
                cardLayout.show(cardPanel, "First");
            } else if ("firstPanel".equals(currentCard)) {
                cardLayout.show(cardPanel, "Third");
            }
        }

        updateButtonVisibility();
    }

    private String getCurrentCard() {
        for(Component comp : cardPanel.getComponents()) {
            if(comp.isVisible()) {
                return comp.getName();
            }
        }
        return null;
    }

    private void updateButtonVisibility() {
        String currentCard = getCurrentCard();
        if ("firstPanel".equals(currentCard)) {
            prevButton.setVisible(false);
            nextButton.setVisible(true);
        } else if ("thirdPanel".equals(currentCard)) {
            prevButton.setVisible(true);
            nextButton.setVisible(false);
        } else { 
            prevButton.setVisible(true);
            nextButton.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new InfoRecorder();
    }
}