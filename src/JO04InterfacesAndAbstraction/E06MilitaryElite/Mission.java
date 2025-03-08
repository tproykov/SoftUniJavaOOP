package JO04InterfacesAndAbstraction.E06MilitaryElite;

class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.state = State.fromString(state);
    }

    public String getCodeName() {
        return codeName;
    }

    public String getState() {
        return state.getName();
    }

    public void completeMission() {
        this.state = State.FINISHED;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", codeName, state.getName());
    }
}
