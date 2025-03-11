package militaryElite;

enum Corps {
    AIRFORCES("Airforces"),
    MARINES("Marines");

    private final String name;

    Corps(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Corps fromString(String text) {
        for (Corps corps : Corps.values()) {
            if (corps.name.equals(text)) {
                return corps;
            }
        }
        return null;
    }
}
