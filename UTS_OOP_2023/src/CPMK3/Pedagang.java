package CPMK3;

public class Pedagang extends Penduduk{
    double bayar;
    double pajak;
    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
        this.pajak = this.pendapatan * 0.12;
        this.bayar = this.pendapatan + this.pajak;
    }

    public double getBayar() {
        return bayar;
    }

    @Override
    public String toString() {
        return "Pedagang bernama " +
                nama + " membayar total sebesar Rp"
                + bayar ;
    }
}
