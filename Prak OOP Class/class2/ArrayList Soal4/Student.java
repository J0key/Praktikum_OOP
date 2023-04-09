import java.util.ArrayList;
import java.util.Scanner;

public class Student{
    String Nama, Num;
    ArrayList<Subject> pelajaran;
    int jumlahNilai = 0;

    public Student(String Nama,String Num , ArrayList<Subject> pelajaran){
        this.Nama = Nama;
        this.Num = Num;
        this.pelajaran = pelajaran;
    }
    
    void input(){
        for(int i = 0 ; i < pelajaran.size() ; i++){
        Scanner inp = new Scanner(System.in);
        System.out.println("Pelajaran " + pelajaran.get(i).subjek);   
        System.out.print("Masukkan nilai : ");
        int nilai = inp.nextInt();
        pelajaran.get(i).arrayNilai.add(nilai);
        jumlahNilai += nilai;
        }
    }

    void print(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("Num : " + this.Num);
    }

}
