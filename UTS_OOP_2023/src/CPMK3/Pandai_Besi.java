package CPMK3;

public class Pandai_Besi extends Penduduk{
    double bayar;
    double pajak;
    public Pandai_Besi(String nama, int pendapatan) {
        super(nama, pendapatan);
        this.pajak = this.pendapatan * 0.16;
        this.bayar = this.pendapatan + this.pajak;
    }

    public double getBayar() {
        return bayar;
    }
    @Override
    public String toString() {
        return "Pandai besi bernama " +
                nama + " membayar total sebesar Rp"
                + bayar ;
    }
}
