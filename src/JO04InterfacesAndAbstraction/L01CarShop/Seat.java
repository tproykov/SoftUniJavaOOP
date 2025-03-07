package JO04InterfacesAndAbstraction.L01CarShop;

public class Seat implements Car{

    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    public Seat(String model, String color, int price, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = price;
        this.countryProduced = country;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String getModel() {
        return "";
    }

    @Override
    public String getColor() {
        return "";
    }

    @Override
    public Integer getHorsePower() {
        return 0;
    }

    @Override
    public String countryProduced() {
        return "";
    }
}