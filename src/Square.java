public class Square extends Shape{

    public double side;

    public void setLengthOfSide(double side){
        this.side = side;
    }

    public double calculateArea(){
        double area = side*side;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 4*side;
        return perimeter;
    }
}
