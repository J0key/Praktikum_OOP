package SoalFirma;

public class PegawaiPW extends Pegawai{
    public PegawaiPW(String nama, String profesi, int jamKerja, double tarifJam) {
        super(nama, profesi, jamKerja, tarifJam);
    }

    @Override
    public String toString() {
        return "Pegawai paruh waktu bernama " +
                this.nama + ", " + this.profesi +
                ", " + this.jamKerja + " jam kerja, " +
                this.tarifJam + " dollar per-jam.";
    }
}
