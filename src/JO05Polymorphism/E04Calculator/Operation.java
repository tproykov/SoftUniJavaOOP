package JO05Polymorphism.E04Calculator;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}
