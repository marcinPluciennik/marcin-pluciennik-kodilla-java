package com.kodilla.rps;

import java.util.Scanner;

public class Intro {

    private String userLevelChoice;

    public void intro() {
        System.out.println("**************************************************");
        System.out.println("WELCOME IN RPS GAME");
        System.out.println("--------------------------------------------------");
    }

    //This method display game rules
    public void showRules() {
        System.out.println("--------------------------------------------------");
        System.out.println("GAME RULES:");
        System.out.println("--------------------------------------------------");
        System.out.println("* Rock beats scissors\n* Scissors beats paper\n* Paper beats rock");
        System.out.println("--------------------------------------------------");
        System.out.println("Let's play:");
        System.out.println("1 - Rock\n2 - Paper\n3 - Scissors\nx - Quit game\nn - Play again");
        System.out.println("--------------------------------------------------");
    }

    //This method ask user about difficulty level
    public void chooseLevel() {
        System.out.println("BEGINNER - press 'b' - 50/50 to win :-)");
        System.out.println("EXPERT - press 'e' - hard to win :-(");
        System.out.println("--------------------------------------------------");
        Scanner s = new Scanner(System.in);
        userLevelChoice = s.nextLine().toUpperCase();
        if (userLevelChoice.equals("B")) {
            System.out.println("**************************************************");
            System.out.println("YOU PLAY AS BEGINNER!");
        } else if (userLevelChoice.equals("E")) {
            System.out.println("**************************************************");
            System.out.println("YOU PLAY AS EXPERT! ... RESPECT!");
        } else {
            System.out.println("Wrong key, try again!");
            chooseLevel();
        }
    }

    public String getUserLevelChoice() {
        return userLevelChoice;
    }
}
