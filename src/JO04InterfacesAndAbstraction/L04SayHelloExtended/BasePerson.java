package JO04InterfacesAndAbstraction.L04SayHelloExtended;

public abstract class BasePerson {

    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}