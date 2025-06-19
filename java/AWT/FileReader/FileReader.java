import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileReader extends Frame implements ActionListener {
    Button openFileDialogButton;
    Label fileContentLabel;
    FileDialog fileDialog;
    
    public FileReader() {
        setTitle("File Reader");
        setSize(400, 300);
        setLayout(null);

        openFileDialogButton = new Button("Open");
        openFileDialogButton.setBounds(50, 50, 80, 30);
        openFileDialogButton.setName("openFileDialogButton");
        openFileDialogButton.addActionListener(this);

        fileContentLabel = new Label();
        fileContentLabel.setBounds(50, 100, 300, 30);
        fileContentLabel.setName("fileContentLabel");

        fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
        fileDialog.setName("fileDialog");

        add(openFileDialogButton);
        add(fileContentLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        fileDialog.setVisible(true);
        String directory = fileDialog.getDirectory();
        String file = fileDialog.getFile();

        if(file != null) {
            File selectedFile = new File(directory, file);
            try(BufferedReader reader = new BufferedReader(new java.io.FileReader(selectedFile))) {
                String content = reader.readLine();
                fileContentLabel.setText(content);
            } catch(IOException exception) {
                fileContentLabel.setText("Error! Can\'t read file.");
            }
        }
    }

    public static void main(String[] args) {
        new FileReader();
    }
}