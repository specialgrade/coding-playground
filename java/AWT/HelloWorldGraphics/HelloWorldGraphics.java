import java.awt.*;
import java.awt.event.*;

public class HelloWorldGraphics extends Frame {

    public HelloWorldGraphics() {
        setTitle("Hello World");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString("Hello World", 150, 150);
    }

    public static void main(String[] args) {
        new HelloWorldGraphics();
    }
}