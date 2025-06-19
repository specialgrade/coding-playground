import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileSaver extends Frame implements ActionListener {
    Button createFileButton;
    Label fileContentLabel;
    FileDialog fileDialog;
    
    public FileSaver() {
        setTitle("File Saver");
        setSize(400, 300);
        setLayout(null);

        createFileButton = new Button("Create File");
        createFileButton.setBounds(50, 50, 80, 30);
        createFileButton.setName("createFileButton");
        createFileButton.addActionListener(this);

        fileContentLabel = new Label();
        fileContentLabel.setBounds(50, 100, 300, 30);
        fileContentLabel.setName("fileContentLabel");

        fileDialog = new FileDialog(this, "Open File", FileDialog.SAVE);
        fileDialog.setName("fileDialog");

        add(createFileButton);
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
            try(FileWriter writer = new FileWriter((selectedFile))) {
                writer.write("File handling");
                fileContentLabel.setText("File created: " + selectedFile.getName());
            } catch(IOException exception) {
                fileContentLabel.setText("Error! Can\'t write file.");
            }
        }
    }

    public static void main(String[] args) {
        new FileSaver();
    }
}