package JO05Polymorphism.E04Calculator;

public class ExtensionInputInterpreter extends InputInterpreter {


    public ExtensionInputInterpreter(CalculationEngine engine) {
        super(engine);
    }

    @Override
    public Operation getOperation(String operation) {

        return switch (operation) {
            case "/" -> new DivisionOperation();
            case "mr" -> new MemoryRecallOperation();
            case "ms" -> new MemorySaveOperation();
            default -> super.getOperation(operation);
        };
    }
}