import java.awt.event.*;
import javax.swing.*;

public class SwingMusicPlayer1 extends JFrame implements ActionListener {
    private JList<String> musicList, favoritesList;
    private DefaultListModel<String> musicListModel, favoritesListModel;
    private JTextField musicTextField;
    private JButton addButton, removeButton, addToFavoritesButton;

    public SwingMusicPlayer1() {
        setTitle("Music Player");
        setSize(400, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        musicListModel = new DefaultListModel<>();
        musicListModel.addElement("Music Main 1");
        musicListModel.addElement("Music Main 2");

        favoritesListModel = new DefaultListModel<>();

        musicList = new JList<>(musicListModel);
        musicList.setName("musicList");
        JScrollPane musicScrollPane = new JScrollPane(musicList);
        musicScrollPane.setBounds(150, 90, 200, 100);

        favoritesList = new JList<>(favoritesListModel);
        favoritesList.setName("favoritesList");
        JScrollPane favoritesScrollPane = new JScrollPane(favoritesList);
        favoritesScrollPane.setBounds(150, 400, 200, 100);

        musicTextField = new JTextField();
        musicTextField.setBounds(150, 200, 200, 30);
        musicTextField.setName("musicTextField");

        addButton = new JButton("Add");
        addButton.setBounds(150, 240, 200, 30);
        addButton.setName("addButton");
        addButton.addActionListener(this);

        removeButton = new JButton("Remove");
        removeButton.setBounds(150, 280, 200, 30);
        removeButton.setName("removeButton");
        removeButton.addActionListener(this);

        addToFavoritesButton = new JButton("Favorites");
        addToFavoritesButton.setBounds(150, 320, 200, 30);
        addToFavoritesButton.setName("addToFavoritesButton");
        addToFavoritesButton.addActionListener(this);

        add(musicScrollPane);
        add(favoritesScrollPane);
        add(musicTextField);
        add(addButton);
        add(removeButton);
        add(addToFavoritesButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addButton) {
            String song = musicTextField.getText().trim();
            if (!song.isEmpty()) {
                musicListModel.addElement(song);
                musicTextField.setText("");
            }

        } else if (source == removeButton) {
            int selectedIndex = musicList.getSelectedIndex();
            if (selectedIndex != -1) {
                String selectedSong = musicListModel.getElementAt(selectedIndex);
                musicListModel.remove(selectedIndex);

                for (int i = 0; i < favoritesListModel.getSize(); i++) {
                    if (favoritesListModel.getElementAt(i).equals(selectedSong)) {
                        favoritesListModel.remove(i);
                        break;
                    }
                }
            }

        } else if (source == addToFavoritesButton) {
            int selectedIndex = musicList.getSelectedIndex();
            if (selectedIndex != -1) {
                String selectedSong = musicListModel.getElementAt(selectedIndex);
                if (!favoritesListModel.contains(selectedSong)) {
                    favoritesListModel.addElement(selectedSong);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingMusicPlayer1::new);
    }
}
