package Soal3;

public class Main {
    public static void main(String[] args) {
        Square kotak = new Square("Pink", true, 2);
        System.out.println("toString Square: \n" + kotak);
        System.out.println("\nMethod pada shape : ");
        kotak.setColor("Green");
        System.out.println("Color = " + kotak.getColor());
        kotak.setFilled(false);
        System.out.println("Filled = " + kotak.isFilled());
        System.out.println("\ntoString Square setelah dilakukan set : \n" + kotak);
    }
}
