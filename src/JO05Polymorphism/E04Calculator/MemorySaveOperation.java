package JO05Polymorphism.E04Calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class MemorySaveOperation implements Operation {

    private static final Deque<Integer> memory = new ArrayDeque<>();
    private int operand;
    private boolean hasOperand;

    @Override
    public void addOperand(int operand) {
        this.operand = operand;
        this.hasOperand = true;
        memory.push(operand);
    }

    @Override
    public int getResult() {
        return operand;
    }

    @Override
    public boolean isCompleted() {
        return hasOperand;
    }

    public static Integer recallMemory() {
        if (memory.isEmpty()) {
            return 0;
        }
        return memory.pop();
    }
}