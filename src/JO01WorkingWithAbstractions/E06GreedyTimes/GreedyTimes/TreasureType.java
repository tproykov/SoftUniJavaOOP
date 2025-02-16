

public enum TreasureType {

    GOLD,
    GEM,
    CASH;

    public static TreasureType identifyType(String item) {
        if (item.equalsIgnoreCase("gold")) {
            return GOLD;
        } else if (item.toLowerCase().endsWith("gem")) {
            return GEM;
        } else if (item.length() == 3) {
            return CASH;
        }
        return null;
    }
}