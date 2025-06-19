import java.awt.*;
import java.awt.event.*;

public class MenuInAMenu extends Frame implements ActionListener {
    Label statusLabel;
    MenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;
    MenuItem redColorMenuItem, greenColorMenuItem, blueColorMenuItem;
    MenuBar menuBar;
    Menu fileMenu, formatMenu, fontColorMenu;
        
    public MenuInAMenu() {
        setTitle("Menu In A Menu");
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

        formatMenu = new Menu("Format");
        formatMenu.setName("formatMenu");

        fontColorMenu = new Menu("Font Color");
        fontColorMenu.setName("fontColorMenu");

        redColorMenuItem = new MenuItem("Red");
        redColorMenuItem.setName("redColorMenuItem");
        redColorMenuItem.addActionListener(this);

        greenColorMenuItem = new MenuItem("Green");
        greenColorMenuItem.setName("greenColorMenuItem");
        greenColorMenuItem.addActionListener(this);

        blueColorMenuItem = new MenuItem("Blue");
        blueColorMenuItem.setName("blueColorMenuItem");
        blueColorMenuItem.addActionListener(this);

        fontColorMenu.add(redColorMenuItem);
        fontColorMenu.add(greenColorMenuItem);
        fontColorMenu.add(blueColorMenuItem);

        formatMenu.add(fontColorMenu);
        menuBar.add(fileMenu);
        menuBar.add(formatMenu);
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
        } else if(e.getSource() == redColorMenuItem) {
            statusLabel.setForeground(Color.RED);
        } if(e.getSource() == greenColorMenuItem) {
            statusLabel.setForeground(Color.GREEN);
        } if(e.getSource() == blueColorMenuItem) {
            statusLabel.setForeground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new MenuInAMenu();
    }
}