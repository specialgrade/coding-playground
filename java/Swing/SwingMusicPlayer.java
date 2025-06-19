import java.awt.event.*;
import javax.swing.*;

public class SwingMusicPlayer extends JFrame implements ActionListener {
    private JList<String> musicList;
    private DefaultListModel<String> listModel;
    private JTextField musicTextField;
    private JButton addButton, removeButton;

    public SwingMusicPlayer() {
        setTitle("Music Player");
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        listModel.addElement("Music Main 1");
        listModel.addElement("Music Main 2");

        musicList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(musicList);
        musicList.setName("musicList");
        scrollPane.setBounds(150, 90, 200, 100);

        musicTextField = new JTextField();
        musicTextField.setName("musicTextField");
        musicTextField.setBounds(150, 200, 200, 30);

        addButton = new JButton("Add");
        addButton.setName("addButton");
        addButton.setBounds(150, 240, 200, 30);
        addButton.addActionListener(this);

        removeButton = new JButton("Remove");
        removeButton.setName("removeButton");
        removeButton.setBounds(150, 280, 200, 30);
        removeButton.addActionListener(this);

        add(scrollPane);
        add(musicTextField);
        add(addButton);
        add(removeButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String song = musicTextField.getText().trim();
            if (!song.isEmpty()) {
                listModel.addElement(song);
                musicTextField.setText("");
            }
        } else if (e.getSource() == removeButton) {
            int selectedIndex = musicList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingMusicPlayer());
    }
}
