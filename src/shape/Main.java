package shape;

public class Main {
    public static void main(String[] args) {
      /*  Positioned rectanglePosition = new Rectangle(0.0, 0.0, 12.0, 12.0, "Red");

        Positioned circlePosition = new Circle(1.0, 1.0, 3.0, "Yellow");

        Positioned trianglePosition = new Triangle(3.0, 3.0, 4, 3, "Green");

        Positioned[] shapes = {rectanglePosition, circlePosition, trianglePosition};

        Positioned[] thingsWithPosition = {new Rectangle(0.0, 0.0, 12.0, 12.0, "Red"),
                new Circle(1.0, 1.0, 3.0, "Yellow"),
                new Triangle(3.0, 3.0, 4, 3, "Green")};

//question 1

        for (Positioned shapeWithPosition : thingsWithPosition) {

//            shapeWithPosition.setX(shapeWithPosition.getX() + 24.00);

        }

        for (Positioned shapeWithPosition : thingsWithPosition) {

            System.out.println(shapeWithPosition.getX());

        }

//Question 2

        Mover mover = new Mover();

        for (Positioned shapeWithPosition : thingsWithPosition) {

            mover.moveToRight(shapeWithPosition, 24.00);

        }

        for (Positioned shapeWithPosition : thingsWithPosition) {

            System.out.println(shapeWithPosition.getX());

        }

//Question 3
        try {
            mover.moveToLeft(thingsWithPosition[0], 25);
        } catch (IllegalArgumentException e) {
            System.out.println("the new position of things with position 0 is: " + thingsWithPosition[0].getX());
        }

*/

        Square mySquare = new Square(1, 2, 4.0, "Black");

        mySquare.setEdge(5);

        mySquare.setWidth(12);

        System.out.println("the width is: " + mySquare.getWidth());
        System.out.println("the height is: " + mySquare.getHeight());
        System.out.println("the edge is: " + mySquare.getEdge());


    }
}
