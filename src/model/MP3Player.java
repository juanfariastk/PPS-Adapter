package model;

public class MP3Player  implements AudioPlayer{

    @Override
    public void play (String audioType,  String filename){
        if(audioType.equals("mp3")){
            System.out.println("Playing audio file: " + filename);
        } else{
            System.out.println("Invalid type ");
        }
    }
}
