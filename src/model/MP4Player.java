package model;

public class MP4Player  implements  VideoPlayer{

    @Override
    public void playMKV(String filename){
        System.out.println("Not supported");
    }

    @Override
    public void playMP4(String filename){
            System.out.println("Playing video: " + filename);
    }
}
