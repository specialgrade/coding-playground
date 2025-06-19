import java.awt.*;
import java.awt.event.*;

public class MusicPlayer extends Frame implements ActionListener {
    List musicList;
    TextField musicTextField;
    Button addButton, removeButton;
    
    public MusicPlayer() {
        setTitle("Music Player");
        setSize(400, 500);
        setLayout(null);

        musicList = new List();
        musicList.setBounds(150, 90, 200, 100);
        musicList.setName("musicList");
        musicList.add("Music Main 1");
        musicList.add("Music Main 2");

        musicTextField = new TextField();
        musicTextField.setBounds(150, 200, 200, 30);
        musicTextField.setName("musicTextField");

        addButton = new Button("Add");
        addButton.setBounds(150, 240, 200, 30);
        addButton.setName("addButton");
        addButton.addActionListener(this);

        removeButton = new Button("Remove");
        removeButton.setBounds(150, 280, 200, 30);
        removeButton.setName("removeButton");
        removeButton.addActionListener(this);

        add(musicList);
        add(musicTextField);
        add(addButton);
        add(removeButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String song = musicTextField.getText().trim();
            if (!song.isEmpty()) {
                musicList.add(song);
                musicTextField.setText("");
            }
        } else if (e.getSource() == removeButton) {
            String selectedSong = musicList.getSelectedItem();
            if (selectedSong != null) {
                musicList.remove(selectedSong);
            }
        }
    }

    public static void main(String[] args) {
        new MusicPlayer();
    }
}