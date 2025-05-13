import java.awt.*;
import java.awt.event.*;

public class PlusButton extends Frame {
    private int counter = 0;

    public PlusButton() {
        setTitle("PlusButton");
        setSize(500, 400);
        setLayout(new FlowLayout());

        Label counterLabel = new Label("0");
        counterLabel.setName("counterLabel");

        Button incrementButton = new Button("Click");
        incrementButton.setName("incrementButton");
        incrementButton.setSize(300, 150);

        add(counterLabel);
        add(incrementButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterLabel.setText(String.valueOf(counter));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new PlusButton();
    }
}
