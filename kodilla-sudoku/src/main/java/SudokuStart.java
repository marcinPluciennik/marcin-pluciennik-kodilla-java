public class SudokuStart {

    public static void main(String[] args){
        SudokuBoard firstSudokuBoard = new SudokuBoard();
        System.out.println("====== SUDOKU =====");
        System.out.println(firstSudokuBoard.toString());
        SudokuGame theGame = new SudokuGame();

        boolean gameFinished = false;
        while(!gameFinished) {
            theGame.game();
            gameFinished = theGame.resolveSudoku();
        }
        theGame.solvingTheGame();
        theGame.newGameAfterSudoku();
    }
}
