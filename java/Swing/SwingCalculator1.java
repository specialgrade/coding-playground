import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCalculator1 extends JFrame implements ActionListener {
    JPanel buttonsPanel;
    JLabel resultLabel;
    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    JButton addButton, subtractButton, multiplyButton, divideButton, clearButton, computeButton;

    private String input = "";
    private double firstOperand = 0;
    private String operator = null;
    private boolean isNewInput = true;

    public SwingCalculator1() {
        setTitle("Border Layout");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        resultLabel = new JLabel("", SwingConstants.RIGHT);
        resultLabel.setName("resultLabel");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 20));
        resultLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(resultLabel, BorderLayout.NORTH);

        buttonsPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        buttonsPanel.setName("buttonsPanel");
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        button0 = new JButton("0"); button0.setName("button0");
        button1 = new JButton("1"); button1.setName("button1");
        button2 = new JButton("2"); button2.setName("button2");
        button3 = new JButton("3"); button3.setName("button3");
        button4 = new JButton("4"); button4.setName("button4");
        button5 = new JButton("5"); button5.setName("button5");
        button6 = new JButton("6"); button6.setName("button6");
        button7 = new JButton("7"); button7.setName("button7");
        button8 = new JButton("8"); button8.setName("button8");
        button9 = new JButton("9"); button9.setName("button9");

        addButton = new JButton("+"); addButton.setName("addButton");
        subtractButton = new JButton("-"); subtractButton.setName("subtractButton");
        multiplyButton = new JButton("*"); multiplyButton.setName("multiplyButton");
        divideButton = new JButton("/"); divideButton.setName("divideButton");

        clearButton = new JButton("C"); clearButton.setName("clearButton");
        computeButton = new JButton("="); computeButton.setName("computeButton");

        JButton[] allButtons = {
            button0, button1, button2, button3, button4,
            button5, button6, button7, button8, button9,
            addButton, subtractButton, multiplyButton, divideButton,
            clearButton, computeButton
        };

        for (JButton b : allButtons) {
            b.addActionListener(this);
            b.setFont(new Font("Arial", Font.BOLD, 16));
        }

        buttonsPanel.add(button7);
        buttonsPanel.add(button8);
        buttonsPanel.add(button9);
        buttonsPanel.add(divideButton);

        buttonsPanel.add(button4);
        buttonsPanel.add(button5);
        buttonsPanel.add(button6);
        buttonsPanel.add(multiplyButton);

        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        buttonsPanel.add(button3);
        buttonsPanel.add(subtractButton);

        buttonsPanel.add(clearButton);
        buttonsPanel.add(button0);
        buttonsPanel.add(computeButton);
        buttonsPanel.add(addButton);

        add(buttonsPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        String label = btn.getText();

        if ("0123456789".contains(label)) {
            if (isNewInput) {
                input = label;
                isNewInput = false;
            } else {
                input += label;
            }
            resultLabel.setText(input);
        } else if ("+-*/".contains(label)) {
            if (!input.isEmpty()) {
                firstOperand = Double.parseDouble(input);
                operator = label;
                isNewInput = true;
            }
        } else if ("=".equals(label)) {
            if (operator != null && !input.isEmpty()) {
                double secondOperand = Double.parseDouble(input);
                double result = 0;
                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        if (secondOperand != 0) {
                            result = firstOperand / secondOperand;
                        } else {
                            resultLabel.setText("Error: Div by 0");
                            operator = null;
                            isNewInput = true;
                            return;
                        }
                        break;
                    }

                if (result == (int) result) {
                    resultLabel.setText(Integer.toString((int) result));
                    input = Integer.toString((int) result);
                } else {
                    resultLabel.setText(Double.toString(result));
                    input = Double.toString(result);
                }
                operator = null;
                isNewInput = true;
            }
        } else if ("C".equals(label)) {
            input = "";
            firstOperand = 0;
            operator = null;
            isNewInput = true;
            resultLabel.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingCalculator1::new);
    }
}
