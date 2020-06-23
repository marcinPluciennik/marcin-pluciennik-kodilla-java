public class SudokuStart {

    public static void main(String[] args){
        SudokuBoard firstSudokuBoard = new SudokuBoard();
        System.out.println(firstSudokuBoard.toString());

        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            theGame.game();
            gameFinished = theGame.resolveSudoku();
        }
        UserInput userInput = new UserInput();
        userInput.newGameAfterSudoku();
    }
}
