package shape;

public class Square extends Rectangle {
    private double edge;

    public Square(double x, double y, double edge, String color) {
        super(x, y, edge, edge, color);
    }

    public void setEdge(double edge) {
        this.edge = edge;
        super.setWidth(edge);
        super.setHeight(edge);

    }

    public double getEdge() {
        return this.edge;
    }

    @Override
    public void setWidth(double width) {
        setEdge(width);
    }

    @Override
    public void setHeight(double height) {
        setEdge(height);
    }
}
