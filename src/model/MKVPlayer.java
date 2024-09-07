package model;

public class MKVPlayer  implements  VideoPlayer{

    @Override
    public void playMKV(String filename){
            System.out.println("Playing video: "+ filename);
    }

    @Override
    public void playMP4(String filename){
        System.out.println("Not supported..");
    }
}
