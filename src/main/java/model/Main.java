package model;
import java.io.IOException;
import static model.Messages.userChoice;
public class Main {
    public static void main(String[] args) throws IOException {
        do {
            //kallar på welcome metoden
            Messages.welcome();

            //kallar på MainMenu metoden
            Messages.mainMenu();

            //skapar en switch metod
            switch (userChoice) {
                case 1:
                    //om användaren väljer 1 i mainMenu, så kallar den på readInput metoden som i tur skriver ut
                    //all tidigare inputs som finns i diaryn
                    Methods.readInput();
                    break;

                case 2:
                    //om användaren väljer 2 i mainMenu, så kallar den på userInput metoden och kmr få skapa nytt inlägg
                    Methods.userInput();
                    break;

                case 3:
                    //om användaren väljer 3, så kommer den mötas av detta stycket och avslutas
                    System.out.println("You chose to exist the program.");
                    break;

                default:
                    //väljer användaren något annat än mellan 1-3, så kommer den att få meddelandet att den har valt fel
                    //samt återgå till mainMenu för att försöka igen.
                    System.out.println("You have not chosen the right option listed to you!\nTry again..");
            }
        }
        //så länge användaren inte matar in 3, så kommer detta loop att forsätta.
        while(userChoice != 3);

        //detta meddelande skrivs ut i slutet av programmet.
        System.out.println("Good bye, see you again tomorrow:)");
    }
}
