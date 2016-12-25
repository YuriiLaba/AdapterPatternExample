/**
 * Created by jlaba on 25.12.2016.
 */
public class VideoAdapter implements VideoPlayer {

    public void play(String videoType) {

        if(videoType.equals(".mkv")){
            MKVPlayer mkv = new MKVPlayer();
            mkv.playMKV();
        }
        else if(videoType.equals(".avi")){
            AVIPlayer avi = new AVIPlayer();
            avi.playAVI();
        }
    }
}
