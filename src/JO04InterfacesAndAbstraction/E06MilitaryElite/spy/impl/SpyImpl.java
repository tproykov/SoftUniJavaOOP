package JO04InterfacesAndAbstraction.E06MilitaryElite.spy.impl;

import JO04InterfacesAndAbstraction.E06MilitaryElite.soldier.impl.SoldierImpl;
import JO04InterfacesAndAbstraction.E06MilitaryElite.spy.Spy;

public class SpyImpl extends SoldierImpl implements Spy {

    private int codeNumber;

    public SpyImpl(int id,
                   String firstName,
                   String lastName,
                   int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }
}
