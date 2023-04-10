package SoalFirma;

public class Pegawai {
    double gajiPokok = 750 , tunjangan , bonus, asuransi , tarifJam , total;
    int jamKerja;
    String nama , profesi;
    public Pegawai(String nama , String profesi, double tunjangan){
        this.nama = nama;
        this.profesi = profesi;
        this.tunjangan = tunjangan;
        this.bonus = (tunjangan + gajiPokok) * 0.2;
        this.total = this.bonus + 25 + this.tunjangan + this.gajiPokok;
    }
    public Pegawai(String nama , String profesi){
        this.nama = nama;
        this.profesi = profesi;
        this.bonus = gajiPokok * 0.02 ;
        this.total = this.bonus + (0.05 * (this.gajiPokok + this.bonus)) + this.gajiPokok;
    }
    public Pegawai(String nama , String profesi ,int jamKerja , double tarifJam){
        this.nama = nama;
        this.profesi = profesi;
        this.jamKerja = jamKerja;
        this.tarifJam = tarifJam;
        this.gajiPokok = this.jamKerja * this.tarifJam;
        this.total = this.gajiPokok;
    }

    public double getTotal() {
        return total;
    }
}
