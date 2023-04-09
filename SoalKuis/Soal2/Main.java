package Soal2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Shyra", "Kalimantan");
        Person person2 = new Person("Tanto", "Sumatra");
        Person person3 = new Person("Fadhil", "Jogja");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();

        //person1
        person1.setName("Shyra");
        System.out.println("Nama person1 = " + person1.getName());
        person1.setAddress("Wirobrajan");
        System.out.println("Alamat person1 = " + person1.getAddress());
        System.out.println(person1);
        System.out.println();

        //person2
        person2.setName("Tanto");
        System.out.println("Nama person2 = " + person2.getName());
        person2.setAddress("Sendowo");
        System.out.println("Alamat person2 = " + person2.getAddress());
        System.out.println(person2);
        System.out.println();

        //person3
        person3.setName("Fadhil");
        System.out.println("Nama person3 = " + person3.getName());
        person3.setAddress("Bantul");
        System.out.println("Alamat person3 = " + person3.getAddress());
        System.out.println(person3);
        System.out.println();

        Student student1 = new Student("Olis", "Batang", "TRI", 2022, 600);
        Student student2 = new Student("Marita", "Karanganyar", "BPW", 2022, 7041);
        Student student3 = new Student("Angel", "Boyolali", "TRPL", 2022, 41809);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println();

        //student1
        student1.setName("Olis");
        System.out.println("Nama student1 = " + student1.getName());
        student2.setAddress("Pogung");
        System.out.println("Alamat student1 = " + student1.getAddress());
        student1.setProgram("TRI");
        System.out.println("Program student1 = " + student1.getProgram());
        student1.setYear(2022);
        System.out.println("Year student1 = " + student1.getYear());
        student1.setFee(491);
        System.out.println("Fee student1 = " + student1.getFee());
        System.out.println();

        //student2
        student2.setName("Marita");
        System.out.println("Nama student2 = " + student2.getName());
        student2.setAddress("Babarsari");
        System.out.println("Alamat student2 = " + student2.getAddress());
        student2.setProgram("BPW");
        System.out.println("Program student2 = " + student2.getProgram());
        student2.setYear(2022);
        System.out.println("Year student2 = " + student2.getYear());
        student2.setFee(7481);
        System.out.println("Fee student2 = " + student2.getFee());
        System.out.println();

        //student3
        student3.setName("Angel");
        System.out.println("Nama student3 = " + student3.getName());
        student2.setAddress("Blimbingsari");
        System.out.println("Alamat student3 = " + student3.getAddress());
        student1.setProgram("TSPD");
        System.out.println("Program student3 = " + student3.getProgram());
        student1.setYear(2022);
        System.out.println("Year student3 = " + student3.getYear());
        student1.setFee(8752);
        System.out.println("Fee student3 = " + student3.getFee());
        System.out.println();

        //STAFF
        Staff staff1 = new Staff("Shyra" ,"Ngadimulyo" , "Sragen" , 50000);
        Staff staff2 = new Staff("Tanto" , "Sendowo" , "Sragen" , 70000);
        Staff staff3 = new Staff("Angel" , "Sendowo" , "Sragen" , 90000);
        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);
        System.out.println();

        //staff1
        staff1.setSchool("Bantul");
        System.out.println("School = " + staff1.getSchool());
        staff1.setPay(60000);
        System.out.println("Pay = " + staff1.getPay());
        System.out.println(staff1);
        System.out.println();

        //staff2
        staff2.setSchool("Bantul");
        System.out.println("School = " + staff2.getSchool());
        staff2.setPay(80000);
        System.out.println("Pay = " + staff2.getPay());
        System.out.println(staff2);
        System.out.println();

        //staff1
        staff3.setSchool("Bantul");
        System.out.println("School = " + staff3.getSchool());
        staff3.setPay(20000);
        System.out.println("Pay = " + staff3.getPay());
        System.out.println(staff3);

    }
}
