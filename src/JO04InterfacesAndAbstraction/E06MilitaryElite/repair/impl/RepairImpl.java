package JO04InterfacesAndAbstraction.E06MilitaryElite.repair.impl;

import JO04InterfacesAndAbstraction.E06MilitaryElite.repair.Repair;

public class RepairImpl implements Repair {

    private String partName;
    private int hoursWorked;

    public RepairImpl(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return partName;
    }

    @Override
    public int getHoursWorked() {
        return hoursWorked;
    }
}
