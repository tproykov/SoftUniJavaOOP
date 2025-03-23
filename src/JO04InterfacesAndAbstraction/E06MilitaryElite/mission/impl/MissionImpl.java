package JO04InterfacesAndAbstraction.E06MilitaryElite.mission.impl;

import JO04InterfacesAndAbstraction.E06MilitaryElite.enumm.State;
import JO04InterfacesAndAbstraction.E06MilitaryElite.mission.Mission;

public class MissionImpl implements Mission {

    private String codeName;
    private State state;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public void completeMission() {
        this.state = State.finished;
    }

    public void setState(String state) {
        this.state = State.valueOf(state);
    }
}
