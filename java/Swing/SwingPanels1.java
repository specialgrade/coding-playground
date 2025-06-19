import java.awt.*;
import javax.swing.*;

public class SwingPanels1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Panels With Position");
            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel();
            mainPanel.setName("mainPanel");
            mainPanel.setLayout(null);
            mainPanel.setBounds(0, 0, 300, 200);  

            JPanel subPanelA = new JPanel();
            subPanelA.setName("subPanelA");
            subPanelA.setBackground(Color.BLUE);  
            subPanelA.setBounds(10, 10, 80, 80);

            JPanel subPanelB = new JPanel();
            subPanelB.setName("subPanelB");
            subPanelB.setBackground(Color.RED);  
            subPanelB.setBounds(200, 90, 80, 80);

            mainPanel.add(subPanelA);
            mainPanel.add(subPanelB);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}
