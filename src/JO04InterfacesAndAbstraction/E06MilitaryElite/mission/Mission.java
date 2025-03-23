package JO04InterfacesAndAbstraction.E06MilitaryElite.mission;

import JO04InterfacesAndAbstraction.E06MilitaryElite.enumm.State;

public interface Mission {

    String getCodeName();

    State getState();

    void completeMission();
}
