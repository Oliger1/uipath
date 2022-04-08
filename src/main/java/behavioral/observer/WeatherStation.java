package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableWeatherStation{
    private float temperature;
    private float humidity;
    private List<WeatherObserver> observerList;
    public WeatherStation (){
        this.observerList = new ArrayList<>();
    }
    public void registerObserver(WeatherObserver observer){
        this.observerList.add(observer);
    }
    public void removeObserver(WeatherObserver observer){
        this.observerList.remove(observer);
    }
    public void updateData(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        dataHasChanged();
    }
    private void  dataHasChanged(){
        notifyObserver();
    }
    public void notifyObserver(){
        for(WeatherObserver observer: observerList){
            observer.update(temperature, humidity);
        }
    }
}