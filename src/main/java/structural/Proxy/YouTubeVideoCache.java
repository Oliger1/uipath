package structural.Proxy;

import java.util.HashMap;

public class YouTubeVideoCache implements YouTubeVideoLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com");
        return getSomeVideo(videoId);
    }

    private void connectToServer(String channel) {
        System.out.println("Duke u lidhur me serverin: " + channel);
        experienceNetworkDelay();
        System.out.println("U lidh!");
    }

    private void experienceNetworkDelay() {
        int randomDelay = getRandomNumber(5, 10);
        try {
            Thread.sleep(randomDelay * 100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Duke u shkarkuar videot ....");
        experienceNetworkDelay();
        HashMap<String, Video> videoChache = new HashMap<String, Video>();
        videoChache.put("1111", new Video("111", "Dog and cat.mp4", ""));
        videoChache.put("2222", new Video("2222", "Dance song.mp4", ""));
        videoChache.put("3333", new Video("3333", "Kids singing.mp4", ""));
        videoChache.put("4444", new Video("4444", "funny video.mp4", ""));
        videoChache.put("5555", new Video("5555", "t-rex in action.mp4", ""));
        return videoChache;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Shkarkimi i videos ...");
        experienceNetworkDelay();
        Video video = new Video(videoId, "titulli i videos...", "te dhenat e videos");
        System.out.println("Video u shkarkua!");
        return video;
    }
}
