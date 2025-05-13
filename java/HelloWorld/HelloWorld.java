import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorld extends Frame {
    public HelloWorld() {
        setTitle("Hello World!");
        setSize(500, 400);

        Label label = new Label("Hello World! I love Java!");
        add(label);
        label.setName("helloWorldLabel");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}
