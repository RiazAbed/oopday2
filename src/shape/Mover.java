package shape;

public class Mover{
    public void moveToRight(Rectangle rectangle) {
        double currentX = rectangle.getX();
        double updatedX = currentX + 1;
        rectangle.setX(updatedX);
    }
    public void moveToRight(Triangle triangle) {
        double currentX = triangle.getX();
        double updatedX = currentX + 1;
        triangle.setX(updatedX);
    }
    public void moveToRight(Circle circle) {
        double currentX = circle.getX();
        double updatedX = currentX + 1;
        circle.setX(updatedX);
    }
    public void moveToRight(Positioned positioned) {
        double currentX = positioned.getX();
        double updatedX = currentX + 1;
        positioned.setX(updatedX);
    }

    public void moveToRight(Shape shape) {
        double currentX = shape.getX();
        double updatedX = currentX + 1;
        shape.setX(updatedX);
    }

    public void moveToRight(Positioned positioned, double unitsToMoveBy){
        double currentX = positioned.getX();
        double updatedX = currentX + unitsToMoveBy;
        positioned.setX(updatedX);
    }

    public void moveToLeft(Positioned positioned, double unitsToMoveBy){
        double currentX = positioned.getX();
        double updatedX = currentX - unitsToMoveBy;

        if(updatedX < 0){
            System.out.println("You cannot move any further to the left");
            System.out.println("The X co-ordinate cannot be less than 0");
            positioned.setX(0);
            throw new IllegalArgumentException("You cannot move any further to the left.\nThe X co-ordinate cannot be less than 0 ");
        }

        positioned.setX(updatedX);
    }
}