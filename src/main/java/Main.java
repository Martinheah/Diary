import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiaryInput diary = new DiaryInput();
        int userChoice;
        LocalDate date = LocalDate.now();
        diary.setDate(date);



        do {
            Messages.welcome();
            Messages.menu();
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Read diary");
                    break;

                case 2:
                    System.out.println("Write your title for today:");
                    String title = scanner.next();
                    diary.setTitle(title);
                    System.out.println("Write your post: ");
                    String todaysInput = scanner.next();
                    diary.setDiaryPost(todaysInput);
                    System.out.println("Title: " + diary.getTitle()
                            + "\nInput for today: "
                            + diary.getDiaryPost()
                            + "\n" + diary.getDate());
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
