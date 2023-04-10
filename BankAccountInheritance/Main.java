import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // definisi tanggal
        LocalDate tanggal0 = LocalDate.now();
        LocalDate tanggal1 = LocalDate.of(2020, 1, 23);

        //membuat objek
        BankAccount accountCheck = new BankAccount("123-123", 999, 9000, 0, tanggal0, "checking");
        BankAccount accountSaving = new BankAccount("333-111", 508, 0, 3, tanggal0, "Saving");
        BankAccount accountDeposito = new BankAccount("975-579", 999, 0, 0, tanggal1, "Deposito");

        //print tiap objek
        System.out.println("Hasil pembuatan objek dengan 1 class bankAccount: ");
        System.out.println(accountCheck);
        System.out.println(accountSaving);
        System.out.println(accountDeposito);
        System.out.println();

        //satu class tiap account
        Checking akuncheck2= new Checking("123-124" , 999,9000);
        Saving akunsaving2 = new Saving("333-111",500, 3);
        Deposito akundeposito2 = new Deposito("975-579", 999,tanggal1);
        System.out.println("Hasil pembuatan objek dengan 3 class: ");
        System.out.println(akuncheck2);
        System.out.println(akunsaving2);
        System.out.println(akundeposito2);

        System.out.println();
        //setelah ditambah extends
        CheckingExtend akuncheck3 = new CheckingExtend("123-123",999,9000);
        SavingExtend akunsaving3 = new SavingExtend("333-111",500, 3);
        DepositoExtend akundeposito3 = new DepositoExtend("975-579", 999,tanggal1);
        System.out.println("Hasil ppembuatan dengan extend ke parent class: ");
        System.out.println(akuncheck3);
        System.out.println(akunsaving3);
        System.out.println(akundeposito3);

        //setelah ditambah extends super
        CheckingSuper akuncheck4 = new CheckingSuper("123-123",999,9000);
        SavingSuper akunsaving4 = new SavingSuper("333-111",500, 3);
        DepositoSuper akundeposito4 = new DepositoSuper("975-579", 999,tanggal1);
        System.out.println("Hasil pembuatan dengan extend super ke parent class: ");
        System.out.println(akuncheck4);
        System.out.println(akunsaving4);
        System.out.println(akundeposito4);
    }
}