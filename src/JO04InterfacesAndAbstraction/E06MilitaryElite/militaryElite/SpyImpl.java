package JO04InterfacesAndAbstraction.E06MilitaryElite;

class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d Code Number: %s",
                getFirstName(), getLastName(), getId(), getCodeNumber());
    }
}
