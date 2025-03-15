package JO04InterfacesAndAbstraction.E07CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable{

    @Override
    public int add(String item) {
        this.items.add(0, item);
        return this.items.size() - 1;
    }

    @Override
    public String remove() {
        String itemToRemove = this.items.get(this.items.size() - 1);
        this.items.remove(itemToRemove);
        return itemToRemove;
    }
}