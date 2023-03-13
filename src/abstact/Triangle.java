package abstact;

public class Triangle extends Shape{
    Triangle(int sides) {
        super(sides);
    }

    @Override
    public void sayShapeName() {
        System.out.println("I am a Triangle");
    }


}
