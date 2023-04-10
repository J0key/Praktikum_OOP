package CPMK3;

public class Petani extends Penduduk{
    double bayar;
    double pajak;
    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
        this.pajak = this.pendapatan * 0.03;
        this.bayar = this.pendapatan + this.pajak;
    }

    public double getBayar() {
        return bayar;
    }

    @Override
    public String toString() {
        return "Petani bernama " +
                nama + " membayar total sebesar Rp"
                + bayar ;
    }
}
