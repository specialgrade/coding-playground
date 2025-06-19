import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class SwingMyFirstApp extends JFrame {
    public SwingMyFirstApp() {
        setTitle("Hello World!");
        setSize(500, 400);
        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Hello World!");
        label1.setName("label1");

        JLabel label2 = new JLabel("I love programming");
        label2.setName("label2");

        JLabel label3 = new JLabel("I love CodeChum");
        label3.setName("label3");

        JLabel label4 = new JLabel("I love Java");
        label4.setName("label4");

        add(label1);
        add(label2);
        add(label3);
        add(label4);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingMyFirstApp::new);
    }
}
