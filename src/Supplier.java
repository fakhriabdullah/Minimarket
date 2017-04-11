/**
 * Created by fakhriabdullah on 11/04/2017.
 */
public class Supplier {
    int idSupplier;
    String namaSupplier;
    String alamat;
    String kontak;

    public Supplier(int idSupplier, String namaSupplier, String alamat, String kontak) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.alamat = alamat;
        this.kontak = kontak;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKontak() {
        return kontak;
    }

    public void printSupplier()
    {
        System.out.println("Id : "+idSupplier);
        System.out.println("Nama Supplier : "+namaSupplier);
        System.out.println("Alamat Supplier : "+alamat);
        System.out.println("Kontak : "+kontak);
    }


    public static void main(String[] args){
        Supplier spl = new Supplier(1,"PT. Rama Sinta","Jl. Geget Winda", "021-383838");
        spl.printSupplier();
    }
}
