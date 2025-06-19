import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class SwingHelloWorld extends JFrame {
    public SwingHelloWorld() {
        setTitle("Hello World!");
        setSize(500, 400);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello World! I love Java!");
        label.setName("helloWorldLabel");
        add(label);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingHelloWorld::new);
    }
}
