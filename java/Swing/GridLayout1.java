import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayout1 extends JFrame implements ActionListener {
    JPasswordField passwordTextField;
    JTextField usernameTextField;
    JButton loginButton;

    public GridLayout1() {
        setTitle("Grid Layout");
        setSize(400, 300);
        setLayout(new GridLayout(4, 3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        usernameTextField = new JTextField();
        usernameTextField.setName("usernameTextField");

        passwordTextField = new JPasswordField();
        passwordTextField.setName("passwordTextField");

        loginButton = new JButton("Login");
        loginButton.setName("loginButton");
        loginButton.addActionListener(this);

        add(usernameTextField);
        add(passwordTextField);
        add(loginButton);

        setVisible(true);
    }

    public boolean isPassCorrect(String id) {
        String username = usernameTextField.getText();
        String password = new String(passwordTextField.getPassword());

        return username.equals(password);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (isPassCorrect(btn.getText())) {
            JOptionPane pane = new JOptionPane("Success!", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(this, "Message");
            dialog.setName("noticeDialog"); 
            dialog.setModal(true);
            dialog.setVisible(true);
        } else {
            JOptionPane pane = new JOptionPane("Failed!", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(this, "Message");
            dialog.setName("noticeDialog"); 
            dialog.setModal(true);
            dialog.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridLayout1::new);
    }
}
