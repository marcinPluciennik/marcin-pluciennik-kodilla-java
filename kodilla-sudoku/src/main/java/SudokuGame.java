import java.util.Scanner;

public class SudokuGame {
    SudokuBoard sudokuBoard = new SudokuBoard();
    UserInput userInput = new UserInput();

    public void game() {
        while (!userInput.getGameOver().equals("SUDOKU")) {
            userInput.loadUserInputX();
            userInput.loadUserInputY();
            userInput.loadUserInputValue();

            SudokuElement sudokuElement = new SudokuElement(userInput.getValue());
            sudokuBoard.rowBoard.get(userInput.getX() - 1).getRow().set((userInput.getY() - 1), sudokuElement);

            System.out.println(sudokuBoard.toString());
        }
    }

    public boolean resolveSudoku() {
        if (userInput.getGameOver().equals("SUDOKU")) {
            return true;
        } else {
            return false;
        }
    }

    public void newGameAfterSudoku() {
        if (userInput.getGameOver().equals(userInput.getSUDOKU())) {
            Scanner s = new Scanner(System.in);
            System.out.println("Press ENTER twice to play again or any key + ENTER to quit game");
            String newGameOrNot = s.nextLine();
            if (newGameOrNot.equals("")) {
                System.out.println("NEW GAME");
            } else {
                System.exit(0);
            }
        }
    }
}
