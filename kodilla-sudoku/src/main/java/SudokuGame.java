import java.util.Collections;
import java.util.Scanner;

public class SudokuGame {
    SudokuBoard sudokuBoard = new SudokuBoard();
    UserInput userInput = new UserInput();

    public void game() {
        while (!userInput.getGameOver().equals("SUDOKU")) {
            userInput.loadUserInputX();
            userInput.loadUserInputY();
            userInput.loadUserInputValue();

            SudokuElement sudokuElement = new SudokuElement();
            sudokuElement.setValue(userInput.getValue());
            sudokuBoard.rowBoard.get(userInput.getX() - 1).getRow().set((userInput.getY() - 1), sudokuElement);

            //Check duplicate value in row
            int quantityInRow = Collections.frequency((sudokuBoard.rowBoard.get(userInput.getX() - 1).getRow()),
                    sudokuElement);
            if (quantityInRow > 1){
                sudokuBoard.rowBoard.get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this row! Try again...");
            }


            //Check duplicate value in column
            int quantityInColumn = 0;
            for (int i = 0; i < 9; i++){
                if (sudokuBoard.getRowBoard().get(i).getRow().get(userInput.getY() - 1).equals(sudokuElement))
                    quantityInColumn ++;
                }
            if (quantityInColumn > 1){
                sudokuBoard.rowBoard.get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this column! Try again...");
            }

            //Check duplicate in box 3x3




            System.out.println("\n====== SUDOKU =====");
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
