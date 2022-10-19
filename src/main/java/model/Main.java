package model;

import java.io.IOException;

import static model.Messages.userChoice;


public class Main {
    /**
     * A program of an E-diary for creating entries.
     * @throws IOException jackson exemption
     */
    public static void main(String[] args) throws IOException {
        do {
            Messages.welcome();

            Messages.mainMenu();

            switch (userChoice) {
                case 1 -> Methods.readInput();
                case 2 -> Methods.userInput();
                case 3 -> System.out.println("You chose to exist the program.");
                default -> System.out.println("You have not chosen the right option listed to you!\nTry again..");
            }
        }
        while (userChoice != 3);

        System.out.println("Good bye, see you again tomorrow:)");
    }
}
