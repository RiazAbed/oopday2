package shape;

public class Rectangle extends Shape implements Positioned, Sized, HasArea {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height, String color) {
        super(x, y,color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {

        return width * height;
    }
}