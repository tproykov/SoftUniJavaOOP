package JO01WorkingWithAbstractions.L02PointsInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point TopRight;

    public Rectangle(Point bottomLeft, Point TopRight) {
        this.bottomLeft = bottomLeft;
        this.TopRight = TopRight;
    }

    public boolean contains(Point point) {

        boolean xIsBetween = point.getX() >= bottomLeft.getX() && point.getX() <= TopRight.getX();
        boolean yIsBetween = point.getY() >= bottomLeft.getY() && point.getY() <= TopRight.getY();

        return xIsBetween && yIsBetween;
    }
}