package JO04InterfacesAndAbstraction.L02CarShopExtended;

import java.io.Serializable;

public interface Car extends Serializable {

    Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}