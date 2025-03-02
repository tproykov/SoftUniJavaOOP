package JO03Inheritance.L04StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String> data;

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        return data.removeLast();
    }

    public String peek() {
        return data.getLast();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}