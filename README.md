

# Tic Tac Toe Game - Java GUI

This is a simple implementation of the **Tic Tac Toe** game using **Java** and **Swing** for the graphical user interface (GUI).

## Features

- **Two Player Mode**: Players can alternate between 'X' and 'O' to make their moves.
- **Game Reset**: After a player wins, the game board is reset for a new round.
- **Winning Logic**: The game detects when a player wins either horizontally, vertically, or diagonally.
- **User-Friendly Interface**: Buttons represent each cell of the Tic Tac Toe board, and players click them to make their moves.

## Technologies Used

- **Java** (Swing for GUI)
- **AWT (Abstract Window Toolkit)** for layout management
- **Event Handling** for detecting button clicks

## Installation Instructions

1. Clone or download this repository.
2. Open the project in your favorite IDE (such as IntelliJ IDEA, Eclipse, or NetBeans).
3. Run the `TicTacToeGUI.java` file to start the game.

## How to Play

1. The game opens a window with a 3x3 grid of buttons.
2. Player 'X' starts first. Click any empty cell to make a move.
3. After every move, the game will automatically switch to the next player (Player 'O').
4. The game checks for a winner after each move. If there is a winner, a dialog box will appear announcing the winner.
5. Once the game finishes, the board is reset, and Player 'X' starts the next round.

## Code Explanation

- **TicTacToeGUI.java**: The main class that creates the GUI using Java Swing.
  - It uses a 3x3 grid of `JButton` components to represent the game board.
  - Players interact with the board by clicking buttons. Each button is either 'X' or 'O' depending on the current player.
  - The `checkWinner()` method checks if a player has won the game after every move.
  - The `resetBoard()` method resets the game board for a new round after a win.

## Example Screenshot
![image](https://github.com/user-attachments/assets/640ced41-be2e-410d-ab2f-1eb1670b2f48)
![image](https://github.com/user-attachments/assets/bfb318c3-1972-4def-8be5-73017517cce3)





## Contributing

Feel free to fork this repository and submit pull requests if you want to improve or add new features to the game!

## License

This project is open-source and available under the [MIT License](LICENSE).

---

