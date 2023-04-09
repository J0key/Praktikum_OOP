//Sebuah toko memiliki seperangkat keranjang futuristik, fitur yang ditawarkan adalah keranjang tersebut bisa memberikan total harga belanjaan yang terdapat pada keranjang tersebut. Keranjang belanja ini secara gampangannya merupakan sebuah array yang berisi tipe data "produk" dan "produk" memililiki atribut nama, merk, harga, dan berat barang. Outputkan list barang apa saja yang berada di array tersebut (namanya saja) dan total harga yang harus dibayar.
import java.util.Scanner;
public class tiga {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Produk keranjang[] = {
            new Produk("Baju One Piece", "Uniqlo",199000,250),
            new Produk("Lego Kucing","KKV",19000,35),
            new Produk("Cardigan","Uniqlo",349000,300),
            new Produk("Parfum","Kahf",75000,150)
        };
        cetak(keranjang);
        inp.close();
 
    }
    public static void cetak(Produk keranjang[]){
        System.out.println("List barang dalam keranjang : ");
        int total=0;
        for(Produk produk:keranjang){
            System.out.println(produk.nama);
            total = total + produk.harga;
        }
        System.out.println();
        System.out.println("Total harga yang harus dibayar adalah Rp" + total + ",00");
    }
}



        // for(int i=0;i<keranjang.length;i++){
        //     System.out.println("Barang ke-"+(i+1));
        //     System.out.println(keranjang[i].toString()+"\n");
        // }
        // System.out.print("Apakah ingin membayar ? (y/n) ");
        // String ans = inp.nextLine();
        // if(ans.equalsIgnoreCase("y")){
        //     cetak(keranjang);
        // }
