import java.awt.*;
import java.awt.event.*;

public class ColoredTexts extends Frame {

    public ColoredTexts() {
        setTitle("Colored Texts");
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
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Red", 150, 160);

        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Green", 250, 160);

        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Blue", 350, 160);
    }

    public static void main(String[] args) {
        new ColoredTexts();
    }
} 