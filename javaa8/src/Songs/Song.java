package Songs;

public class Song {
    protected String title;
    protected String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return artist + "/" + title;
    }
}
