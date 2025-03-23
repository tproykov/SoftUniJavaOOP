package JO04InterfacesAndAbstraction.E06MilitaryElite.privvate;

import JO04InterfacesAndAbstraction.E06MilitaryElite.soldier.impl.SoldierImpl;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
