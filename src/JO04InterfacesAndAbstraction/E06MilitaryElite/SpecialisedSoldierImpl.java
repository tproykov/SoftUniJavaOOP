package JO04InterfacesAndAbstraction.E06MilitaryElite;

class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.corps = Corps.fromString(corps);
        if (this.corps == null) {
            throw new IllegalArgumentException("Invalid corps: " + corps);
        }
    }

    @Override
    public String getCorps() {
        return corps.getName();
    }
}

