public class Circle {

    public double radius;
    public double pi = 3.14159;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        double area = pi*radius*radius;
        return area;
    }

    public double calculateCircumference(){
        double circum = 2*pi*radius;
        return circum;
    }
}
