import java.awt.*;
import java.awt.event.*;

public class Panels {
    public static void main(String[] args) {
        
        Frame frame = new Frame("Panels");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        Panel mainPanel = new Panel(new FlowLayout());
        mainPanel.setName("mainPanel");
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setPreferredSize(new Dimension(220, 120));

        Panel mainPanelWrapper = new Panel(new FlowLayout());
        mainPanelWrapper.setBackground(Color.BLACK);
        mainPanelWrapper.add(mainPanel);

        Panel subPanelA = new Panel();
        subPanelA.setName("subPanelA");
        subPanelA.setBackground(Color.WHITE);
        subPanelA.setPreferredSize(new Dimension(80, 80));

        Panel subPanelAWrapper = new Panel(new FlowLayout());
        subPanelAWrapper.setBackground(Color.BLUE);
        subPanelAWrapper.setPreferredSize(new Dimension(84, 84));
        subPanelAWrapper.add(subPanelA);

        Panel subPanelB = new Panel();
        subPanelB.setName("subPanelB");
        subPanelB.setBackground(Color.WHITE);
        subPanelB.setPreferredSize(new Dimension(80, 80));

        Panel subPanelBWrapper = new Panel(new FlowLayout());
        subPanelBWrapper.setBackground(Color.RED);
        subPanelBWrapper.setPreferredSize(new Dimension(84, 84));
        subPanelBWrapper.add(subPanelB);

        mainPanel.add(subPanelAWrapper);
        mainPanel.add(subPanelBWrapper);

        frame.add(mainPanelWrapper);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
