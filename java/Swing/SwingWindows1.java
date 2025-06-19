import java.awt.*;
import javax.swing.*;

public class SwingWindows1 extends JWindow {
    public SwingWindows1(JFrame parent) {
        super(parent);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Creating JWindows");
            frame.setUndecorated(true);
            frame.setSize(800, 350);
            frame.setLocation(200, 100);
            frame.setName("mainFrame");
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JWindow window1 = new JWindow(frame);
            window1.setSize(300, 250);
            window1.setLocation(300, 150);
            window1.setName("window1");
            window1.getContentPane().setBackground(Color.LIGHT_GRAY);
            window1.setVisible(true);

            JWindow window2 = new JWindow(frame);
            window2.setSize(300, 250);
            window2.setLocation(600, 150);
            window2.setName("window2");
            window2.getContentPane().setBackground(Color.GRAY);
            window2.setVisible(true);
        });
    }
}
