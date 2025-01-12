import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame implements ActionListener {
    private char[][] board = new char[3][3];
    private JButton[][] buttons = new JButton[3][3];
    private char player = 'X';
    private boolean gameOver = false;

    public TicTacToeGUI() {
        setTitle("Tic Tac Toe Game");
        setSize(400, 400);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeBoard();

        setVisible(true);
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
                buttons[row][col] = new JButton(" ");
                buttons[row][col].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[row][col].addActionListener(this);
                add(buttons[row][col]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) return;

        JButton clickedButton = (JButton) e.getSource();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col] == clickedButton && board[row][col] == ' ') {
                    board[row][col] = player;
                    buttons[row][col].setText(String.valueOf(player));

                    if (haveWon(player)) {
                        JOptionPane.showMessageDialog(this, "Player " + player + " has won the match.");
                        gameOver = true;
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }
                    return;
                }
            }
        }
    }

    private boolean haveWon(char player) {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}
