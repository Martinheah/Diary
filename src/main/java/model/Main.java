package model;
import java.io.IOException;

import static model.Messages.userChoice;


public class Main {
    public static void main(String[] args) throws IOException {
        do {
            Messages.welcome();
            Messages.menu();
            switch (userChoice) {
                case 1:
                    Methods.readInput();
                    break;

                case 2:
                    Methods.userInput();
                    break;

                case 3:
                    System.out.println("You chose to exist the program.");
                    break;

                default:
                    System.out.println("You have not chosen the right option listed to you!\nTry again..");
            }
        }
        while(userChoice != 3);
        System.out.println("Good bye, see you again tomorrow:)");
    }
}
