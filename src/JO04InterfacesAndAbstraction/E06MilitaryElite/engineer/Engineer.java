package JO04InterfacesAndAbstraction.E06MilitaryElite.engineer;

import java.util.Collection;

import JO04InterfacesAndAbstraction.E06MilitaryElite.repair.Repair;

public interface Engineer {

    Collection<Repair> getRepairs();

    void addRepair(Repair repair);
}
