package JO01WorkingWithAbstractions.E06GreedyTimes;

public enum TreasureType {

    Gold,
    Gem,
    Cash;

    public static TreasureType identifyType(String item) {
        if (item.equalsIgnoreCase("gold")) {
            return Gold;
        } else if (item.length() >= 4 && item.toLowerCase().endsWith("gem")) {
            return Gem;
        } else if (item.length() == 3) {
            return Cash;
        }
        return null;

    }
}