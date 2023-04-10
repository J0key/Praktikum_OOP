package CPMK3;

public class Ksatria extends Penduduk{
    double bayar;
    double pajak;

    public Ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
        this.pajak = this.pendapatan * 0.18;
        this.bayar = this.pendapatan + this.pajak;
    }

    public double getBayar() {
        return bayar;
    }

    @Override
    public String toString() {
        return "Ksatria bernama " +
                nama + " membayar total sebesar Rp"
                + this.bayar ;
    }
}
