package structural.Proxy;

import java.util.HashMap;

public class YouTubeVideoCacheProxy implements YouTubeVideoLib {
    private YouTubeVideoLib youtubeLib;
    private HashMap<String, Video> youtubeCache = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeVideoCacheProxy() {
        this.youtubeLib = new YouTubeVideoCache();
    }

    @Override
    public HashMap<String, Video> popularVideos() {

        if (youtubeCache.isEmpty())
            youtubeCache = youtubeLib.popularVideos();
        else
            System.out.println("Videot u moren nga cache!");

        return youtubeCache;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeLib.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else
            System.out.println("Video me id: " + videoId + " u mor nga cache!");
        return video;
    }

    public void reset() {
        cacheAll.clear();
        youtubeCache.clear();
    }
}
