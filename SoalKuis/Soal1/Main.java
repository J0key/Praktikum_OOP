package Soal1;

public class Main {
    public static void main(String[] args) {
        Cylinder tabung1 = new Cylinder();
        Cylinder tabung2 = new Cylinder(8);
        Cylinder tabung3 = new Cylinder(8, 14);
        //toString
        System.out.println(tabung1);
        System.out.println(tabung2);
        System.out.println(tabung3);

        System.out.println();

        //tabung 1
        tabung1.setRadius(6);
        System.out.println("Radius tabung1 = " + tabung1.getRadius());
        tabung1.setColor("Purple");
        System.out.println("Warna tabung1 = " + tabung1.getColor());
        tabung1.setHeight(8);
        System.out.println("Tinggi tabung1 = " + tabung1.getHeight());
        System.out.println("Area tabung1 = " + tabung1.getArea());
        System.out.println("Volume tabung1 = " + tabung1.getVolume());
        System.out.println(tabung1);

        System.out.println();

        //tabung 2
        tabung2.setRadius(9);
        System.out.println("Radius tabung2 = " + tabung2.getRadius());
        tabung2.setColor("Green");
        System.out.println("Warna tabung2 = " + tabung2.getColor());
        tabung2.setHeight(13);
        System.out.println("Tinggi tabung2 = " + tabung2.getHeight());
        System.out.println("Area tabung2 = " + tabung2.getArea());
        System.out.println("Volume tabung2 = " + tabung2.getVolume());
        System.out.println(tabung2);

        System.out.println();

        //tabung 3
        tabung3.setRadius(8);
        System.out.println("Radius tabung3 = " + tabung3.getRadius());
        tabung3.setColor("Blue");
        System.out.println("Warna tabung3 = " + tabung3.getColor());
        tabung3.setHeight(10);
        System.out.println("Tinggi tabung3 = " + tabung3.getHeight());
        System.out.println("Area tabung3 = " + tabung3.getArea());
        System.out.println("Volume tabung3 = " + tabung3.getVolume());
        System.out.println(tabung3);

        System.out.println();


    }
}
