/**
 * Class for Game objects
 */
public class Game {

    private String title;
    private String genre;
    private int year;
    private String system;
    private boolean completed;

    public Game (String title, String genre, int year, String system, boolean completed){

        this.title = title;
        this.genre = genre;
        this.year = year;
        this.system = system;
        this.completed = completed;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String toString(){
        return String.format(
                "title: " + title + "\n"
                + "genre: " + genre +  "\n"
                + "year: " + year + "\n"
                + "system: " + system + "\n"
                + "completed: " + completed );
    }

}
