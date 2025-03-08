package JO04InterfacesAndAbstraction.E06MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableCollection(repairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f Corps: %s",
                getFirstName(), getLastName(), getId(), getSalary(), getCorps()));

        if (!repairs.isEmpty()) {
            sb.append(System.lineSeparator()).append("Repairs:");
            for (Repair repair : repairs) {
                sb.append(System.lineSeparator()).append("  ").append(repair.toString());
            }
        }

        return sb.toString();
    }
}
