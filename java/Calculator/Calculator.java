import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField num1TextField, num2TextField;
    Choice operationsChoice;
    Label resultLabel;
    Button computeButton;

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 350);
        setLayout(null);

        num1TextField = new TextField();
        num1TextField.setBounds(50, 50, 150, 30);
        num1TextField.setName("num1TextField");

        num2TextField = new TextField();
        num2TextField.setBounds(50, 90, 150, 30);
        num2TextField.setName("num2TextField");

        operationsChoice = new Choice();
        operationsChoice.setBounds(50, 130, 150, 30);
        operationsChoice.setName("operationsChoice");
        operationsChoice.add("+");
        operationsChoice.add("-");
        operationsChoice.add("*");
        operationsChoice.add("/");

        computeButton = new Button("Compute Result");
        computeButton.setBounds(220, 130, 100, 30);
        computeButton.setName("computeButton");
        computeButton.addActionListener(this);

        resultLabel = new Label();
        resultLabel.setBounds(50, 180, 300, 30);
        resultLabel.setName("resultLabel");

        add(num1TextField);
        add(num2TextField);
        add(operationsChoice);
        add(computeButton);
        add(resultLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1TextField.getText());
            double num2 = Double.parseDouble(num2TextField.getText());
            String operation = operationsChoice.getSelectedItem();
            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        resultLabel.setText("Error: Div by 0");
                        return; 
                    }
                    result = num1 / num2;
                    break;
                default:
                    resultLabel.setText("Invalid Operation");
                    return;
            }

            resultLabel.setText(String.valueOf((int) result));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input! Please enter numbers.");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
