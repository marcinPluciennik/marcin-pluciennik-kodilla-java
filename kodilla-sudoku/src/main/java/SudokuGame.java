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
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
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
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this column! Try again...");
            }

            //Check duplicate in box 3x3(1)
            int quantityInBox1 = 0;
            if ((userInput.getX() == 1 || userInput.getX() == 2 || userInput.getX() ==3) &&
                    (userInput.getY() == 1 || userInput.getY() == 2 || userInput.getY() == 3)){
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox1++;
                        }
                    }
                }
            }
            if (quantityInBox1 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(2)
            int quantityInBox2 = 0;
            if ((userInput.getX() == 1 || userInput.getX() == 2 || userInput.getX() ==3) &&
                    (userInput.getY() == 4 || userInput.getY() == 5 || userInput.getY() == 6)){
                for (int i = 0; i < 3; i++){
                    for (int j = 3; j < 6; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox2++;
                        }
                    }
                }
            }
            if (quantityInBox2 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(3)
            int quantityInBox3 = 0;
            if ((userInput.getX() == 1 || userInput.getX() == 2 || userInput.getX() ==3) &&
                    (userInput.getY() == 7 || userInput.getY() == 8 || userInput.getY() == 9)){
                for (int i = 0; i < 3; i++){
                    for (int j = 6; j < 9; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox3++;
                        }
                    }
                }
            }
            if (quantityInBox3 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(4)
            int quantityInBox4 = 0;
            if ((userInput.getX() == 4 || userInput.getX() == 5 || userInput.getX() == 6) &&
                    (userInput.getY() == 1 || userInput.getY() == 2 || userInput.getY() == 3)){
                for (int i = 3; i < 6; i++){
                    for (int j = 0; j < 3; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox4++;
                        }
                    }
                }
            }
            if (quantityInBox4 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(5)
            int quantityInBox5 = 0;
            if ((userInput.getX() == 7 || userInput.getX() == 8 || userInput.getX() == 9) &&
                    (userInput.getY() == 1 || userInput.getY() == 2 || userInput.getY() == 3)){
                for (int i = 6; i < 9; i++){
                    for (int j = 0; j < 3; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox5++;
                        }
                    }
                }
            }
            if (quantityInBox5 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(6)
            int quantityInBox6 = 0;
            if ((userInput.getX() == 4 || userInput.getX() == 5 || userInput.getX() == 6) &&
                    (userInput.getY() == 4 || userInput.getY() == 5 || userInput.getY() == 6)){
                for (int i = 3; i < 6; i++){
                    for (int j = 3; j < 6; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox6++;
                        }
                    }
                }
            }
            if (quantityInBox6 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(7)
            int quantityInBox7 = 0;
            if ((userInput.getX() == 4 || userInput.getX() == 5 || userInput.getX() == 6) &&
                    (userInput.getY() == 7 || userInput.getY() == 8 || userInput.getY() == 9)){
                for (int i = 3; i < 6; i++){
                    for (int j = 6; j < 9; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox7++;
                        }
                    }
                }
            }
            if (quantityInBox7 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(8)
            int quantityInBox8 = 0;
            if ((userInput.getX() == 7 || userInput.getX() == 8 || userInput.getX() == 9) &&
                    (userInput.getY() == 4 || userInput.getY() == 5 || userInput.getY() == 6)){
                for (int i = 6; i < 9; i++){
                    for (int j = 3; j < 6; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox8++;
                        }
                    }
                }
            }
            if (quantityInBox8 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }

            //Check duplicate in box 3x3(9)
            int quantityInBox9 = 0;
            if ((userInput.getX() == 7 || userInput.getX() == 8 || userInput.getX() == 9) &&
                    (userInput.getY() == 7 || userInput.getY() == 8 || userInput.getY() == 9)){
                for (int i = 6; i < 9; i++){
                    for (int j = 6; j < 9; j++){
                        if (sudokuBoard.getRowBoard().get(i).getRow().get(j).equals(sudokuElement)){
                            quantityInBox9++;
                        }
                    }
                }
            }
            if (quantityInBox9 > 1){
                sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1),
                        new SudokuElement());
                System.out.println("\n'" + userInput.getValue() +  "' exists already in this box 3x3! Try again...");
            }




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
