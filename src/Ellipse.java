public class Ellipse {

    public double pi = 3.14159;
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

    public double calculateCircumference(){

        double a = majorAxis*majorAxis;
        double b = minorAxis*minorAxis;

        double circum = 2*pi*Math.sqrt((a+b)/2);
        return circum;

//        double h = (majorAxis-minorAxis)*(majorAxis-minorAxis)/(majorAxis+minorAxis)*(majorAxis+minorAxis);
//        double x = Math.abs(4-(3*h));
//        double y = Math.sqrt(x);
//        double z = 4-(3*h);
//        double circum = pi*(majorAxis+minorAxis)*(1+(3*h/10+y));
//        return z;
    }
}
