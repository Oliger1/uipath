package behavioral.iterator;

public class Taxi implements Vehicle{
    private static int index = 0;
    private final String info;
    public Taxi(){
        info = "Taxi benz me id "+ ++index;
    }

    @Override
    public String getVehicleInfo(){
        return info;
    }
}
