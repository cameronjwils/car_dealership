package Company.VehicleManagement.CarParts;

public enum Gearbox {
    FIVE(5),
    SIX(6);

    private final int noOfGears;

    Gearbox(int noOfGears){
        this.noOfGears = noOfGears;
    }
    public int getEngineType() {
        return this.noOfGears;
    }
}