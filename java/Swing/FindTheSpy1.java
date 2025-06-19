import javax.swing.*;
import java.awt.event.*;

public class FindTheSpy1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Find the Spy");
        frame.setSize(600, 120);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] ids = { "2156", "2265", "124", "2014", "1214", "562", "11", "22", "213", "54136" };

        for (int i = 0; i < ids.length; i++) {
            JButton button = new JButton(ids[i]);
            button.setBounds(10 + (i * 55), 20, 50, 30);
            button.setName("button" + (i + 1));

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String id = button.getText();
                    if (isSpy(id)) {
                        JOptionPane pane = new JOptionPane();
                        pane.setName("noticeDialog");
                        JOptionPane.showMessageDialog(null, "Spy found!");
                    }
                }
            });

            frame.add(button);
        }

        frame.setVisible(true);
    }

    public static boolean isSpy(String id) {
        int sum = 0, product = 1;
        for (char c : id.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }
}
