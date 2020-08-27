import java.util.*;

public class SudokuGame {
    SudokuBoard sudokuBoard = new SudokuBoard();
    UserInput userInput = new UserInput();

    public void game() {
        System.out.println("Enter SUDOKU anytime to see the solution");

        while (userInput.getGameOver().isEmpty()) {
            userInput.loadUserInputX();
            if (userInput.getGameOver().equals("SUDOKU")){
                break;
            }
            userInput.loadUserInputY();
            if (userInput.getGameOver().equals("SUDOKU")){
                break;
            }
            userInput.loadUserInputValue();
            if (userInput.getGameOver().equals("SUDOKU")){
                break;
            }

            SudokuElement sudokuElement = new SudokuElement();
            sudokuElement.setValue(userInput.getValue());
            sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow().set((userInput.getY() - 1), sudokuElement);

            //Check duplicate value in row
            int quantityInRow = Collections.frequency((sudokuBoard.getRowBoard().get(userInput.getX() - 1).getRow()),
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

    public void solvingTheGame(){
        //checking rows
        List<Integer> row1 = numbersInRow(0);
        makeNewListOfNumbersInRow(row1,0);

        List<Integer> row2 = numbersInRow(1);
        makeNewListOfNumbersInRow(row2,1);

        List<Integer> row3 = numbersInRow(2);
        makeNewListOfNumbersInRow(row3,2);

        List<Integer> row4 = numbersInRow(3);
        makeNewListOfNumbersInRow(row4,3);

        List<Integer> row5 = numbersInRow(4);
        makeNewListOfNumbersInRow(row5,4);

        List<Integer> row6 = numbersInRow(5);
        makeNewListOfNumbersInRow(row6,5);

        List<Integer> row7 = numbersInRow(6);
        makeNewListOfNumbersInRow(row7,6);

        List<Integer> row8 = numbersInRow(7);
        makeNewListOfNumbersInRow(row8,7);

        List<Integer> row9 = numbersInRow(8);
        makeNewListOfNumbersInRow(row9,8);


        //checking columns
        List<Integer> column0 = numbersInColumn(0);
        makeNewListOfNumbersInColumn(column0,0);

        List<Integer> column1 = numbersInColumn(1);
        makeNewListOfNumbersInColumn(column1,1);

        List<Integer> column2 = numbersInColumn(2);
        makeNewListOfNumbersInColumn(column2,2);

        List<Integer> column3 = numbersInColumn(3);
        makeNewListOfNumbersInColumn(column3,3);

        List<Integer> column4 = numbersInColumn(4);
        makeNewListOfNumbersInColumn(column4,4);

        List<Integer> column5 = numbersInColumn(5);
        makeNewListOfNumbersInColumn(column5,5);

        List<Integer> column6 = numbersInColumn(6);
        makeNewListOfNumbersInColumn(column6,6);

        List<Integer> column7 = numbersInColumn(7);
        makeNewListOfNumbersInColumn(column7,7);

        List<Integer> column8 = numbersInColumn(8);
        makeNewListOfNumbersInColumn(column8,8);

        //checking boxes
        List<Integer> box0 = numbersInBox3x3(0,2,0,2);
        List<Integer> box1 = numbersInBox3x3(3,5,0,2);
        List<Integer> box2 = numbersInBox3x3(6,8,0,2);
        List<Integer> box3 = numbersInBox3x3(0,2,3,5);
        List<Integer> box4 = numbersInBox3x3(0,2,6,8);
        List<Integer> box5 = numbersInBox3x3(3,5,3,5);
        List<Integer> box6 = numbersInBox3x3(6,8,3,5);
        List<Integer> box7 = numbersInBox3x3(3,5,6,8);
        List<Integer> box8 = numbersInBox3x3(6,8,6,8);

        System.out.println("\n====== SUDOKU =====");
        System.out.println(sudokuBoard.toString());
    }


    public void makeNewListOfNumbersInColumn(List<Integer> listWithNumbersInBoard, int numberOfColumn){
        for (int i = 0; i < 9; i++){
            if (sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).getValue() == -1){
                System.out.println("------------------W rzędzie nr :" + i +
                        " sprawdzam kolumnę " + numberOfColumn);

                List<Integer> list = new ArrayList<>(sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).
                        getPossibilities().length);
                for (int element: sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).
                        getPossibilities()){
                    list.add(element);
                }

                for (int k = 0; k < sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).getPossibilities().length; k++){
                    int number = sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).getPossibilities()[k];

                    boolean ifContains = listWithNumbersInBoard.contains(number);
                    int index = Arrays.binarySearch(sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).
                            getPossibilities(), number);
                    if (ifContains){
                        list.removeIf(t -> t.equals(number));
                    }
                }

