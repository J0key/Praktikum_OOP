package CPMK1;

public class item {
    int harga , quantity;
    String nama , rank;
    int total;

    public item(int harga,String nama,String rank, int quantity ) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }
    public void setTotal(int harga , int quantity){
        this.total = this.harga*this.quantity;
    }
    public int getTotal() {
        return total;
    }
    public String seeAllitem(){
        return ("Your item backpack worth: with item as listed below:" + "\n" +
                +this.quantity + this.rank + this.nama + " worth:" + getTotal());
    }
}
