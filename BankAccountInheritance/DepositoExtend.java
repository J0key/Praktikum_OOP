import java.time.LocalDate;

public class DepositoExtend extends BankAccountParent{
    LocalDate expiry;

    public DepositoExtend(String AccNumber, double balance,LocalDate expiry) {
        this.AccNumber = AccNumber;
        this.balance = balance;
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "DepositoExtend{" +
                "expiry=" + expiry +
                ", AccNumber='" + AccNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
