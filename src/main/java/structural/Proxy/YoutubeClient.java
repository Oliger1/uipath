package structural.Proxy;

public class YoutubeClient {
    public static void main(String[] args) {
        YouTubeVideoRender render = new YouTubeVideoRender(new YouTubeVideoCache());
        YouTubeVideoRender renderWithProxy = new YouTubeVideoRender(new YouTubeVideoCacheProxy());
        var timeWithoutProxy = downloadvideos(render);
        var timeWithProxy = downloadvideos(renderWithProxy);
        System.out.println("Koha e shfaqjes se te dhenave pa proxy: " + timeWithoutProxy + " ms");
        System.out.println("Koha e shfaqjes se te dhenave me proxy: " + timeWithProxy + " ms");
        System.out.println("Diferenca eshte: " + (timeWithoutProxy - timeWithProxy) + " ms");
    }

    private static long downloadvideos(YouTubeVideoRender render) {
        long startTime = System.currentTimeMillis();
        render.renderPopularVideos();
        render.renderVideoPage("1111");
        render.renderPopularVideos();
        render.renderVideoPage("1111");
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
