public class Subject {
    String subjects;
    int [] score;

    public Subject(String Coursename, int [] score){
        this.subjects = Coursename;
        this.score = score;
    }

    public int[] getScores() {
        return score;
    }
}