import java.awt.*;
import java.awt.event.*;

public class MyWindows extends Window {
    public MyWindows(Frame parent) {
        super(parent);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Window With Position");
        frame.setUndecorated(true);
        frame.setSize(800, 350);
        frame.setLocation(200, 100);
        frame.setName("mainFrame");
        frame.setLayout(null);
        frame.setVisible(true);

        Window window1 = new Window(frame);
        window1.setSize(300, 250);
        window1.setLocation(300, 150);
        window1.setName("window1");
        window1.setBackground(Color.LIGHT_GRAY); 
        window1.setVisible(true);

        Window window2 = new Window(frame);
        window2.setSize(300, 250);
        window2.setLocation(600, 150);
        window2.setName("window2");
        window2.setBackground(Color.GRAY); 
        window2.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
