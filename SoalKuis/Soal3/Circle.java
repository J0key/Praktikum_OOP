package Soal3;

public class Circle extends Shape{
    double radius;
    public Circle(){
        this.radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle dengan radius = " + radius +
                " merupakan subclass dari " + super.toString() ;
    }
}
