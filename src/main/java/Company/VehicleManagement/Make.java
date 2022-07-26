package Company.VehicleManagement;

public abstract class Make {
    private String make;

    public Make(String make) {
        this.make = make;
    }
    public String getMake() {
        return this.make;
    }
}
