package JO04InterfacesAndAbstraction.L01CarShop;

public class Seat implements Car {

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer price, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = price;
        this.countryProduced = country;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return "This is " + this.model + " produced in "
                + this.countryProduced + " and have " + Car.TIRES + " tires";
    }
}