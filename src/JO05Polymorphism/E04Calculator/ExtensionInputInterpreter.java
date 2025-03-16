package JO05Polymorphism.E04Calculator;

public class ExtensionInputInterpreter extends InputInterpreter {

    private final MemorySaveOperation memorySaveOperation;

    public ExtensionInputInterpreter(CalculationEngine engine) {
        super(engine);
        this.memorySaveOperation = new MemorySaveOperation();
    }

    @Override
    public Operation getOperation(String operation) {

        return switch (operation) {
            case "/" -> new DivideOperation();
            case "mr" -> new MemoryRecallOperation();
            case "ms" -> this.memorySaveOperation;
            default -> super.getOperation(operation);
        };
    }
}