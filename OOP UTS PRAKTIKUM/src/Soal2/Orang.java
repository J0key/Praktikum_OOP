package Soal2;

public class Orang {
    String nama , keluarga , status;
    private final String NIK;

    public Orang(String nama, String NIK) {
        this.nama = nama;
        this.NIK = NIK;
        this.keluarga=NIK.substring(0,5);
        if (this.NIK.charAt(16) == '0') {
            this.status="Kepala Keluarga";
        }
        else if(this.NIK.charAt(16) == '1') {
            this.status="Istri";
        }
        else if(this.NIK.charAt(16) == '2') {
            this.status="Anak";
        }
    }
    public String getRelation(Orang hubungan){
        if (this.keluarga.equals(hubungan.keluarga)){
            return this.nama + ": " + this.status +'\n' +
                    hubungan.nama + ": " + hubungan.status +'\n' +
                    "================================";
        }else{
            return this.nama + " dan " + hubungan.nama + " tidak ada hubungan" + '\n' +
                    "================================";
        }
    }
}
