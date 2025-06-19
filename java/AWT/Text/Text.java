import java.awt.*;
import java.awt.event.*;

public class Text extends Frame {

    public Text() {
        setTitle("Text");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        MyCanvas mainCanvas = new MyCanvas();
        mainCanvas.setName("mainCanvas");
        add(mainCanvas, BorderLayout.CENTER);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Text();
    }
} 

class MyCanvas extends Canvas {
        public void paint(Graphics g) {
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Java Chips!", 150, 200);
        }
    }