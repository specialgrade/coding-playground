import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe1 extends JFrame implements ActionListener {
    private JButton[][] buttons = new JButton[3][3];
    private boolean isXTurn = true;
    private JLabel statusLabel;

    public TicTacToe1() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 450);
        setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel(new GridLayout(3, 3));
        Font font = new Font("Arial", Font.BOLD, 60);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(font);
                buttons[i][j].addActionListener(this);
                boardPanel.add(buttons[i][j]);
            }
        }

        statusLabel = new JLabel("Player X's turn");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> resetGame());

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(statusLabel, BorderLayout.CENTER);
        bottomPanel.add(resetButton, BorderLayout.EAST);

        add(boardPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (!btn.getText().equals("")) return;

        btn.setText(isXTurn ? "X" : "O");
        btn.setEnabled(false);

        if (checkWin()) {
            statusLabel.setText("Player " + (isXTurn ? "X" : "O") + " wins!");
            disableAllButtons();
        } else if (isBoardFull()) {
            statusLabel.setText("It's a draw!");
        } else {
            isXTurn = !isXTurn;
            statusLabel.setText("Player " + (isXTurn ? "X" : "O") + "'s turn");
        }
    }

    private boolean checkWin() {
        String curr = isXTurn ? "X" : "O";

        // Rows, Columns
        for (int i = 0; i < 3; i++) {
            if (curr.equals(buttons[i][0].getText()) &&
                curr.equals(buttons[i][1].getText()) &&
                curr.equals(buttons[i][2].getText())) return true;

            if (curr.equals(buttons[0][i].getText()) &&
                curr.equals(buttons[1][i].getText()) &&
                curr.equals(buttons[2][i].getText())) return true;
        }

        // Diagonals
        if (curr.equals(buttons[0][0].getText()) &&
            curr.equals(buttons[1][1].getText()) &&
            curr.equals(buttons[2][2].getText())) return true;

        if (curr.equals(buttons[0][2].getText()) &&
            curr.equals(buttons[1][1].getText()) &&
            curr.equals(buttons[2][0].getText())) return true;

        return false;
    }

    private boolean isBoardFull() {
        for (JButton[] row : buttons) {
            for (JButton b : row) {
                if (b.getText().equals("")) return false;
            }
        }
        return true;
    }

    private void disableAllButtons() {
        for (JButton[] row : buttons) {
            for (JButton b : row) {
                b.setEnabled(false);
            }
        }
    }

    private void resetGame() {
        for (JButton[] row : buttons) {
            for (JButton b : row) {
                b.setText("");
                b.setEnabled(true);
            }
        }
        isXTurn = true;
        statusLabel.setText("Player X's turn");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TicTacToe1::new);
    }
}
