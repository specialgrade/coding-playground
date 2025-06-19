import java.awt.*;
import java.awt.event.*;

public class DrawingShapes extends Frame {

    private MyCanvas mainCanvas;
    private Checkbox redCheckBox, greenCheckBox, blueCheckBox;
    private CheckboxGroup colorGroup;

    public DrawingShapes() {
        setTitle("Drawing Shapes");
        setSize(600, 500);
        setLayout(new FlowLayout());

        colorGroup = new CheckboxGroup();

        redCheckBox = new Checkbox("Red", colorGroup, true);
        redCheckBox.setName("redCheckBox");
        add(redCheckBox);

        greenCheckBox = new Checkbox("Green", colorGroup, false);
        greenCheckBox.setName("greenCheckBox");
        add(greenCheckBox);

        blueCheckBox = new Checkbox("Blue", colorGroup, false);
        blueCheckBox.setName("blueCheckBox");
        add(blueCheckBox);

        mainCanvas = new MyCanvas();
        mainCanvas.setName("mainCanvas");
        mainCanvas.setSize(550, 400);
        mainCanvas.setBackground(Color.WHITE);
        add(mainCanvas);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawingShapes();
    }

    class MyCanvas extends Canvas {

        public MyCanvas() {
            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    Graphics g = getGraphics();
                    g.setColor(getSelectedColor());
                    g.fillOval(e.getX(), e.getY(), 15, 15);
                }
            });
        }

        private Color getSelectedColor() {
            if (redCheckBox.getState()) return Color.RED;
            if (greenCheckBox.getState()) return Color.GREEN;
            if (blueCheckBox.getState()) return Color.BLUE;
            return Color.BLACK; 
        }
    }
}
