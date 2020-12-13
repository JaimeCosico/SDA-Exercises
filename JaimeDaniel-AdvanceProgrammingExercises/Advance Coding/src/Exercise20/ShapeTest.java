package Exercise20;

public class ShapeTest {
    public static void main(String[] args){
        Triangle myTriangle = new Triangle(10,10,10);
        Rectangle myRectangle = new Rectangle(10,10);
        Hexagon myHexagon = new Hexagon(6);
        System.out.println("Your triangle's perimeter: "+myTriangle.calculatePerimeter());
        System.out.println("Your triangle's area: "+myTriangle.calculateArea());
        System.out.println("Your Rectangle's perimeter: "+myRectangle.calculatePerimeter());
        System.out.println("Your Rectangle's area: "+myRectangle.calculateArea());
        System.out.println("Your Hexagon's perimeter: "+myHexagon.calculatePerimeter());
        System.out.println("Your Hexagon's area: "+myHexagon.calculateArea());
    }
}
