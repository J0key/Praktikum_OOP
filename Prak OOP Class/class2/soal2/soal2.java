public class soal2 {
    public static void main(String[] args) {
        
    ContactsManager listContact = new ContactsManager();
    Contact kontak1 = new Contact("Shyra Athaya" , "shyray@gmail.com" , "08956789359");
    Contact anggota2 = new Contact("Shafina Herliany" , "shfina@gmail.com" , "089908659359");
    
    //menambahkan kontak
    listContact.setContact(kontak1);
    listContact.setContact(anggota2);
    System.out.println("Jumlah kontak = " + listContact.totalContact());

    //memanggil method mencari kontak
    String hasil = listContact.searchContact("Shyra Athaya");
    System.out.println("yang dicari = " + hasil);
    }
}
