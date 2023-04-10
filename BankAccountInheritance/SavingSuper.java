public class SavingSuper extends BankAccountParent {
    int transfer;

    public SavingSuper(String accNumber, double balance, int transfer) {
        super(accNumber, balance);
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "SavingSuper{" +
                "transfer=" + transfer +
                ", AccNumber='" + AccNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
