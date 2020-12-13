package Exercise21;

import java.text.DecimalFormat;

public class Cone extends ThreeDimensionalShape {
    private double radius,height;

    public Cone(double radius,double height){
        this.radius=radius;
        this.height=height;
    }

    @Override
    public double calculateVolume() {
        double volume = Math.PI*Math.pow(radius,2)*(height/3);

        return volume;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI*radius*(radius+ Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)));
        return area;
    }
}
