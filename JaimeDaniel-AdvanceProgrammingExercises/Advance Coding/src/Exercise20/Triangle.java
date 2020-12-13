package Exercise20;

public class Triangle extends Shape {
    private double sideA,base,sideC;

   public Triangle(double sideA, double base, double sideC) {
        this.sideA = sideA;
        this.base= base;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
       double perimeter=sideA+base+sideC;
       return perimeter;
   }

    @Override
    public double calculateArea() {
       double s= (sideA+base+sideC)/2;
       double area = Math.sqrt(s*(s-sideA)*(s-base)*(s-sideC));
       return area;
    }
}
