import java.awt.*;
import java.awt.event.*;

public class Panels1 {
    public static void main(String[] args) {
        
        Frame frame = new Frame("Panels With Position");
        frame.setSize(300, 200);
        frame.setLayout(null);

        Panel mainPanel = new Panel();
        mainPanel.setName("mainPanel");
        mainPanel.setLayout(null);

        Panel subPanelA = new Panel();
        subPanelA.setName("subPanelA");
        subPanelA.setSize(80, 80);
        subPanelA.setLocation(10, 10); 

        Panel subPanelB = new Panel();
        subPanelB.setName("subPanelB");
        subPanelB.setSize(80, 80);
        subPanelB.setLocation(200, 90); 

        mainPanel.add(subPanelA);
        mainPanel.add(subPanelB);

        frame.add(mainPanel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
