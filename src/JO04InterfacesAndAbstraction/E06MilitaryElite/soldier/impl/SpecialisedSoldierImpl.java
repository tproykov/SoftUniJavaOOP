package JO04InterfacesAndAbstraction.E06MilitaryElite.soldier.impl;

import JO04InterfacesAndAbstraction.E06MilitaryElite.enumm.Corp;
import JO04InterfacesAndAbstraction.E06MilitaryElite.privvate.PrivateImpl;
import JO04InterfacesAndAbstraction.E06MilitaryElite.soldier.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private Corp corp;

    public SpecialisedSoldierImpl(int id,
                                  String firstName,
                                  String lastName,
                                  double salary,
                                  String corp) {
        super(id, firstName, lastName, salary);
        this.setCorp(corp);
    }

    @Override
    public Corp getCorps() {
        return this.corp;
    }

    public void setCorp(String corp) {
        this.corp = Corp.valueOf(corp);
    }
}
