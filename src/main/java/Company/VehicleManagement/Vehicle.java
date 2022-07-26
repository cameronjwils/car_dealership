package Company.VehicleManagement;

import Company.VehicleManagement.CarParts.Engine;

public abstract class Vehicle extends Make {
    Engine engineType;
    private int price;
    private String colour;
    public Vehicle(String make,int price,String colour,int tyres,Engine engineType){
        super(make);
        this.price = price;
        this.colour = colour;
        this.engineType = engineType;
    }
}
