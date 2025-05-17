import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A simple Word Counter application using Java Swing.
 * It counts and displays number of words, characters, and paragraphs from the text area.
 * 
 * @author Alyssa Marie D. Dela Cruz
 * @version 1.0
 * @since 2025-05-17
 */

public class WordCounter extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton countButton, clearButton;
    private JLabel directionLabel, titleLabel, resultLabel;
    private JPanel titlePanel, centerPanel, controlPanel, bottomPanel;
    private JScrollPane scrollPane;

    /**
     * Constructor for the Word Counter GUI. It initializes all components.
     */
    public WordCounter() {
        setTitle("Word Counter");
        setSize(600, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title section
        titlePanel = new JPanel();
        titlePanel.setName("titlePanel");
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));

        directionLabel = new JLabel("Type or paste your text below.", SwingConstants.CENTER);
        directionLabel.setName("directionLabel");
        directionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        directionLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        titleLabel = new JLabel("Word Counter", SwingConstants.CENTER);
        titleLabel.setName("titleLabel");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        titlePanel.add(Box.createVerticalStrut(10));
        titlePanel.add(directionLabel);
        titlePanel.add(Box.createVerticalStrut(5));
        titlePanel.add(titleLabel);
        titlePanel.add(Box.createVerticalStrut(10));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        
        add(titlePanel, BorderLayout.NORTH); 

        // Text area section
        textArea = new JTextArea();
        textArea.setName("textArea");
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setName("scrollPane");

        centerPanel = new JPanel(new BorderLayout());
        centerPanel.setName("centerPanel");
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        
        add(centerPanel, BorderLayout.CENTER);

        // Control section
        controlPanel = new JPanel(new FlowLayout());
        controlPanel.setName("controlPanel");

        countButton = new JButton("Count");
        countButton.setName("countButton");
        countButton.addActionListener(this);
        controlPanel.add(countButton);

        clearButton = new JButton("Clear");
        clearButton.setName("clearButton");
        clearButton.addActionListener(this);
        controlPanel.add(clearButton);

        // Result section
        resultLabel = new JLabel("Words: 0 | Characters: 0 | Paragraphs: 0", SwingConstants.CENTER);
        resultLabel.setName("resultLabel");
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setName("bottomPanel");
        bottomPanel.add(resultLabel, BorderLayout.NORTH);
        bottomPanel.add(controlPanel, BorderLayout.SOUTH);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    /**
     * Counts words, characters, and paragraphs from the text area.
     * Displays the results in the result label accordingly.
     */
    private void countText() {
        String textInput;
        int charCount = 0, wordCount = 0, paragraphCount = 0;

        textInput = textArea.getText();
        if(textInput.trim().isEmpty()) {
            resultLabel.setText("Words: 0 | Characters: 0 | Paragraphs: 0");
            return;
        }

        charCount = textInput.length();

        String[] wordInput = textInput.trim().split("\\s+");
        for(String word : wordInput) {
            if(!word.trim().isEmpty()) {
                wordCount++;
            }
        }

        String[] lineInput = textInput.trim().split("\\n");
        for(String line : lineInput) {
            if(!line.trim().isEmpty()) {
                paragraphCount++;
            }
        }

        resultLabel.setText("Words: " + wordCount + " | Characters: " + charCount + " | Paragraphs: " + paragraphCount);
    }

    /**
     * Handles all button actions: Count and Clear.
     * @param e ActionEvent triggered by user interaction (button click)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == countButton) {
            countText();
        } else if(e.getSource() == clearButton) {
            textArea.setText("");
            resultLabel.setText("Words: 0 | Characters: 0 | Paragraphs: 0");
        }
    }
    
    /**
     * Entry point of the program.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        new WordCounter();
    }
}