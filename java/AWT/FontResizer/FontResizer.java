import java.awt.*;
import java.awt.event.*;

public class FontResizer extends Frame {
    Label textLabel;
    Scrollbar resizeScrollBar;
    
    public FontResizer() {
        setTitle("Font Resizer");
        setSize(400, 300);
        setLayout(null);

        textLabel = new Label("Sample", Label.CENTER);
        textLabel.setName("textLabel");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        textLabel.setBounds(100, 80, 200, 50);

        resizeScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 20, 1, 10, 100);
        resizeScrollBar.setName("resizeScrollBar");
        resizeScrollBar.setBounds(50, 150, 300, 20);

        resizeScrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int fontSize = resizeScrollBar.getValue();
                textLabel.setFont(new Font("Arial", Font.PLAIN, fontSize));
            }
        });
        add(textLabel);
        add(resizeScrollBar);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FontResizer();
    }
}