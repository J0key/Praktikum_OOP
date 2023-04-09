import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice;

        ArrayList<Subject> pelajaran = new ArrayList<>();
        ArrayList<Student> studentArray = new ArrayList<>();

        System.out.print("Input jumlah subject : "  );
        int subjek = inp.nextInt();
        inp.nextLine();
        for (int i = 0; i < subjek; i++) {
            System.out.print("Input Subject : ");
            pelajaran.add( new Subject(inp.nextLine()));   
        }
        
        // for ( Subject temp : pelajaran){
        //     System.out.println(temp.subjek);
        // }

        for (int i = 0 ; i <pelajaran.size(); i++){
            System.out.println(pelajaran.get(i).subjek);
        }

        do {
            System.out.println("1. Nama Siswa");
            System.out.println("2. Search Student");
            System.out.println("3. Student Report");
            System.out.println("Choose Number : ");
            choice = inp.nextInt();

            if ( choice == 1){
                System.out.print("Masukkan nama : ");
                String nama = inp.next();
                System.out.print("Masukkan Num : ");
                String num = inp.next();
                Student s1 = new Student(nama,num,pelajaran);
                s1.input();
                studentArray.add(s1);
            }

            if (choice == 2)
            {
                int ranking = 0;
                int pass = 0;
                ArrayList<Integer> jumlahScore = new ArrayList<>();
                
                for (int i = 0; i < studentArray.size(); i++) {
                    jumlahScore.add(studentArray.get(i).jumlahNilai);
                }
                Collections.sort(jumlahScore , Collections.reverseOrder());
            
                System.out.println("Search Nama : ");
                String nama = inp.nextLine();
                for (int i = 0; i < studentArray.size() ; i++){
                    if (studentArray.get(i).Nama.equalsIgnoreCase(nama)){
                        System.out.print("Num :" + studentArray.get(i).Num);
                        for (int j = 0; j < studentArray.size(); j++) {
                            if(studentArray.get(j).jumlahNilai == jumlahScore.get(j)){
                                ranking = j + 1;
                                break;
                                } 
                            } 
                        }
                    }
                    System.out.print("Ranking : " + ranking);
                    System.out.print("Total Nilai : " + studentArray.get(i).jumlahNilai);
            }
            if (choice == 3){

                for (int i = 0; i<studentArray.size(); i++){
                    studentArray.get(i).print();
                    System.out.println();
                }
                System.out.println();
                for (int  i =0 ;i<pelajaran.size(); i++){
                    System.out.println("Nama : " + pelajaran.get(i).subjek);
                    System.out.print("Nilai : ");
                    System.out.println(pelajaran.get(i).arrayNilai);
                    System.out.println();

                }
            }
                        
                //         
                //      else pass +=1;
                
                // if ( pass == studentArray.size());
                // System.out.println("angka tidal ditemukan");
                
            
                
            


        }while (choice != 0);
            System.out.println("Program Keluar");


        
    }
    
}
