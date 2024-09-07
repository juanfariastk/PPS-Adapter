package model;

public class VideoToAudioAdapter  implements AudioPlayer{
    private VideoPlayer videoPlayer;

    public VideoToAudioAdapter(String videoFileType){
        if(videoFileType.equals("mkv")){
            videoPlayer = new MKVPlayer();
        } else if ( videoFileType.equals("mp4")) {
            videoPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equals("mkv")){
            videoPlayer.playMKV(filename);
        } else if (audioType.equals("mp4")) {
            videoPlayer.playMP4(filename);
        }else{
            System.out.println("Not supported type or  corrupted file");
        }
    }
}
