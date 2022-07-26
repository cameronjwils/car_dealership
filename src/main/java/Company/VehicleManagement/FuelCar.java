package Company.VehicleManagement;

import Company.VehicleManagement.CarParts.Engine;
import Company.VehicleManagement.CarParts.Gearbox;

public class FuelCar extends Vehicle{
    Gearbox noOfGears;

    public FuelCar(String make, int price, String colour, Engine engineType,Gearbox noOfGears){
        super(make,price,colour,engineType,noOfGears);
    }
}