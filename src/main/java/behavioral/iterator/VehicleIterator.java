package behavioral.iterator;

import java.util.Iterator;

public class VehicleIterator implements Iterator<Vehicle> {
    Parking parkingLot;
    private int index = 0;

    public VehicleIterator(Parking parkingLot){
        this.parkingLot = parkingLot;
    }
    @Override
    public boolean hasNext() {
        var vehicles = parkingLot.getVehicles();
        return index < vehicles.length && vehicles[index] != null;
    }

    @Override
    public Vehicle next() {
        var vehicles = parkingLot.getVehicles();
        return vehicles[index++];
    }
}
