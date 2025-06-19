import java.awt.*;
import java.awt.event.*;

public class DrawingARectangle extends Frame {

    public DrawingARectangle() {
        setTitle("Drawing a Rectangle");
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
        g.drawRect(150, 100, 200, 100);
    }

    public static void main(String[] args) {
        new DrawingARectangle();
    }
}