import java.awt.*;
import java.awt.event.*;

public class MouseEventAct extends Frame implements  ActionListener {
    Label textLabel;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
           button11, button12, button13, button14, button15, button16, button17, button18, button19, button20;
    Panel buttonPanel;

    public MouseEventAct() {
        setTitle("Mouse Event Act");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        textLabel = new Label("");
        textLabel.setName("textLabel");

        buttonPanel = new Panel(new GridLayout(4, 5, 5, 5));

        button1 = new Button("1"); button1.setName("button1"); button2 = new Button("2"); button2.setName("button2");
        button3 = new Button("3"); button3.setName("button3"); button4 = new Button("4"); button4.setName("button4");
        button5 = new Button("5"); button5.setName("button5"); button6 = new Button("6"); button6.setName("button6");
        button7 = new Button("7"); button7.setName("button7"); button8 = new Button("8"); button8.setName("button8");
        button9 = new Button("9"); button9.setName("button9"); button10 = new Button("10"); button10.setName("button10");
        button11 = new Button("11"); button11.setName("button11"); button12 = new Button("12"); button12.setName("button12");
        button13 = new Button("13"); button13.setName("button13"); button14 = new Button("14"); button14.setName("button14");
        button15 = new Button("15"); button15.setName("button15"); button16 = new Button("16"); button16.setName("button16");
        button17 = new Button("17"); button17.setName("button17"); button18 = new Button("18"); button18.setName("button18");
        button19 = new Button("19"); button19.setName("button19"); button20 = new Button("20"); button20.setName("button20");

        Button[] allButtons = {
            button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
            button11, button12, button13, button14, button15, button16, button17, button18, button19, button20
        };

        for (Button b : allButtons) {
            b.addActionListener(this);
            buttonPanel.add(b);
        }

        add(textLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button clickedButton = (Button) e.getSource();
        textLabel.setText(clickedButton.getLabel()); 
    }

    public static void main(String[] args) {
        new MouseEventAct();
    }
}