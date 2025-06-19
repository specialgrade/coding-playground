import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Caption extends Frame {
    private MyCanvas mainCanvas;
    private TextField captionTextField;
    private Button addCaptionButton;
    private Panel bottomPanel;

    public Caption() {
        setTitle("Caption");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        mainCanvas = new MyCanvas();
        mainCanvas.setName("mainCanvas");
        add(mainCanvas, BorderLayout.CENTER);
        
        bottomPanel = new Panel(new FlowLayout());

        captionTextField = new TextField(30);
        captionTextField.setName("captionTextField");
        bottomPanel.add(captionTextField);

        addCaptionButton = new Button("Add Caption");
        addCaptionButton.setName("addCaptionButton");
        bottomPanel.add(addCaptionButton);

        add(bottomPanel, BorderLayout.SOUTH);
        
        addCaptionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainCanvas.setCaption(captionTextField.getText());
                mainCanvas.repaint();
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
        new Caption();
    }
} 

class MyCanvas extends Canvas {
    private BufferedImage image;
    private String caption = "";

    public MyCanvas() {
        try {
            image = ImageIO.read(new File("hmp.jpg"));
        } catch (IOException e) {
            System.out.println("Image not found!");
        }
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void paint(Graphics g) {
        if(image != null) {
            g.drawImage(image, 50, 50, 380, 400, null);
        }
        g.setColor(Color.BLUE);
        g.setFont(new Font("SansSerif", Font.BOLD, 18));
        g.drawString(caption, 100, 200);
    }
}