import java.awt.*;
import java.awt.event.*;

public class MusicPlayer1 extends Frame implements ActionListener {
    List musicList, favoritesList;
    TextField musicTextField;
    Button addButton, removeButton, addToFavoritesButton;
    
    public MusicPlayer1() {
        setTitle("Music Player");
        setSize(400, 700);
        setLayout(null);

        musicList = new List();
        musicList.setBounds(150, 90, 200, 100);
        musicList.setName("musicList");
        musicList.add("Music Main 1");
        musicList.add("Music Main 2");

        favoritesList = new List();
        favoritesList.setBounds(150, 400, 200, 100);
        favoritesList.setName("favoritesList");

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

        addToFavoritesButton = new Button("Favorites");
        addToFavoritesButton.setBounds(150, 320, 200, 30);
        addToFavoritesButton.setName("addToFavoritesButton");
        addToFavoritesButton.addActionListener(this);

        add(musicList);
        add(favoritesList);
        add(musicTextField);
        add(addButton);
        add(removeButton);
        add(addToFavoritesButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton) {
            String song = musicTextField.getText().trim();
            if (!song.isEmpty()) {
                musicList.add(song);
                musicTextField.setText("");
            }
        } else if(e.getSource() == removeButton) {
            String selectedSong = musicList.getSelectedItem();
            if(selectedSong != null) {
                musicList.remove(selectedSong);
                for(int i = 0; i < favoritesList.getItemCount(); i++) {
                    if (favoritesList.getItem(i).equals(selectedSong)) {
                        favoritesList.remove(i);
                        break;
                    }
                }
            }
        } else if(e.getSource() == addToFavoritesButton) {
            String selectedSong = musicList.getSelectedItem();
            if(selectedSong != null) {
                boolean inFavorites = false;
                for(int i = 0; i < favoritesList.getItemCount(); i++) {
                    if (favoritesList.getItem(i).equals(selectedSong)) {
                        inFavorites = true;
                        break;
                    }
                }
                if(!inFavorites) {
                    favoritesList.add(selectedSong);
                }
            }
        }
    }

    public static void main(String[] args) {
        new MusicPlayer1();
    }
}