public class CheckingSuper extends BankAccountParent{
    double limit;

    public CheckingSuper(String accNumber, double balance, double limit) {
        super(accNumber, balance);
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "ChekingSuper{" +
                "limit=" + limit +
                ", AccNumber='" + AccNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

