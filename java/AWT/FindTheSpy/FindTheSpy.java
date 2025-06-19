import java.awt.*;
import java.awt.event.*;

public class FindTheSpy extends Frame implements ActionListener {
    Button button1, button2, button3, button4, button5;
    Button button6, button7, button8, button9, button10;
    Dialog noticeDialog;

    public FindTheSpy() {
        setTitle("Find the Spy!");
        setSize(400, 300);
        setLayout(new GridLayout(4, 3));
        setLocationRelativeTo(null);

        button1 = new Button("2156");
        button1.setName("button1");
        button1.addActionListener(this);

        button2 = new Button("2265");
        button2.setName("button2");
        button2.addActionListener(this);

        button3 = new Button("124");
        button3.setName("button3");
        button3.addActionListener(this);

        button4 = new Button("2014");
        button4.setName("button4");
        button4.addActionListener(this);

        button5 = new Button("1214");
        button5.setName("button5");
        button5.addActionListener(this);

        button6 = new Button("562");
        button6.setName("button6");
        button6.addActionListener(this);

        button7 = new Button("11");
        button7.setName("button7");
        button7.addActionListener(this);

        button8 = new Button("22");
        button8.setName("button8");
        button8.addActionListener(this);
    
        button9 = new Button("213");
        button9.setName("button9");
        button9.addActionListener(this);
    
        button10 = new Button("54136");
        button10.setName("button10");
        button10.addActionListener(this);
        
        noticeDialog = new Dialog(this, "Notice", true);
        noticeDialog.setName("noticeDialog");
        noticeDialog.setLayout(new FlowLayout());
        noticeDialog.setSize(200, 100);
        noticeDialog.setLocationRelativeTo(this);
        noticeDialog.add(new Label("Spy found!"));

        Button okButton = new Button("Ok");
        okButton.addActionListener(e -> noticeDialog.setVisible(false));
        noticeDialog.add(okButton);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);

        noticeDialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                noticeDialog.setVisible(false);
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public boolean isSpy(String id) {
        int sum = 0;
        for (char ch : id.toCharArray()) {
            sum += ch - '0';
        }
        return sum % 7 == 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        if (isSpy(btn.getLabel())) {
            noticeDialog.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new FindTheSpy();
    }
}
