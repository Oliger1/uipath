package structural.Facade;

public class MoviePlayerClient {
    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", "James Cameron", "itanic është një film epik romantik");
        Lights lights = new Lights();
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Amplifier amplifier = new Amplifier();
        MoviePlayerFacade moviePlayer = new MoviePlayerFacade(movie, lights, dvdPlayer, popcornPopper, projector, screen, amplifier);
        moviePlayer.watchMovie();
        System.out.println("--------------------------------------");
        moviePlayer.endMovie();
    }
}
