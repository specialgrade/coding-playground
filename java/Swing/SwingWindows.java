import javax.swing.*;

public class SwingWindows extends JWindow {
    public SwingWindows(JFrame frame) {
        super(frame);
        setSize(400, 400);
        setLocation(300, 150);
        setName("mainWindow");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Window With Position");
            frame.setUndecorated(true);
            frame.setSize(600, 500);
            frame.setLocation(200, 100);
            frame.setName("mainFrame");
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            SwingWindows window = new SwingWindows(frame);
            window.setVisible(true);
        });
    }
}
