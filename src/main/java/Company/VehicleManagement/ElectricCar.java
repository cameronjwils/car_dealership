package Company.VehicleManagement;

import Company.VehicleManagement.CarParts.Engine;

public class ElectricCar extends Vehicle{
    public ElectricCar(String make, int price, String colour, Engine engineType){
        super(make,price,colour,engineType);
    }
}
