package structural.Proxy;

import java.util.HashMap;

public class YouTubeVideoRender {
    private YouTubeVideoLib api;

    public YouTubeVideoRender(YouTubeVideoLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> popularVideos = api.popularVideos();
        System.out.println("Videot me popullore ne youtube! ");
        for (Video video : popularVideos.values()) {
            System.out.println("Id: " + video.getId() + " :  Title: " + video.getTitle());
        }
    }
}
