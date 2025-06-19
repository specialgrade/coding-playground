import java.awt.*;
import java.awt.event.*;

public class FontStyles extends Frame {

    public FontStyles() {
        setTitle("Font Styles");
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
        g.setFont(new Font("Default", Font.BOLD, 20));
        g.drawString("Bold Text", 150, 160);

        g.setColor(Color.GRAY);
        g.setFont(new Font("Default", Font.ITALIC, 20));
        g.drawString("Italic Text", 150, 200);

        g.setColor(Color.GRAY);
        g.setFont(new Font("Default", Font.BOLD | Font.ITALIC, 20));
        g.drawString("Bold Italic Text", 150, 240);
    }

    public static void main(String[] args) {
        new FontStyles();
    }
} 