import java.awt.*;
import java.awt.event.*;

public class February29 extends Frame implements  ActionListener{
    TextField yearTextField;
    Dialog leapYearDialog, notLeapYearDialog;
    Label leapYearLabel, notLeapYearLabel;
    Button checkYearButton;
    
    public February29() {
        setTitle("February 29");
        setSize(400, 300);
        setLayout(null);

        yearTextField = new TextField();
        yearTextField.setName("yearTextField");
        yearTextField.setBounds(130, 80, 140, 30);

        leapYearDialog = new Dialog(this, "Message", true);
        leapYearDialog.setName("leapYearDialog");
        leapYearDialog.setLayout(new FlowLayout());
        leapYearDialog.setSize(200, 100);

        leapYearLabel = new Label("Leap year");
        leapYearLabel.setName("leapYearLabel");
        leapYearDialog.add(leapYearLabel);

        notLeapYearDialog = new Dialog(this, "Message", true);
        notLeapYearDialog.setName("notLeapYearDialog");
        notLeapYearDialog.setLayout(new FlowLayout());
        notLeapYearDialog.setSize(200, 100);

        notLeapYearLabel = new Label("Not a leap year");
        notLeapYearLabel.setName("notLeapYearLabel");
        notLeapYearDialog.add(notLeapYearLabel);

        checkYearButton = new Button("Check");
        checkYearButton.setName("checkYearButton");
        checkYearButton.setBounds(160, 130, 80, 30);
        checkYearButton.addActionListener(this);

        add(yearTextField);
        add(checkYearButton);

        leapYearDialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                leapYearDialog.setVisible(false);
            }
        });

        notLeapYearDialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                notLeapYearDialog.setVisible(false);
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            int year = Integer.parseInt(yearTextField.getText());
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if(isLeap) {
                leapYearDialog.setVisible(true);
            } else{
                notLeapYearDialog.setVisible(true);
            }
        } catch(NumberFormatException exception) {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new February29();
    }
}