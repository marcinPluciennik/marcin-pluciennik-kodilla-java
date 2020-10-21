package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private String computersChoice; //Computer random choice: rock, paper or scissors
    private String usersChoice; //User choice: rock, paper or scissors
    private String userInput; // User input from keyboard
    private int roundsCounter = 1; // Rounds counter
    private int userWinnerRounds = 0; //How many times user won
    private int computerWinnerRounds = 0; //How many times computer won
    private int tieCounter = 0;//How many times was a tie
    private List<String> listOfPossibilities; //From this list computer make random choice

    //This method create new game
    public void startGame() {

        Intro intro = new Intro();
        intro.intro();

        User user = new User();
        user.startGame();

        intro.showRules();
        intro.chooseLevel();

        Game game = new Game();

        if (intro.getUserLevelChoice().equals("B")) {
            for (int i = 0; i < user.getQuantityOfRounds(); i++) {
                game.usersChoice();
                game.computerChoice();
                game.whoIsTheWinnerOfRound();

            }
        } else if (intro.getUserLevelChoice().equals("E")) {
            for (int j = 0; j < user.getQuantityOfRounds(); j++) {
                game.usersChoice();
                game.computerChoiceExpert();
                game.whoIsTheWinnerOfRound();

            }
        }
        game.winner(user.getUserName());
        game.playAgain();
    }

    //This method create user's choice of play, quit game, restart game
    public void usersChoice() {
        System.out.println("******************** ROUND " + roundsCounter + " *********************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("So... 1 - ROCK, 2 - PAPER, 3 - SCISSORS, x or n?");
        userInput = scanner.nextLine().toUpperCase();
        System.out.println("--------------------------------------------------");

        boolean end = false;
        while (!end) {
            if (userInput.equals("1")) {
                System.out.println("Your choice: ROCK");
                usersChoice = "ROCK";
                end = true;
            } else if (userInput.equals("2")) {
                System.out.println("Your choice: PAPER");
                usersChoice = "PAPER";
                end = true;
            } else if (userInput.equals("3")) {
                System.out.println("Your choice: SCISSORS");
                usersChoice = "SCISSORS";
                end = true;
            } else if (userInput.equals("X")) {
                System.out.println("Quit the game? (y/n): ");
                String quitOrPlay = scanner.nextLine().toUpperCase();
                if (quitOrPlay.equals("Y")) {
                    System.out.println("**************************************************");
                    System.out.println("******************* GAME OVER ********************");
                    System.out.println("**************************************************");
                    System.exit(0);
                } else if (quitOrPlay.equals("N")) {
                    usersChoice();
                } else {
                    System.out.println("Wrong key, try again!");
                }
            } else if (userInput.equals("N")) {
                System.out.println("Are you sure to restart game? (y/n)");
                String askNewGame = scanner.nextLine().toUpperCase();
                if (askNewGame.equals("Y")) {
                    System.out.println("I'm restarting game");
                    System.out.println("--------------------------------------------------");
                    startGame();
                } else if (askNewGame.equals("N")) {
                    usersChoice();
                } else {
                    System.out.println("Wrong key, try again!");
                }
            } else {
                System.out.println("Error! Wrong key! Try again!");
                usersChoice();
            }
        }

    }

    //This method create computer random choice from list: rock, paper or scissors in (Beginner level)
    public String computerChoice() {
        List<String> listOfPossibilitiesBeginner = new ArrayList<>();
        listOfPossibilitiesBeginner.add("ROCK");
        listOfPossibilitiesBeginner.add("PAPER");
        listOfPossibilitiesBeginner.add("SCISSORS");
        listOfPossibilities = listOfPossibilitiesBeginner;

        Random random = new Random();
        int numberOfIndexInListOfPossibilities = random.nextInt(listOfPossibilities.size());
        computersChoice = listOfPossibilities.get(numberOfIndexInListOfPossibilities);
        System.out.println("Computer's choice: " + computersChoice);
        System.out.println("--------------------------------------------------");
        roundsCounter++;
        return computersChoice;
    }

    //This method create computer random choice from list: rock, paper or scissors (Expert(not fair) level)
    public String computerChoiceExpert() {
        List<String> listOfPossibilitiesBeginner = new ArrayList<>();
        listOfPossibilitiesBeginner.add("ROCK");
        listOfPossibilitiesBeginner.add("PAPER");
        listOfPossibilitiesBeginner.add("SCISSORS");
        listOfPossibilities = listOfPossibilitiesBeginner;

        if (userInput.equals("1")) {
            listOfPossibilities.add("ROCK");
            listOfPossibilities.add("PAPER");
            listOfPossibilities.add("PAPER");
        } else if (userInput.equals("2")) {
            listOfPossibilities.add("PAPER");
            listOfPossibilities.add("SCISSORS");
            listOfPossibilities.add("SCISSORS");
        } else if (userInput.equals("3")) {
            listOfPossibilities.add("SCISSORS");
            listOfPossibilities.add("ROCK");
            listOfPossibilities.add("ROCK");
        }

        Random random = new Random();
        int numberOfIndexInListOfPossibilities = random.nextInt(listOfPossibilities.size());
        computersChoice = listOfPossibilities.get(numberOfIndexInListOfPossibilities);
        System.out.println("Computer's choice: " + computersChoice);
        System.out.println("--------------------------------------------------");
        roundsCounter++;
        return computersChoice;
    }

    //This method checks who is the winner: user or computer
    public void whoIsTheWinnerOfRound() {
        if (usersChoice.equals("ROCK") && computersChoice.equals("PAPER")) {
            computerWinnerRounds++;
            System.out.println("Computer wins!");
        } else if (usersChoice.equals("ROCK") && computersChoice.equals("SCISSORS")) {
            userWinnerRounds++;
            System.out.println("You win!");
        } else if (usersChoice.equals("PAPER") && computersChoice.equals("SCISSORS")) {
            computerWinnerRounds++;
            System.out.println("Computer wins!");
        } else if (usersChoice.equals("PAPER") && computersChoice.equals("ROCK")) {
            userWinnerRounds++;
            System.out.println("You win!");
        } else if (usersChoice.equals("SCISSORS") && computersChoice.equals("PAPER")) {
            userWinnerRounds++;
            System.out.println("You win!");
        } else if (usersChoice.equals("SCISSORS") && computersChoice.equals("ROCK")) {
            computerWinnerRounds++;
            System.out.println("Computer wins!");
        } else {
            tieCounter++;
            System.out.println("Tie!");
        }
        System.out.println("--------------------------------------------------");

    }

    //This method display statistics and the winner
    public void winner(String userName) {
        System.out.println("**************************************************");

        if (userWinnerRounds > computerWinnerRounds) {
            System.out.println(userName.toUpperCase() + " won " + userWinnerRounds + " times");
            System.out.println("Computer won " + computerWinnerRounds + " times");
            System.out.println("Tie was " + tieCounter + " times");
            System.out.println("**************************************************");
            System.out.println(userName.toUpperCase() + " IS THE WINNER!");
        } else if (userWinnerRounds < computerWinnerRounds) {
            System.out.println(userName.toUpperCase() + " won " + userWinnerRounds + " times");
            System.out.println("Computer won " + computerWinnerRounds + " times");
            System.out.println("Tie was " + tieCounter + " times");
            System.out.println("**************************************************");
            System.out.println("COMPUTER IS THE WINNER!");
        } else {
            System.out.println(userName.toUpperCase() + " won " + userWinnerRounds + " times");
            System.out.println("Computer won " + computerWinnerRounds + " times");
            System.out.println("Tie was " + tieCounter + " times");
            System.out.println("**************************************************");
            System.out.println("TIE !");
        }
    }

    //This method ask user to play again or quite game
    public void playAgain() {
        System.out.println("**************************************************");
        System.out.println("Start new game? (y/n)");

        boolean playAgain = false;
        while (!playAgain) {
            Scanner scan = new Scanner(System.in);
            String anotherGame = scan.nextLine().toUpperCase();
            if (anotherGame.equals("Y")) {
                playAgain = true;
                startGame();
            } else if (anotherGame.equals("N")) {
                System.out.println("**************************************************");
                System.out.println("******************* GAME OVER ********************");
                System.out.println("**************************************************");

                System.exit(0);
            } else {
                System.out.println("Start new game? (y/n)");
            }
        }
    }
}
