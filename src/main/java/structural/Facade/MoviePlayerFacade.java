package structural.Facade;

public class MoviePlayerFacade {
    Movie movie;
    Lights lights;
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    Amplifier amplifier;

    public MoviePlayerFacade(Movie movie,
                             Lights lights,
                             DvdPlayer dvdPlayer,
                             PopcornPopper popcornPopper,
                             Projector projector,
                             Screen screen, Amplifier amplifier) {
        this.movie = movie;
        this.lights = lights;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.amplifier = amplifier;
    }

    public void watchMovie() {
        popcornPopper.on();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        popcornPopper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

}
