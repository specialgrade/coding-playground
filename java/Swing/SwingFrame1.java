import java.awt.*;
import java.awt.event.*;

public class SwingFrame1 extends Frame {
    public SwingFrame1() {
        setTitle("Frame");
        setSize(500, 400);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingFrame1();
    }
}
