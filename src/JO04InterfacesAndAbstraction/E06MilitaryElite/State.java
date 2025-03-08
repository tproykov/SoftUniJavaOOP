package JO04InterfacesAndAbstraction.E06MilitaryElite;

enum State {
    IN_PROGRESS("inProgress"),
    FINISHED("finished");

    private final String name;

    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static State fromString(String text) {
        for (State state : State.values()) {
            if (state.name.equals(text)) {
                return state;
            }
        }
        return null;
    }
}
