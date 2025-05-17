import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A simple 2-player Tic-Tac-Toe Game using Java Swing.
 * It includes a minimalist GUI, scoring, start/restart/quit controls,
 * and win/tie checker.
 * 
 * @author Alyssa Marie D. Dela Cruz
 * @version 1.0
 * @since 2025-05-17
 */
public class TicTacToeGame extends JFrame implements ActionListener {
    private JButton[][] buttons = new JButton[3][3];
    private JButton startButton, restartButton, quitButton;
    private JLabel directionLabel, titleLabel, statusLabel, scoreLabel;
    private JPanel titlePanel, gridPanel, scorePanel, controlPanel;
    private boolean xTurn = true;
    private String player1 = "Player 1", player2 = "Player 2";
    private int player1Score = 0, player2Score = 0;

    /**
     * Constructor for the Tic-Tac-Toe Game GUI. It initializes all components.
     */
    public TicTacToeGame() {
        setTitle("Tic-Tac-Toe Game");
        setSize(500, 600);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title section
        titlePanel = new JPanel();
        titlePanel.setName("titlePanel");
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));

        directionLabel = new JLabel("Click a cell to play. X starts first.", SwingConstants.CENTER);
        directionLabel.setName("directionLabel");
        directionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        directionLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        titleLabel = new JLabel("Tic-Tac-Toe Game", SwingConstants.CENTER);
        titleLabel.setName("titleLabel");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        titlePanel.add(Box.createVerticalStrut(10));
        titlePanel.add(directionLabel);
        titlePanel.add(Box.createVerticalStrut(5));
        titlePanel.add(titleLabel);
        titlePanel.add(Box.createVerticalStrut(10));

        add(titlePanel, BorderLayout.NORTH);    

        // Grid section (3x3)
        gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setName("gridPanel");
        
        Font font = new Font("Arial", Font.BOLD, 60);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(font);
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].addActionListener(this);
                buttons[i][j].setEnabled(false);
                gridPanel.add(buttons[i][j]);
            }
        }
        add(gridPanel, BorderLayout.CENTER);

        // Score section
        scorePanel = new JPanel();
        scorePanel.setName("scorePanel");
        scorePanel.setLayout(new BoxLayout(scorePanel, BoxLayout.Y_AXIS));

        scoreLabel = new JLabel("Score: Player 1: 0 | Player 2: 0", SwingConstants.CENTER);
        scoreLabel.setName("scoreLabel");
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scorePanel.add(scoreLabel);
        scorePanel.add(Box.createVerticalStrut(10));

        // Control section
        controlPanel = new JPanel(new FlowLayout());
        controlPanel.setName("controlPanel");
        
        startButton = new JButton("Start");
        startButton.setName("startButton");
        startButton.addActionListener(this);
        controlPanel.add(startButton);

        restartButton = new JButton("Restart");
        restartButton.setName("restartButton");
        restartButton.addActionListener(this);
        controlPanel.add(restartButton);

        quitButton = new JButton("Quit");
        quitButton.setName("quitButton");
        quitButton.addActionListener(this);
        controlPanel.add(quitButton);

        scorePanel.add(controlPanel);

        statusLabel = new JLabel("Click 'Start' to begin.", SwingConstants.CENTER);
        statusLabel.setName("statusLabel");
        statusLabel.setFont(new Font("Arial", Font.ITALIC, 16));
        statusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scorePanel.add(Box.createVerticalStrut(10));
        scorePanel.add(statusLabel);

        add(scorePanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    /**
     * Enables or disables the grid buttons.
     * @param enabled true to enable buttons, false to disable buttons
     */
    private  void setGridButtons(boolean enabled) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(enabled);
            }
        }
    }

    /**
     * Clear all grid buttons for a new round.
     */
    private  void clearGridButtons() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setBackground(null);
                buttons[i][j].setEnabled(true);
            }
        }
    }

    /**
     * Checks for a winner.
     * @return "X", "O", or null if there is no winner detected
     */
    private String checkWinner() {
        for(int i = 0; i < 3; i++) {
            if(!buttons[i][0].getText().equals("") &&
                buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][1].getText().equals(buttons[i][2].getText())) {
                    highlight(buttons[i][0], buttons[i][1], buttons[i][2]);
                    return buttons[i][0].getText();
                }
            if(!buttons[0][i].getText().equals("") &&
                buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[1][i].getText().equals(buttons[2][i].getText())) {
                    highlight(buttons[0][i], buttons[1][i], buttons[2][i]);
                    return buttons[0][i].getText();
                }
        }

        if(!buttons[0][0].getText().isEmpty() &&
            buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][2].getText())) {
                highlight(buttons[0][0], buttons[1][1], buttons[2][2]);
                return buttons[0][0].getText();
        }
        
        if(!buttons[0][2].getText().equals("") &&
            buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][0].getText())) {
                highlight(buttons[0][2], buttons[1][1], buttons[2][0]);
                return buttons[0][2].getText();
        }
        return null;
    }

    /**
     * Highlights the winning buttons with a different background.
     * @param b1 First button
     * @param b2 Second button
     * @param b3 Third button
     */
    private void highlight(JButton b1, JButton b2, JButton b3) {
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
    }

    /**
     * Checks for a tie.
     * @return true if there's a tie detected, false otherwise
     */
    private boolean checkTie() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Updates the score label based on the player scores.
     */
    private void  updateScoreLabel() {
        scoreLabel.setText("Score: " + player1 + ": " + player1Score + " | " + player2 + ": " + player2Score);
    }

    /**
     * Prepares for the next round after a short delay.
     */
    private void nextRound() {
        Timer timer = new Timer(1500, e -> {
            clearGridButtons();
            xTurn = true;
            statusLabel.setText(player1 + "'s turn (X).");
        });
        timer.setRepeats(false);
        timer.start();
    }

    /**
     * Handles all button actions: Start, Restart, Quit, and the overall gameplay.
     * @param e ActionEvent triggered by user interaction (button click)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton) {
            player1 = JOptionPane.showInputDialog(this, "Enter name for Player 1 (X):");
            if(player1 == null || player1.trim().isEmpty()) {
                player1 = "Player 1";
            }

            player2 = JOptionPane.showInputDialog(this, "Enter name for Player 2 (O):");
            if(player2 == null || player2.trim().isEmpty()) {
                player2 = "Player 2";
            }

            player1Score = 0;
            player2Score = 0;
            updateScoreLabel();
            clearGridButtons();
            xTurn = true;
            statusLabel.setText(player1 + "'s turn (X).");
        } else if(e.getSource() == restartButton) {
            player1Score = 0;
            player2Score = 0;
            updateScoreLabel();
            clearGridButtons();
            setGridButtons(true);
            xTurn = true;
            statusLabel.setText("Game reset. " + player1 + "'s turn (X).");
        } else if (e.getSource() == quitButton) {
            System.exit(0);
        } else {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(e.getSource() == buttons[i][j] && buttons[i][j].getText().isEmpty()) {
                        buttons[i][j].setText(xTurn ? "X" : "O");
                        buttons[i][j].setEnabled(false);
                            
                        String winner = checkWinner();
                        if(winner != null) {
                            if(winner.equals("X")) {
                                player1Score++;
                                statusLabel.setText(player1 + " wins!");
                            } else {
                                player2Score++;
                                statusLabel.setText(player2 + " wins!");
                            }
                            updateScoreLabel();
                            setGridButtons(false);
                            nextRound();
                        } else if(checkTie()) {
                            statusLabel.setText("It's a tie!");
                            setGridButtons(true);
                            nextRound();
                        } else {
                            xTurn = !xTurn;
                            statusLabel.setText((xTurn ? player1 : player2) + "'s turn (" + (xTurn ? "X" : "O") + ").");
                        }
                    }
                }
            }
        }
    }

    /**
     * Entry point of the program.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        new TicTacToeGame();
    }
}