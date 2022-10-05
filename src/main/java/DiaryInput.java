import java.time.LocalDate;

public class DiaryInput {
    private String title;
    private String diaryPost;
    private LocalDate date;

    public DiaryInput(String title, String diaryPost, LocalDate date) {
        this.title = title;
        this.diaryPost = diaryPost;
        this.date = date;
    }

    public DiaryInput() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiaryPost() {
        return diaryPost;
    }

    public void setDiaryPost(String diaryPost) {
        this.diaryPost = diaryPost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