                int[] newPossibilities = new int[list.size()];
                for(int ii = 0; ii < list.size(); ii++) newPossibilities[ii] = list.get(ii);
                sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).setPossibilities(newPossibilities);
                System.out.println("New possibilities w kolumnie: " +
                        Arrays.toString(sudokuBoard.getRowBoard().get(i).getRow().get(numberOfColumn).getPossibilities()));

            }
        }
    }



    public void makeNewListOfNumbersInRow(List<Integer> listWithNumbersInBoard, int numberOfRow){
        for (int j = 0; j < 9; j++){
            if (sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).getValue() == -1) {
                System.out.println("------------------Element w rzedzie nr :" + j);

                List<Integer> list = new ArrayList<>(sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).
                        getPossibilities().length);
                for (int element : sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).
                        getPossibilities()) {
                    list.add(element);
                }

                for (int k = 0; k < sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).getPossibilities().length; k++) {
                    int number = sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).getPossibilities()[k];

                    boolean ifContains = listWithNumbersInBoard.contains(number);
                    int index = Arrays.binarySearch(sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).
                            getPossibilities(), number);
                    if (ifContains) {
                        list.removeIf(t -> t.equals(number));
                    }

                }
                int[] newPossibilities = new int[list.size()];
                for (int ii = 0; ii < list.size(); ii++) newPossibilities[ii] = list.get(ii);
                sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).setPossibilities(newPossibilities);
                System.out.println("New possibilities w rzędzie: " +
                        Arrays.toString(sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).getPossibilities()));
            }
            }
    }


    public List<Integer> numbersInBox3x3(int x1, int x3, int y1, int y3){
        List<Integer> listOfNumbersBox = new ArrayList<>();
        for (int i =x1; i < (x3 + 1); i++){
            for (int j = y1; j < (y3 + 1); j++){
                if (sudokuBoard.getRowBoard().get(i).getRow().get(j).getValue() != -1){
                    listOfNumbersBox.add(sudokuBoard.getRowBoard().get(i).getRow().get(j).getValue());
                }
            }
        }
        System.out.println("lista wpisanych numerow w boxie:" + listOfNumbersBox.toString());
        return listOfNumbersBox;
    }


    public List<Integer> numbersInRow(int numberOfRow){
        List<Integer> listOfNumbersRow = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                if (sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).getValue() != -1) {
                    listOfNumbersRow.add(sudokuBoard.getRowBoard().get(numberOfRow).getRow().get(j).getValue());
                }
            }
        System.out.println("lista wpisanych numerow w wierszu " + (numberOfRow + 1) + " :"
                + listOfNumbersRow.toString());
         return listOfNumbersRow;
    }

    public List<Integer> numbersInColumn(int numberOfColumn){
        List<Integer> listOfNumbersColumn = new ArrayList<>();
        for (int n = 0; n < 9; n++){
            if (sudokuBoard.getRowBoard().get(n).getRow().get(numberOfColumn).getValue() != -1){
                listOfNumbersColumn.add(sudokuBoard.getRowBoard().get(n).getRow().get(numberOfColumn).getValue());
            }
        }
        System.out.println("lista wpisanych numerow w kolumnie nr " + (numberOfColumn + 1) + " :"
                + listOfNumbersColumn.toString());
        return listOfNumbersColumn;
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
            System.out.println("Press ENTER to play again or ANY KEY + ENTER to quit the game");
            String newGameOrNot = s.nextLine();
            if (newGameOrNot.isEmpty()) {
                //userInput.setGameOver("");
                SudokuBoard newSudokuBoard = new SudokuBoard();
                System.out.println("===== NEW GAME ====");
                System.out.println(newSudokuBoard.toString());
                SudokuGame theGame = new SudokuGame();

                boolean gameFinished = false;
                while(!gameFinished) {
                    theGame.game();
                    gameFinished = theGame.resolveSudoku();
                }
                //theGame.solvingTheGame();
                theGame.newGameAfterSudoku();
            } else {
                System.exit(0);
            }
        }
    }
}
