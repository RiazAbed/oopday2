package abstact;

public abstract class Shape {
    private int sides;

    Shape(int sides){
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public abstract void sayShapeName();
}
