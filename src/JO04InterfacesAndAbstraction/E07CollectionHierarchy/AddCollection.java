package JO04InterfacesAndAbstraction.E07CollectionHierarchy;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String item) {
        this.items.add(item);
        return this.items.size() - 1;
    }
}