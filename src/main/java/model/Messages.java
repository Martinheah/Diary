package model;


import java.util.Scanner;

public class Messages {
    static Scanner scanner = new Scanner(System.in);
    //deklarerar userChoice
    static int userChoice;
    //Skapar en metod för att visa MainMenu samt ger användare alternativet att välja vad den vill göra
    public static void mainMenu() {
        System.out.println("[1]: Read diary" + "\n[2]: Create new post" + "\n[3]: Exit the program");
        userChoice = scanner.nextInt();
    }
    //Skapar en metod som välkomnar användaren hit
    public static void welcome() {
        System.out.println("Welcome to the E-Diary, what to you wish to do?");
    }
}

