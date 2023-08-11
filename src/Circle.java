public class Circle extends Shape{

    public double radius;
    public double pi = Math.PI;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        double area = pi*radius*radius;
        return area;
    }

    public double calculatePerimeter(){
        double circum = 2*pi*radius;
        return circum;
    }
}
