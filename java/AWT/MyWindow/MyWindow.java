import java.awt.*;
import java.awt.event.*;

public class MyWindow extends Window {
    public MyWindow(Frame frame) {
        super(frame);
        setSize(400, 400);
        setLocation(300, 150);
        setName("mainWindow");
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Window With Position");
        frame.setUndecorated(true);
        frame.setSize(600, 500);
        frame.setLocation(200, 100);
        frame.setName("mainFrame");
        frame.setLayout(null);
        frame.setVisible(true);

        MyWindow window = new MyWindow(frame);
        window.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
