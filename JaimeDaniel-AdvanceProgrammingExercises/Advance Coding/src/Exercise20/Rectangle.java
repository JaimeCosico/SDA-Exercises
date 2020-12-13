package Exercise20;

public class Rectangle extends Shape {
    private int length=0;
    private int width=0;

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;

    }

    @Override
    public double calculatePerimeter() {
        double perimeter=2*(length)+2*(width);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area=length*width;
        return area;
    }
}
