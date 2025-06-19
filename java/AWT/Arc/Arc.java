import java.awt.*;
import java.awt.event.*;

public class Arc extends Frame {
    private TextField startingAngleTextField, extentAngleTextField;
    private Button drawArcButton;
    private MyCanvas mainCanvas;

    public Arc() {
        setTitle("Arc");
        setSize(500, 500);
        setLayout(new FlowLayout());

        startingAngleTextField = new TextField(5);
        startingAngleTextField.setName("startingAngleTextField");
        add(new Label("Start Angle:"));
        add(startingAngleTextField);

        extentAngleTextField = new TextField(5);
        extentAngleTextField.setName("extentAngleTextField");
        add(new Label("Extent Angle:"));
        add(extentAngleTextField);

        drawArcButton = new Button("Draw");
        drawArcButton.setName("drawArcButton");
        add(drawArcButton);

        mainCanvas = new MyCanvas();
        mainCanvas.setName("mainCanvas");
        mainCanvas.setSize(500, 500);
        mainCanvas.setBackground(Color.WHITE);
        add(mainCanvas);

        drawArcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int startAngle = Integer.parseInt(startingAngleTextField.getText());
                    int arcAngle = Integer.parseInt(extentAngleTextField.getText());
                    mainCanvas.setAngles(startAngle, arcAngle);
                    mainCanvas.repaint();
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid Input!");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Arc();
    }
}

class MyCanvas extends Canvas {
    private int startAngle = 0;
    private int arcAngle = 0;

    public void setAngles(int startAngle, int arcAngle) {
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillArc(100, 100, 200, 200, startAngle, arcAngle);
    }
}
