import java.time.LocalDate;

public class DepositoSuper extends BankAccountParent{
    LocalDate expiry;

    public DepositoSuper(String accNumber, double balance, LocalDate expiry) {
        super(accNumber, balance);
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "DepositoSuper{" +
                "expiry=" + expiry +
                ", AccNumber='" + AccNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
