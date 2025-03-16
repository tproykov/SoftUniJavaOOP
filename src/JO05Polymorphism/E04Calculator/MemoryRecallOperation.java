package JO05Polymorphism.E04Calculator;

public class MemoryRecallOperation implements Operation {
    private boolean completed;
    private int result;

    @Override
    public void addOperand(int operand) {
    }

    @Override
    public int getResult() {
        if (!completed) {
            result = MemorySaveOperation.recallMemory();
            completed = true;
        }
        return result;
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}