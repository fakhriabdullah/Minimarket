/**
 * Created by anwar on 12/04/2017.
 */
class Pembelian{
    int hargaBeli;
    int jumlah;
    String barang;

    public Pembelian (int hargaBeli, String barang){
        this.hargaBeli = hargaBeli;
        this.barang = barang;
    }

    public String getBarang() {
        return barang;
    }

    public int getHargaBeli(){return hargaBeli;}

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah(){return jumlah;}

    public static void main(String[] args) {
        Pembelian pembelian = new Pembelian(5000,"Rinso");
        pembelian.setJumlah(100);
    }
}
