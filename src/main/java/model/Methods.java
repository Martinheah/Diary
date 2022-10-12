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

    static Path path = Paths.get("src/main/resources/diaryInput.json");



    static void userInput() throws IOException {
        if (path.toFile().exists()) {
            diaryPosts = List.of(mapper.readValue(path.toFile(), DiaryInput[].class));
            diaryList.addAll(diaryPosts);
        }

        System.out.println("Write your title for today:");
        String title = scanner.nextLine();
        diary.setTitle(title);
        System.out.println("Write your post: ");
        String inputOfTheDay = scanner.nextLine();
        diary.setDiaryPost(inputOfTheDay);
        diary.setDate(dateFormat.format(date));
        diaryList.add(diary);
        mapper.writeValue(path.toFile(), diaryList);
    }
    static void readInput() throws IOException {
        DiaryInput[] getAllTheContentFromDiary;
        getAllTheContentFromDiary = mapper.readValue(path.toFile(),
                DiaryInput[].class);
        for (DiaryInput p : getAllTheContentFromDiary) {
            System.out.println("\nTitle:  " + p.getTitle());
            System.out.println("Story: " + p.getDiaryPost());
            System.out.println("Date: " + p.getDate());
        }
    }

}

