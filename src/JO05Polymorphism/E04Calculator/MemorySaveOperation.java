package JO05Polymorphism.E04Calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class MemorySaveOperation implements Operation {

    private static final Deque<Integer> memory = new ArrayDeque<>();

    @Override
    public void addOperand(int operand) {
        memory.push(operand);
    }

    @Override
    public int getResult() {
        return memory.peek();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }

    public static Integer recallMemory() {
        if (memory.isEmpty()) {
            return 0;
        }

        return memory.pop();
    }
}