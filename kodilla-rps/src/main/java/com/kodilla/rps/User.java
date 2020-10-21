package com.kodilla.rps;

import java.util.Scanner;

public class User {
    private String userName; // User name or nickname
    private int quantityOfRounds; // How many rounds user want to play

    //This method ask user about name and how many rounds user want to play
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        userName = scanner.nextLine();

        System.out.print("How many rounds do you want to play?: ");
        while (!scanner.hasNextInt()) {
            System.out.println("ERROR! This is not a number, try again");
            scanner.next();
            System.out.print("How many rounds do you want to play?: ");
        }
        quantityOfRounds = scanner.nextInt();
    }

    public String getUserName() {
        return userName;
    }

    public int getQuantityOfRounds() {
        return quantityOfRounds;
    }
}
