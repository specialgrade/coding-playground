import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    public MyFrame() {
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
        new MyFrame();
    }
}
