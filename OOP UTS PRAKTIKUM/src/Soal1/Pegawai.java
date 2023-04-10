package Soal1;

public class Pegawai {
    String nama , divisi , posisi;
    double gaji = 0;
    public Pegawai(String nama, String divisi, String posisi) {
        this.nama = nama;
        this.divisi = divisi;
        this.posisi = posisi;

        if(divisi == "Back-end" && posisi == "Intern"){
            this.gaji = 75000;   }
        else if(divisi == "Back-end" && posisi == "Programmer"){
            this.gaji = 400000;    }
        else if(divisi == "Front-end" && posisi == "Intern"){
            this.gaji = 60000;
        }
    }

    @Override
    public String toString() {
        return  "Nama: " + nama + '\n' +
                "Divisi: " + divisi + '\n' +
                "Posisi: " + posisi + '\n' +
                "Gaji: " + "Rp "+ gaji + '\n' +
                "=========================";
    }
}

