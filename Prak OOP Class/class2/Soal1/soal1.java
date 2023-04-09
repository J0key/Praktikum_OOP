public class soal1{
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        
        double range1 = minivan.getRange();
        double range2 = sportscar.getRange();

        System.out.println(
            "Minivan can carry " + minivan.passanger + " with a range of " + range1
        );
        System.out.println(
            "Sportscar can carry " + sportscar.passanger + " with a range of " + range2
        );
        System.out.println();
        // void method
        minivan.range();
        sportscar.range();
       
        System.out.println();
        //toString
        System.out.println("Minivan" + minivan.toString());
        System.out.println("Sportscar" + sportscar.toString());
        
        
    }
}