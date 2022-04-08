package behavioral.observer;

public class CurrentConditionsDisplay extends WeatherObserver{
    public float temperature;
    public float humidity;
    private ObservableWeatherStation station;

    public CurrentConditionsDisplay(ObservableWeatherStation station){
        this.station = station;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Temperatura aktuale: "+ temperature + " C / Lageshtia aktuale: "+ humidity);
    }
}
