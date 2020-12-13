package Exercise22;

public class Qube extends ThreeDimensionalShape {
    private double edge;

    public Qube(double edge){
        this.edge=edge;
    }

    @Override
    public double calculateVolume() {
        double volume=Math.pow(edge,3);
        return volume;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        double area=6*Math.pow(edge,2);
        return area;
    }

    @Override
    public String fill(double waterLevel) {
        String status="";

        if(waterLevel>calculateVolume()){
            status="Overflow";
        }else if(waterLevel==calculateVolume()){
            status="Exact";
        }else
            status="Insufficient";
        return status;
    }
}
