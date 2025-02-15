package JO01WorkingWithAbstractions.L04HotelReservation;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season,
                                        Discount discount) {

        double basePrice = pricePerDay * numberOfDays * season.getMultiplier();




        return basePrice - (basePrice * discount.getPercentage());




    }


}
