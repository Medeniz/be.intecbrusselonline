package hooftstuk10;


public class SquareApp {

    public static void main(String[] args) {


        Square square = new Square();
        Square square2 =new Square(5,3,7);

        System.out.println(square);

        square.setPosition(3, 5);
        square.setSide(-6);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.getHeight();
        square.getWidth();
        square.getY();
        square.getX();
        square.setSide(5);

        System.out.println(square2);
        System.out.println(square2.getArea());
        System.out.println(square2.getPerimeter());
    }
}
