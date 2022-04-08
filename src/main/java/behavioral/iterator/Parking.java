package behavioral.iterator;

import java.util.Iterator;

public class Parking implements Iterable<Vehicle>{
    private static final int CAPACITY = 5;
    private int index = 0;

    private Vehicle[] vehicles = new Taxi[CAPACITY];

    public void add(final Vehicle taxi)
    {
        if(index == vehicles.length){
            Vehicle[] biggerSpace = new Taxi[2*vehicles.length];
            for(int i =0; i< vehicles.length; i++){
                biggerSpace[i]= vehicles[i];
            }
            vehicles = biggerSpace;
        }

        vehicles[index++] = taxi;

    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    @Override
    public Iterator<Vehicle> iterator() {
        return new VehicleIterator(this);
    }
}
