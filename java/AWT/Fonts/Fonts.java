import java.awt.*;
import java.awt.event.*;

public class Fonts extends Frame {

    public Fonts() {
        setTitle("Fonts");
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
        g.setFont(new Font("Courier", Font.BOLD, 20));
        g.drawString("There's", 150, 160);

        g.setColor(Color.GRAY);
        g.setFont(new Font("Default", Font.ITALIC, 20));
        g.drawString("nothing", 230, 160);

        g.setColor(Color.GRAY);
        g.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 24));
        g.drawString("stronger", 310, 160);

        g.setColor(Color.GRAY);
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("than", 150, 200);

        g.setColor(Color.GRAY);
        g.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 24));
        g.drawString("FAMILY", 230, 200);
    }

    public static void main(String[] args) {
        new Fonts();
    }
} 