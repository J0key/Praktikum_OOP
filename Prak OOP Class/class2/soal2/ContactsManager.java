public class ContactsManager {
    //deklarasi
    Contact objectArray[]; //membuat array dari class contact
    //berfungsi untuk menyimpan objek objek Contact
    int saveContact; //mencatat banyak kontak yang suda tersimopn

    public ContactsManager(){
        //inisiasi atribut dengan nilai awal
        objectArray = new Contact[1000];
        saveContact = 0;
    }

    //method

    //tambah kontak baru
    public void setContact(Contact newContact){ //mengubah nilai dari objek Contact yang ada menajdi objek Contact yang baru melalui parameter.
        int index = saveContact; //bikin urutan kota tersimpa baru biar yang lama ga kerubah
        objectArray[index] = newContact; //array buat nayri atau nambahin 
        saveContact = saveContact + 1; //iterasi
    }

    //cari nomer telepon dari nama
    public String searchContact(String riason_name){
        for ( int i = 0 ; i < saveContact ; i++){
            //membuat loopingan dari kontaks yang tersimpan
            if(objectArray[i].Nama == riason_name){
                return objectArray[i].nomer_telepon;
                //mengembalikan nomer telepon dari indeks yg ke -n
            }
        }
        return null; //kalo di perulangan  ga ada yang sama dibalikan dnegan variabel kosonh
    }

    //menampilkan jumlah total kontak yang sudah disimpan
    public int totalContact(){
        return saveContact;
    }





}
