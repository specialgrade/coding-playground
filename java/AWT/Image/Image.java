import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image extends Frame {
    private MyCanvas mainCanvas;

    public Image() {
        setTitle("Image");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        mainCanvas = new MyCanvas();
        mainCanvas.setName("mainCanvas");
        add(mainCanvas, BorderLayout.CENTER);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Image();
    }
} 

class MyCanvas extends Canvas {
    private BufferedImage image;

    public MyCanvas() {
        try {
            image = ImageIO.read(new File("hmp.jpg"));
        } catch (IOException e) {
            System.out.println("Image not found!");
        }
    }

    public void paint(Graphics g) {
        if(image != null) {
            g.drawImage(image, 50, 50, 380, 400, null);
        }
    }
}