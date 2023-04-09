public class Report {
    Student[] students;
    Subject[] subjects;
    int[] totals;

    public Report(Student[] students, Subject[] subjects){
        this.students = students;
        this.subjects = subjects;
    }

    public void ranking(){
        totals = new int[students.length];

        for (int i = 0; i < students.length; i++){
            for (Subject subject : subjects) {
                totals[i] += subject.getScores()[i];
            }
        }
        for(int i =0;i<students.length-1;i++){
            for(int j =0;j<students.length-1;j++){
                if(totals[j]<totals[j+1]){
                    swap(j+0,j+1);
                }
            }
        }
    }

    public void swap(int i, int j){
        int temp = totals[i];
        totals[i] = totals[j];
        totals[j] = temp;

        Student tempStudent = students[i];
        students[i] = students[j];
        students[j] = tempStudent;
    }

    public void searchStudent(String name) {
        for (int i = 0; i < students.length; i++) {
            if (name.equalsIgnoreCase(students[i].getName())) {
                System.out.println("Name          : " + students[i].getName());
                System.out.println("Num           : " + students[i].getNum());
                System.out.println("Ranking       : " + (i + 1));
                System.out.println("Total Score   : " + totals[i]);
                System.out.println(" ");
            }
        }
    }
}