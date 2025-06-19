import java.awt.*;
import java.awt.event.*;

public class SwingFrame extends Frame {
    public SwingFrame() {
        setTitle("Frame With Position");
        setSize(600, 500);
        setLocation(750, 300);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingFrame();
    }
}
