package Exercise20;

public class Hexagon extends Shape {
    private double sides;

    public Hexagon(double sides){
        this.sides=sides;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 6*sides;
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = ((3*Math.sqrt(3)/2)*Math.pow(sides,2));
        //double area = ((3/2*Math.sqrt(3))*Math.pow(sides,2));
        return area;
    }
}
