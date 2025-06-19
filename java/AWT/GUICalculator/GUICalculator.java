import java.awt.*;
import java.awt.event.*;

public class GUICalculator extends Frame implements ActionListener {
    Panel buttonsPanel;
    Label resultLabel;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button addButton, subtractButton, multiplyButton, divideButton, clearButton, computeButton;

    private String input = "";
    private double firstOperand = 0;
    private String operator = null;
    private boolean isNewInput = true;
        
    public GUICalculator() {
        setTitle("GUI Calculator");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        resultLabel = new Label("", Label.RIGHT);
        resultLabel.setName("resultLabel");
        add(resultLabel, BorderLayout.NORTH);

        buttonsPanel = new Panel(new GridLayout(4, 4, 5, 5));
        buttonsPanel.setName("buttonsPanel");
        
        button0 = new Button("0"); button0.setName("button0");
        button1 = new Button("1"); button1.setName("button1");
        button2 = new Button("2"); button2.setName("button2");
        button3 = new Button("3"); button3.setName("button3");
        button4 = new Button("4"); button4.setName("button4");
        button5 = new Button("5"); button5.setName("button5");
        button6 = new Button("6"); button6.setName("button6");
        button7 = new Button("7"); button7.setName("button7");
        button8 = new Button("8"); button8.setName("button8");
        button9 = new Button("9"); button9.setName("button9");

        addButton = new Button("+");
        addButton.setName("addButton");
        subtractButton = new Button("-");
        subtractButton.setName("subtractButton");
        multiplyButton = new Button("*");
        multiplyButton.setName("multiplyButton");
        divideButton = new Button("/");
        divideButton.setName("divideButton");

        clearButton = new Button("C");
        clearButton.setName("clearButton");
        computeButton = new Button("=");
        computeButton.setName("computeButton");

        Button[] allButtons = {
            button0, button1, button2, button3, button4,
            button5, button6, button7, button8, button9,
            addButton, subtractButton, multiplyButton, divideButton,
            clearButton, computeButton
        };

        for (Button b : allButtons) {
            b.addActionListener(this);
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

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        String label = btn.getLabel();

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
        new GUICalculator();
    }
}