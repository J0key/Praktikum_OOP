public class SavingExtend extends BankAccountParent {
    int transfer;

    public SavingExtend(String AccNumber, double balance,int transfer){
        this.AccNumber = AccNumber;
        this.balance = balance;
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "SavingExtend{" +
                "transfer=" + transfer +
                ", AccNumber='" + AccNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
