public class Vehicle {
    int passanger;
    double fuelcap , mpg;

    Vehicle(){
    passanger = 0;
    fuelcap = 0;
    mpg = 0;
    }

    Vehicle(int passanger, double fuelcap , double mpg){
    this.passanger = passanger;
    this.fuelcap = fuelcap;
    this.mpg = mpg;
    }

    public double getRange() {
    return fuelcap * mpg;
    } 

    public void range(){
     double range = fuelcap * mpg;
    }

    public String toString(){
        return " can carry " + this.passanger + " with a range of " + this.getRange();
    }
 }
    

