import java.awt.*;
import java.awt.event.*;

public class ColoredShapesAndWords extends Frame {

    public ColoredShapesAndWords() {
        setTitle("Colored Shapes and Words");
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
        g.setColor(Color.GRAY);
        g.fillRect(150, 100, 200, 100);

        g.setColor(Color.YELLOW);
        g.drawOval(150, 100, 200, 100);

        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString("Java Chips!", 180, 160);
    }

    public static void main(String[] args) {
        new ColoredShapesAndWords();
    }
} 