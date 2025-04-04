package JO01WorkingWithAbstractions.L04HotelReservation;

public enum Discount {

    VIP(0.20),
    SECONDVISIT(0.10),
    NONE(0);

    private double percentage;

    Discount(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }
}