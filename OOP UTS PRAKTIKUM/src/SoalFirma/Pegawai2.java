package SoalFirma;

public class Pegawai2 extends Pegawai{
    public Pegawai2(String nama, String profesi) {
        super(nama, profesi);
    }

    @Override
    public String toString() {
        return "Pegawai tidak tetap bernama " + this.nama +
                ", " + this.profesi;
    }
}
