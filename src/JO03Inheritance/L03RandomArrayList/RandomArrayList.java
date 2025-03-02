package JO03Inheritance.L03RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    public T getRandomElement() {

        if (super.isEmpty()) {
            return null;
        }

        Random random = new Random();

        int index = random.nextInt(super.size());

        T element = super.get(index);

        super.remove(element);
        return element;
    }
}