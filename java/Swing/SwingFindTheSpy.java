import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingFindTheSpy extends JFrame implements ActionListener {
    JButton button1, button2, button3, button4, button5;
    JButton button6, button7, button8, button9, button10;

    public SwingFindTheSpy() {
        setTitle("Find the Spy!");
        setSize(400, 300);
        setLayout(new GridLayout(4, 3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("2156"); button1.setName("button1"); button1.addActionListener(this);
        button2 = new JButton("2265"); button2.setName("button2"); button2.addActionListener(this);
        button3 = new JButton("124");  button3.setName("button3"); button3.addActionListener(this);
        button4 = new JButton("2014"); button4.setName("button4"); button4.addActionListener(this);
        button5 = new JButton("1214"); button5.setName("button5"); button5.addActionListener(this);
        button6 = new JButton("562");  button6.setName("button6"); button6.addActionListener(this);
        button7 = new JButton("11");   button7.setName("button7"); button7.addActionListener(this);
        button8 = new JButton("22");   button8.setName("button8"); button8.addActionListener(this);
        button9 = new JButton("213");  button9.setName("button9"); button9.addActionListener(this);
        button10 = new JButton("54136"); button10.setName("button10"); button10.addActionListener(this);

        add(button1); add(button2); add(button3); add(button4); add(button5);
        add(button6); add(button7); add(button8); add(button9); add(button10);

        setVisible(true);
    }

    public boolean isSpy(String id) {
        int sum = 0, product = 1;
        for (char ch : id.toCharArray()) {
            int digit = ch - '0';
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (isSpy(btn.getText())) {
             
            JOptionPane pane = new JOptionPane("Spy found!", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(this, "Notice");
            dialog.setName("noticeDialog"); 
            dialog.setModal(true);
            dialog.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingFindTheSpy::new);
    }
}
