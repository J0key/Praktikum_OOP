public class Saving {
    String accNumber;
    double balance;
    int transfer;

    public Saving(String accNumber, double balance, int transfer) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.transfer = transfer;
    }
    @Override
    public String toString() {
        return "Saving{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                ", transfer=" + transfer +
                '}';
    }
}
