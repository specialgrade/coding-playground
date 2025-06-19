import java.awt.*;
import java.awt.event.*;

public class Oval extends Frame {

    public Oval() {
        setTitle("Oval");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        MyCanvas maiCanvas = new MyCanvas();
        maiCanvas.setName("mainCanvas");
        add(maiCanvas, BorderLayout.CENTER);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Oval();
    }
} 

class MyCanvas extends Canvas {
        public void paint(Graphics g) {
            g.setColor(Color.YELLOW);
            g.fillOval(150, 80, 200, 100);
        }
    }