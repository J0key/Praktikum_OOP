import java.util.ArrayList;

public class Subject{
    String subjek;
    ArrayList<Integer> arrayNilai = new ArrayList<>();
    

    public Subject(String subjek, ArrayList<Integer> arrayNilai ){
        this.subjek = subjek;
        this.arrayNilai = arrayNilai;
    }

    public Subject(String subjek){
        this.subjek = subjek;
    }

}