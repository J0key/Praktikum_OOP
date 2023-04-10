package CPMK1;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        item keranjang[] = {
            new item(3000,"potion","S",3),
            new item(5000,"Sword","A",1),
            new item(10000,"Armor","A",1)
        };
        cetak(keranjang);
        inp.close();
    }
    public static void cetak(item keranjang[]){
        int total=0;
        int jumlah = 0;
        for(item produk:keranjang){
            total = total + produk.harga;
        }
        System.out.println("Your Item backpack worth: " + total + " with item as listed below: " + "\n");
        for(item produk:keranjang){
            jumlah = produk.harga * produk.quantity;
            System.out.println(produk.quantity + " " + produk.rank + " " + produk.nama  + " worth: " + jumlah);
        }
    }
}

