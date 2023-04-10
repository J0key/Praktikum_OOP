package SoalFirma;

public class Pegawai1 extends Pegawai {
    public Pegawai1(String nama, String profesi, double tunjangan) {
        super(nama, profesi, tunjangan);
    }

    @Override
    public String toString() {
        return "Pegawai tetap bernama " + this.nama +
                ", " + this.profesi + ", tunjangan " +
                this.tunjangan + " dollar.";
    }
}
