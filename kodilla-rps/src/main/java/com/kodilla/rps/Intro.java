package com.kodilla.rps;

public class Intro {

    public void intro(){
        System.out.println("**************************************************");
        System.out.println("WELCOME IN RPS GAME");
        System.out.println("--------------------------------------------------");
    }

    //This method display game rules
    public void showRules(){
        System.out.println("--------------------------------------------------");
        System.out.println("GAME RULES:");
        System.out.println("--------------------------------------------------");
        System.out.println("* Rock beats scissors\n* Scissors beats paper\n* Paper beats rock");
        System.out.println("--------------------------------------------------");
        System.out.println("Let's play, what is your choice?:");
        System.out.println("1 - Rock\n2 - Paper\n3 - Scissors\nx - Quit game\nn - Play again");
        System.out.println("--------------------------------------------------");
    }
}
