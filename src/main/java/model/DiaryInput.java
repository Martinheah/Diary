package model;
public class DiaryInput {
    private String title;
    private String diaryPost;
    private String date;

    public DiaryInput(String title, String diaryPost, String date) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
