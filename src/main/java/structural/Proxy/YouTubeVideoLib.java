package structural.Proxy;

import java.util.HashMap;

public interface YouTubeVideoLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
