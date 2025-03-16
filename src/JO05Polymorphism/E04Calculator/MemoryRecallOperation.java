package JO05Polymorphism.E04Calculator;

public class MemoryRecallOperation implements Operation {

    @Override
    public void addOperand(int operand) {
    }

    @Override
    public int getResult() {
        return MemorySaveOperation.recallMemory();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}