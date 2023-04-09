package Soal3;

public class Square  extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side ,side);
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square dengan side = " + super.getLength() +
                " merupakan subclass dari " + super.toString();
    }
}
