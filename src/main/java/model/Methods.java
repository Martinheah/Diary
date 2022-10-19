package model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Methods {
    static Scanner scanner = new Scanner(System.in);
    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    static Date date = new Date();

    static DiaryInput diary = new DiaryInput();
    static ObjectMapper mapper = new ObjectMapper();
    static List<DiaryInput> diaryPosts = new ArrayList<>();
    static List<DiaryInput> diaryList = new ArrayList<>();

    //skapar genväg till jsonfilen via path
    static Path path = Paths.get("src/main/resources/diaryInput.json");



    static void userInput() throws IOException {
        // Kollar om filen existerar, om inte går den vidare i programmet
        if (path.toFile().exists()) {
            diaryPosts = List.of(mapper.readValue(path.toFile(), DiaryInput[].class));
            diaryList.addAll(diaryPosts);
        }
        //Ber användare skriva sin titel
        System.out.println("Write your title for today:");
        String title = scanner.nextLine();

        //Sparar ner titeln
        diary.setTitle(title);

        //Ber användare skriva ner sitt inlägg
        System.out.println("Write your post: ");
        String inputOfTheDay = scanner.nextLine();

        //Sparar ner inlägget
        diary.setDiaryPost(inputOfTheDay);

        //Sparar datumet
        diary.setDate(dateFormat.format(date));

        //Lägger till diary till listan
        diaryList.add(diary);

        //Skapar en json fil, och lägger till all input från listan till filen
        mapper.writeValue(path.toFile(), diaryList);
    }
    //Skapar en metod för att skriva ut input
    static void readInput() throws IOException {
        DiaryInput[] getAllTheContentFromDiary;
        getAllTheContentFromDiary = mapper.readValue(path.toFile(),
                DiaryInput[].class);

        //Loopar genom listan med json filens innehåll
        for (DiaryInput p : getAllTheContentFromDiary) {
            System.out.println("\nTitle:  " + p.getTitle());
            System.out.println("Story: " + p.getDiaryPost());
            System.out.println("Date: " + p.getDate());
        }
    }

}

