package behavioral.observer;

public class WeatherStationTest {
    public static void main(String[] args){
        ObservableWeatherStation station = new WeatherStation();
        WeatherObserver currentConditionObserver = new CurrentConditionsDisplay(station);
        WeatherObserver forecastDisplay = new ForecastDisplay(station);

        station.registerObserver(currentConditionObserver);
        station.registerObserver(forecastDisplay);
        station.updateData(25, 77);
        station.updateData(28, 78);

    }
}
