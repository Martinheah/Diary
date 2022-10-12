import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DiaryInput diary = new DiaryInput();
        ObjectMapper mapper = new ObjectMapper();
        List<DiaryInput> posts = new ArrayList<>();

        int userChoice;
        LocalDate date = LocalDate.now();
        diary.setDate(date);



        do {
            Messages.welcome();
            Messages.menu();
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    break;

                case 2:
                    System.out.println("Write your title for today:");
                    String title = scanner.next();
                    diary.setTitle(title);
                    System.out.println("Write your post: ");
                    String inputOfTheDay = scanner.next();
                    diary.setDiaryPost(inputOfTheDay);
                    mapper.writeValue(Paths.get("DiaryInputs.json").toFile(), diary);
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
