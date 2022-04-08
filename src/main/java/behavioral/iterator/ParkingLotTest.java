package behavioral.iterator;

import java.util.Iterator;

public class ParkingLotTest {
    public static void main(String[] args){
        Parking parking = new Parking();

        for(int i=0; i< 12; i++)
            parking.add(new Taxi());

        Iterator<Vehicle> vehicleIterator = parking.iterator();

        while(vehicleIterator.hasNext()){
            Vehicle vehicle = vehicleIterator.next();
            System.out.println(vehicle.getVehicleInfo());
        }
    }
}
