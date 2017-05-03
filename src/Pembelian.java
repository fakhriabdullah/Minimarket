/**
 * Created by anwar on 12/04/2017.
 */
class Pembelian{
    int hargaBeli;
    int jumlah;
    Barang barang;

    public Pembelian (int hargaBeli, Barang barang){
        this.hargaBeli = hargaBeli;
        this.barang = barang;
    }

    public Barang getBarang() {
        return barang;
    }

    public int getHargaBeli(){return hargaBeli;}

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah(){return jumlah;}

    public void print(){
        System.out.println("Nama Barang : "+this.getBarang().namaBarang);
        System.out.println("Harga Beli : "+this.getHargaBeli());
        System.out.println("Jumlah beli : "+this.getJumlah());
    }

    public static void main(String[] args) {
//        pembelian.setJumlah(100);
    }
}
