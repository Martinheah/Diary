package model;


import java.util.Scanner;

public class Messages {
    static Scanner scanner = new Scanner(System.in);
    static int userChoice;
    public static void menu() {
        System.out.println("[1]: Read diary" + "\n[2]: Create new post" + "\n[3]: Exit the program");
        userChoice = scanner.nextInt();
    }
    public static void welcome() {
        System.out.println("Welcome to the E-Diary, what to you wish to do?");
    }
}

