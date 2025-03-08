package JO04InterfacesAndAbstraction.L06Ferrari;

public class Ferrari implements Car {

    private static final String MODEL = "488-Spider";

    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        String model = MODEL;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", MODEL, brakes(), gas(), driverName);
    }
}