package JO05Polymorphism.E04Calculator;

public class Extensions {

    public static InputInterpreter buildInterpreter(CalculationEngine engine){
        return new ExtensionInputInterpreter(engine);
    }
}