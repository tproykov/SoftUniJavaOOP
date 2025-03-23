package JO04InterfacesAndAbstraction.E06MilitaryElite.general.comando;

import java.util.Collection;

import JO04InterfacesAndAbstraction.E06MilitaryElite.mission.Mission;

public interface Commando {

    Collection<Mission> getMissions();

    void addMission(Mission mission);
}
