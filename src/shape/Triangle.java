package shape;

public class Triangle extends Shape implements Positioned, Sized, HasArea{
    private double x;
    private double y;
    private double base;
    private double height;
    public Triangle(double x, double y, double base, double height, String color) {
        super(x,y, color);
        this.base = base;
        this.height = height;
    }
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
@Override
    public double getWidth() {
        return base;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getArea() {
        return 0.5 * (base * height);
    }
}