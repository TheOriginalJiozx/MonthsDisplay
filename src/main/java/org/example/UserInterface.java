package org.example;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        int choice;
        do {
            displayMenu();
            choice = getUserChoice();
            handleChoice(choice);
        } while (choice != 2);

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("Menu:");
        System.out.println("Enter '1' to display a month");
        System.out.println("Enter '2' to exit");
    }

    private int getUserChoice() {
        return scanner.nextInt();
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                int userChoice;
                do {
                    System.out.println("Enter a number from '1' to '12' to display the month of your choice:");
                    userChoice = scanner.nextInt();
                    if (userChoice >= 1 && userChoice <= 12) {
                        for (Months month : Months.values()) {
                            if (month.getMonthValue() == userChoice) {
                                System.out.println("The month is: " + month.getDisplayMonth() + " and it is the number " + userChoice + " month. This month's season is: " + month.getDisplaySeason());
                                return;
                            }
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number from '1' to '12'.");
                    }
                } while (true);
            case 2:
                System.out.println("Exiting ...");
                break;
            default:
                System.out.println("Invalid choice. Please enter '1' or '2'.");
                break;
        }
    }
}