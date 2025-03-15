package JO04InterfacesAndAbstraction.E07CollectionHierarchy;

public class MyListImpl extends Collection implements MyList {

    @Override
    public int getUsed() {
        return 0;
    }

    @Override
    public String remove() {
        String itemToRemove = this.items.getLast();
        this.items.remove(itemToRemove);
        return itemToRemove;
    }

    @Override
    public int add(String item) {
        this.items.add(0, item);
        return this.items.size() - 1;
    }
}