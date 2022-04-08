package structural.Facade;

public class DvdPlayer {
    public void on() {
        System.out.println("Dvd u ndez");
    }

    public void play(Movie movie) {
        System.out.println("Filmi qe do te luhet: " + movie.getTitle());
    }

    public void stop() {
        System.out.println("DVD u ndalua!");
    }

    public void eject() {
        System.out.println("Disku doli nga DVD player!");
    }

    public void off() {
        System.out.println("DVD player u fik!");
    }
}
