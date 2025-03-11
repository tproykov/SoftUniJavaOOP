package militaryElite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        if (mission.getState() != null) {
            missions.add(mission);
        }
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableCollection(missions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f Corps: %s",
                getFirstName(), getLastName(), getId(), getSalary(), getCorps()));

        if (!missions.isEmpty()) {
            sb.append(System.lineSeparator()).append("Missions:");
            for (Mission mission : missions) {
                sb.append(System.lineSeparator()).append("  ").append(mission.toString());
            }
        }

        return sb.toString();
    }
}
