import java.awt.*;
import java.awt.event.*;

public class GoToFile extends Frame implements ActionListener {
    Label statusLabel;
    MenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;
    MenuBar menuBar;
    Menu fileMenu;
        
    public GoToFile() {
        setTitle("Go To File");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        menuBar = new MenuBar();
        menuBar.setName("menuBar");

        fileMenu = new Menu("File");
        fileMenu.setName("fileMenu");

        newMenuItem = new MenuItem("New");
        newMenuItem.setName("newMenuItem");
        newMenuItem.addActionListener(this);

        openMenuItem = new MenuItem("Open");
        openMenuItem.setName("openMenuItem");
        openMenuItem.addActionListener(this);

        saveMenuItem = new MenuItem("Save");
        saveMenuItem.setName("saveMenuItem");
        saveMenuItem.addActionListener(this);

        exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setName("exitMenuItem");
        exitMenuItem.addActionListener(this);

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        setMenuBar(menuBar);

        statusLabel = new Label("Ready:");
        statusLabel.setName("statusLabel");
        add(statusLabel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newMenuItem) {
            statusLabel.setText("Creating new file...");
        } else if(e.getSource() == openMenuItem) {
            statusLabel.setText("Opening file...");
        } else if(e.getSource() == saveMenuItem) {
            statusLabel.setText("Saving file...");
        } else if(e.getSource() == exitMenuItem) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new GoToFile();
    }
}