package JO06SOLID._1SingleResponsibility.DrawingShape;

public interface Rengerer {
    void render(DrawingRepository drawingRepository, Shape shape);
}
