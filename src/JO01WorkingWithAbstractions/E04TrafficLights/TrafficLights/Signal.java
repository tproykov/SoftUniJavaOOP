

public enum Signal {

    RED,
    GREEN,
    YELLOW;

    public static void updateSignal(Signal[] signals) {
        for (int i = 0; i < signals.length; i++) {
            signals[i] = switch (signals[i]) {
                case RED -> Signal.GREEN;
                case GREEN -> Signal.YELLOW;
                case YELLOW -> Signal.RED;
            };
        }
    }

    public static void printSignals(Signal[] signals) {
        for (Signal signal : signals) {
            System.out.print(signal + " ");
        }
        System.out.println();
    }
}