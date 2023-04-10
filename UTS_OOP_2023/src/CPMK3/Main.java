package CPMK3;

public class Main {
    public static void main(String[] args) {
        Ksatria a = new Ksatria("Andro" , 500000);
        Pedagang b = new Pedagang("Fina" , 800000);
        Petani c = new Petani("Verlino" , 100000);
        Pandai_Besi d = new Pandai_Besi("Tantowi" , 200000);


        System.out.println(a.getBayar());
        System.out.println(b.getBayar());
        System.out.println(c.getBayar());
        System.out.println(d.getBayar());
        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
