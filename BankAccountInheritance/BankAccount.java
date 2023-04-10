import java.time.LocalDate;

public class BankAccount {
    String accNumber;
    double balance;
    double limit; //checking
    int transfer; //saving
    LocalDate expiry; //deposito
    String codeAcc; //kode untuk setiap jenis akun

    public BankAccount(String accNumber, double balance, double limit, int transfer, LocalDate expiry, String codeAcc) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.limit = limit;
        this.transfer = transfer;
        this.expiry = expiry;
        this.codeAcc = codeAcc;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                ", transfer=" + transfer +
                ", expiry=" + expiry +
                ", codeAcc='" + codeAcc + '\'' +
                '}';
    }
}



