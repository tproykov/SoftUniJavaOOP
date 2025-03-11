package militaryElite;

import java.util.Collection;

interface Commando extends SpecialisedSoldier {

    void addMission(Mission mission);
    Collection<Mission> getMissions();
}