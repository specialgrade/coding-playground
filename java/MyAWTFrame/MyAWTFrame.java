import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyAWTFrame extends Frame {
    public MyAWTFrame() {
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
        new MyAWTFrame();
    }
}
