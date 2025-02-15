package JO01WorkingWithAbstractions.E04TrafficLights;

public enum Signal {

    RED,
    GREEN,
    YELLOW;

    public static void updateSignal(Signal[] signals) {
        for (Signal signal : signals) {
            switch (signal) {
                case RED -> signal = Signal.GREEN;
                case GREEN -> signal = Signal.YELLOW;
                case YELLOW -> signal = Signal.RED;
            }
        }
    }

    public static void printSignals(Signal[] signals) {
        for (Signal signal : signals) {
            System.out.print(signal + " ");
        }
        System.out.println();
    }
}