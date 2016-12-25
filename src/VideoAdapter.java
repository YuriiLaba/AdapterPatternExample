/**
 * Created by jlaba on 25.12.2016.
 */
public class VideoAdapter implements VideoPlayer {
    /**
     * Class that choose which video player(depend on video format) should be played
     */

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
