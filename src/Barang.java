/**
 * Created by Yusup Andrianto
 * 1400429
 */
public class Barang {
    int idBarang;
    String namaBarang;
    int hargaJual;
    int hargaBeli;
    String kadaluarsa;
    int stok=0;
    String kondisiBarang="Baik";
    String kategori="";

    public Barang(int idBarang, String namaBarang, int hargaJual, int hargaBeli, String kadaluarsa, int stok, String kategori) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaJual = hargaJual;
        this.hargaBeli = hargaBeli;
        this.kadaluarsa = kadaluarsa;
        this.stok = stok;
        this.kategori= kategori;
    }

    public int getIdBarang() { return idBarang; }

    public String getNamaBarang() { return namaBarang; }

    public int getHargaJual() {
        return hargaJual;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public String getKadaluarsa() {
        return kadaluarsa;
    }

    public int getStok() {
        return stok;
    }

    public String getKategori(){ return kategori;}

    public String getKondisiBarang(){return kondisiBarang; }

    public void printBarang()
    {
        System.out.println("ID Barang : "+idBarang);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Jual : "+hargaJual);
        System.out.println("Harga Beli : "+hargaBeli);
        System.out.println("Kadaluarsa : "+kadaluarsa);
        System.out.println("Kategori : "+kategori);
        System.out.println("Kondisi Barang : "+kondisiBarang);
        System.out.println("Stok : "+stok);
    }

    public static void main(String[] args){
        Barang brg = new Barang(1, "Indomie", 2500, 2000, "2 Juni 2018", 20, "Makanan" );
        brg.printBarang();
    }


}
