package Company.VehicleManagement;

import Company.VehicleManagement.CarParts.Engine;

public class HybridCar extends Vehicle{
    public HybridCar(String make, int price, String colour, Engine engineType){
        super(make,price,colour,engineType);
    }
}
