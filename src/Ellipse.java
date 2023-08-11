public class Ellipse extends Shape{

    public double pi = Math.PI;
    public double majorAxis;
    public double minorAxis;

    public void setMajorAxis(double majorAxis){
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis){
        this.minorAxis = minorAxis;
    }

    public double calculateArea(){
        double area = pi*majorAxis*minorAxis;
        return area;
    }

    public double calculatePerimeter(){

        double a = majorAxis*majorAxis;
        double b = minorAxis*minorAxis;

        double circum = 2*pi*Math.sqrt((a+b)/2);
        return circum;

    }
}
