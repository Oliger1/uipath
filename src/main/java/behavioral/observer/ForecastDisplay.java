package behavioral.observer;

public class ForecastDisplay extends WeatherObserver{
    public float temperature;
    public float humidity;
    public float prevTemperature;
    public float prevHumidity;

    private ObservableWeatherStation station;

    public ForecastDisplay(ObservableWeatherStation station){
        this.station = station;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.prevTemperature = this.temperature;
        this.prevHumidity = this.humidity;
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Temperatura e meparshme: : "+ prevTemperature + " C / Temperatura tani: : "+ temperature + " C");
        System.out.println("Lageshtia e meparshme: "+ prevHumidity +" / Lageshtia tani: "+ humidity);
    }
}
