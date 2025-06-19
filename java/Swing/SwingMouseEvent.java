import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingMouseEvent extends JFrame implements ActionListener {
    JLabel textLabel;
    JButton button1, button2, button3, button4, button5,
            button6, button7, button8, button9, button10,
            button11, button12, button13, button14, button15,
            button16, button17, button18, button19, button20;
    JPanel buttonPanel;

    public SwingMouseEvent() {
        setTitle("Mouse Event Act");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textLabel = new JLabel("");
        textLabel.setName("textLabel");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);

        buttonPanel = new JPanel(new GridLayout(4, 5, 5, 5));

        button1 = new JButton("1"); button1.setName("button1");
        button2 = new JButton("2"); button2.setName("button2");
        button3 = new JButton("3"); button3.setName("button3");
        button4 = new JButton("4"); button4.setName("button4");
        button5 = new JButton("5"); button5.setName("button5");
        button6 = new JButton("6"); button6.setName("button6");
        button7 = new JButton("7"); button7.setName("button7");
        button8 = new JButton("8"); button8.setName("button8");
        button9 = new JButton("9"); button9.setName("button9");
        button10 = new JButton("10"); button10.setName("button10");
        button11 = new JButton("11"); button11.setName("button11");
        button12 = new JButton("12"); button12.setName("button12");
        button13 = new JButton("13"); button13.setName("button13");
        button14 = new JButton("14"); button14.setName("button14");
        button15 = new JButton("15"); button15.setName("button15");
        button16 = new JButton("16"); button16.setName("button16");
        button17 = new JButton("17"); button17.setName("button17");
        button18 = new JButton("18"); button18.setName("button18");
        button19 = new JButton("19"); button19.setName("button19");
        button20 = new JButton("20"); button20.setName("button20");

        JButton[] allButtons = {
            button1, button2, button3, button4, button5,
            button6, button7, button8, button9, button10,
            button11, button12, button13, button14, button15,
            button16, button17, button18, button19, button20
        };

        for (int i = 0; i < allButtons.length; i++) {
            allButtons[i].addActionListener(this);
            buttonPanel.add(allButtons[i]);
        }

        add(textLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        textLabel.setText(clickedButton.getText());
    }

    public static void main(String[] args) {
        new SwingMouseEvent();
    }
}
