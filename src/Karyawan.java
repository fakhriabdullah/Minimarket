/**
 * Created by fakhriabdullah on 11/04/2017.
 */
public class Karyawan {
    int idKaryawan;
    String namaKaryawan;
    String alamat;
    String kontak;

    public Karyawan(int idKaryawan, String namaKaryawan, String alamat, String kontak) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.alamat = alamat;
        this.kontak = kontak;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKontak() {
        return kontak;
    }

}
