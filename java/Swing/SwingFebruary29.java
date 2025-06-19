import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingFebruary29 extends JFrame implements ActionListener {
    JTextField yearTextField;
    JButton checkYearButton;
    JDialog messageDialog;
    JLabel messageLabel;

    public SwingFebruary29() {
        setTitle("Leap Year Checker"); 
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        yearTextField = new JTextField("", 10);
        yearTextField.setName("yearTextField");

        checkYearButton = new JButton("Check");
        checkYearButton.setName("checkYearButton");
        checkYearButton.addActionListener(this);

        add(new JLabel("Enter year:"));
        add(yearTextField);
        add(checkYearButton);

        setupDialog();
        setVisible(true);
    }

    private void setupDialog() {
        messageDialog = new JDialog(this, "Message", true);
        messageDialog.setName("leapYearDialog");  
        messageDialog.setLayout(new FlowLayout());
        messageDialog.setSize(200, 100);
        messageDialog.setLocationRelativeTo(this);

        messageLabel = new JLabel();  
        messageDialog.add(messageLabel);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> messageDialog.setVisible(false));
        messageDialog.add(okButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int year = Integer.parseInt(yearTextField.getText().trim());
            if (isLeapYear(year)) {
                messageLabel.setText("Leap year"); 
            } else {
                messageLabel.setText("Not a leap year");  
            }
            messageDialog.setVisible(true);  
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingFebruary29::new);
    }
}
