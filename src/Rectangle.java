public class Rectangle extends Shape{

    public double width;
    public double length;

    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double calculateArea(){
        double area = length*width;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = (2*width) + (2*length);
        return perimeter;
    }
}
