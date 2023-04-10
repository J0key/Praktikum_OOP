public class BankAccountParent {
    String AccNumber;
    double balance;

    @Override
    public String toString() {
        return "BankAccountParent{" +
                "AccNumber='" + AccNumber + '\'' +
                ", balance=" + balance +
                '}';
        }

    //default constructor
    public BankAccountParent(){
    }
    public BankAccountParent(String accNumber, double balance) {
        this.AccNumber = accNumber;
        this.balance = balance;
    }
}