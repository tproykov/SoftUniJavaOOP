package JO04InterfacesAndAbstraction.E06MilitaryElite.general;

import java.util.Collection;

import JO04InterfacesAndAbstraction.E06MilitaryElite.privvate.Private;

public interface LieutenantGeneral {

    Collection<Private> getPrivates();

    void addPrivate(Private priv);
}
