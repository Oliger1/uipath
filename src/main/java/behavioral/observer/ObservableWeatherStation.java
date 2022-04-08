package behavioral.observer;

public interface ObservableWeatherStation {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObserver();
    void updateData(float temperature, float humidity);
}

