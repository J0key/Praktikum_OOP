public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student("ari", "s01"),
                new Student("ado", "s02"),
                new Student("boy", "s03"),
                new Student("cen", "s04"),
        };

        Subject[] subjects = {
                new Subject("Math", new int[] {80, 100, 60, 80}),
                new Subject("Bio", new int[] {60, 90, 50, 80})
        };

        Report Rank = new Report(students, subjects);
        Rank.ranking();
        Rank.searchStudent("ari");
        Rank.searchStudent("ado");
        Rank.searchStudent("boy");
        Rank.searchStudent("cen");
    }
}