import java.awt.*;
import javax.swing.*;

public class SwingPlusButton extends JFrame {
    private int counter = 0;

    public SwingPlusButton() {
        setTitle("PlusButton");
        setSize(500, 400);
        setLayout(new FlowLayout());

        JLabel counterLabel = new JLabel("0");
        counterLabel.setName("counterLabel");

        JButton incrementButton = new JButton("Click");
        incrementButton.setName("incrementButton");
        incrementButton.setPreferredSize(new Dimension(300, 150));

        add(counterLabel);
        add(incrementButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        incrementButton.addActionListener(e -> {
            counter++;
            counterLabel.setText(String.valueOf(counter));
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingPlusButton::new);
    }
}
