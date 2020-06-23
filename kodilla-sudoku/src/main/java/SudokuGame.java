public class SudokuGame {
    SudokuBoard sudokuBoard = new SudokuBoard();
    UserInput userInput = new UserInput();

    public void game() {
        while (!userInput.getGameOver().equals("SUDOKU")) {
            userInput.loadUserInputX();
            userInput.loadUserInputY();
            userInput.loadUserInputValue();

            SudokuElement sudokuElement = new SudokuElement(userInput.getValue());

            sudokuBoard.board[userInput.getX() - 1][userInput.getY() - 1] = sudokuElement;


            System.out.println(sudokuBoard.toString());
        }
    }

    public boolean resolveSudoku(){
        if (userInput.getGameOver().equals("SUDOKU")){
            return true;
        }else{
            return false;
        }
    }
}
