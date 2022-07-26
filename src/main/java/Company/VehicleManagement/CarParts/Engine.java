package Company.VehicleManagement.CarParts;

public enum Engine {
    FUEL("Fuel"),
    ELECTRIC("Electric"),
    HYBRID("Hybrid");

    private final String engineType;

    Engine(String engineType){
        this.engineType = engineType;
    }
    public String getEngineType() {
        return this.engineType;
    }
}
