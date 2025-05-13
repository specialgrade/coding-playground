import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFirstApp extends Frame {
    public MyFirstApp() {
        setTitle("Hello World!");
        setSize(500, 400);
        setLayout(new FlowLayout());

        Label label1 = new Label("Hello World!");
        label1.setName("label1");

        Label label2 = new Label("I love programming");
        label2.setName("label2");

        Label label3 = new Label("I love CodeChum");
        label3.setName("label3");

        Label label4 = new Label("I love Java");
        label4.setName("label4");

        add(label1);
        add(label2);
        add(label3);
        add(label4);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFirstApp();
    }
}
