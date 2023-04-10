public class CheckingExtend extends BankAccountParent{
    double limit;

    public CheckingExtend(String AccNumber,double balance, double limit) {
        this.AccNumber = AccNumber;
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CheckingExtend{" +
                "limit=" + limit +
                ", AccNumber='" + AccNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
