package JO04InterfacesAndAbstraction.E06MilitaryElite.general.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import JO04InterfacesAndAbstraction.E06MilitaryElite.general.LieutenantGeneral;
import JO04InterfacesAndAbstraction.E06MilitaryElite.privvate.Private;
import JO04InterfacesAndAbstraction.E06MilitaryElite.privvate.PrivateImpl;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private Collection<Private> privates;

    public LieutenantGeneralImpl(int id,
                                 String firstName,
                                 String lastName,
                                 double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public Collection<Private> getPrivates() {
        return Collections.unmodifiableCollection(this.privates);
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);
    }
}
