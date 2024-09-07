import model.Winamp;

public class Main {
    public static void main(String[] args) {
        Winamp winamp = new Winamp();
        winamp.play("mp3", "song.mp3");
        winamp.play("mp4", "video.mp4");
        winamp.play("mkv", "movie.mkv");
        }

}