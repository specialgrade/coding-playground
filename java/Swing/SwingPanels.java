import java.awt.*;
import javax.swing.*;

public class SwingPanels {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Panels");
            frame.setSize(300, 200);
            frame.setLayout(new FlowLayout());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel(new FlowLayout());
            mainPanel.setName("mainPanel");
            mainPanel.setBackground(Color.WHITE);
            mainPanel.setPreferredSize(new Dimension(220, 120));

            JPanel mainPanelWrapper = new JPanel(new FlowLayout());
            mainPanelWrapper.setBackground(Color.BLACK);
            mainPanelWrapper.add(mainPanel);

            JPanel subPanelA = new JPanel();
            subPanelA.setName("subPanelA");
            subPanelA.setBackground(Color.WHITE);
            subPanelA.setPreferredSize(new Dimension(80, 80));

            JPanel subPanelAWrapper = new JPanel(new FlowLayout());
            subPanelAWrapper.setBackground(Color.BLUE);
            subPanelAWrapper.setPreferredSize(new Dimension(84, 84));
            subPanelAWrapper.add(subPanelA);

            JPanel subPanelB = new JPanel();
            subPanelB.setName("subPanelB");
            subPanelB.setBackground(Color.WHITE);
            subPanelB.setPreferredSize(new Dimension(80, 80));

            JPanel subPanelBWrapper = new JPanel(new FlowLayout());
            subPanelBWrapper.setBackground(Color.RED);
            subPanelBWrapper.setPreferredSize(new Dimension(84, 84));
            subPanelBWrapper.add(subPanelB);

            mainPanel.add(subPanelAWrapper);
            mainPanel.add(subPanelBWrapper);

            frame.add(mainPanelWrapper);
            frame.setVisible(true);
        });
    }
}
