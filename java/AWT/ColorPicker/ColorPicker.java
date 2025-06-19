import java.awt.*;
import java.awt.event.*;

public class ColorPicker extends Frame {
    Panel colorPanel;
    Scrollbar redScrollBar, greenScrollBar, blueScrollBar;
    
    public ColorPicker() {
        setTitle("Color Picker");
        setSize(400, 300);
        setLayout(null);

        colorPanel = new Panel();
        colorPanel.setName("colorPanel");
        colorPanel.setBackground(new Color(0, 0, 0));
        colorPanel.setBounds(50, 50, 300, 50);

        redScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        redScrollBar.setName("redScrollBar");
        redScrollBar.setBounds(50, 120, 300, 20);

        greenScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        greenScrollBar.setName("greenScrollBar");
        greenScrollBar.setBounds(50, 160, 300, 20);

        blueScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        blueScrollBar.setName("blueScrollBar");
        blueScrollBar.setBounds(50, 200, 300, 20);

        AdjustmentListener l = new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int r = redScrollBar.getValue();
                int g = greenScrollBar.getValue();
                int b = blueScrollBar.getValue();
                colorPanel.setBackground(new Color(r, g, b));
            }
        };

        redScrollBar.addAdjustmentListener(l);
        greenScrollBar.addAdjustmentListener(l);
        blueScrollBar.addAdjustmentListener(l);

        add(colorPanel);
        add(redScrollBar);
        add(greenScrollBar);
        add(blueScrollBar);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPicker();
    }
}