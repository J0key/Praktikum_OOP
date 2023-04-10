package SoalFirma;

public class main {
    public static void main(String[] args) {
        Pegawai1 a = new Pegawai1("Jonno" , "manager" , 20);
        Pegawai2 b = new Pegawai2("Jonni" , "staff IT");
        PegawaiPW c = new PegawaiPW("Anna" , "sekretaris" , 60 , 10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();


        System.out.println("Pegawai dengan take home pay tertinggi:");
        if (a.getTotal() > b.getTotal() && a.getTotal() > c.getTotal()){
            System.out.println(a.getTotal());
        }
        else if (b.getTotal() > a.getTotal() && b.getTotal() > c.getTotal()){
            System.out.println(b.getTotal());
        }
        else if (c.getTotal() > b.getTotal() && c.getTotal() > a.getTotal()){
            System.out.println(c.getTotal());
        }

    }
}
