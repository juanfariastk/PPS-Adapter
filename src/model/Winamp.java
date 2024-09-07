package model;

public class Winamp {
    private  AudioPlayer player;

    public void play(String mediaType, String filename){
        if(mediaType.equals("mp3")){
            player = new MP3Player();
        } else if (mediaType.equals("mkv") || mediaType.equals("mp4")) {
            player = new VideoToAudioAdapter(mediaType);
        }
        player.play(mediaType, filename);
    }
}
