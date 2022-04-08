package structural.Facade;

public class Amplifier {
    private DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Amplifer u ndez!");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Dvd u vendos.");
    }

    public void setSound() {

        System.out.println("Efektet zanore u shtuan!");
    }

    public void setVolume(int volume) {
        System.out.println("Vlumi u vendos ne: " + volume);
    }

    public void off() {
        System.out.println("Amplifikuesi u fik.");
    }
}
