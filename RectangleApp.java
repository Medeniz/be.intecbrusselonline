package hooftstuk10;

import hooftstuk10.Rectangle;

public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("This program uses a rectangle.");
        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(18);
        rectangle.setWidth(-27);

        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getX() + ", " + rectangle.getY());

    }
}
