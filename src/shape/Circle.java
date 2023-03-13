package shape;

public class Circle extends Shape implements Positioned, Sized, HasArea {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius, String color) {
        super(x,y,color);
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getWidth() {
        return 2 * radius;
    }

    @Override
    public double getHeight() {
        return 2 * radius;
    }

    public double getArea() {
        return (Math.PI) * (Math.pow(radius,2));


    }
}