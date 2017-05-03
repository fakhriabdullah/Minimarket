import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Handoko on 5/2/2017.
 */
public class TransaksiPenjualan {
    int idTransaksiPenjualan;
    int total, tunai;
    Karyawan kasir;
    Date waktuPenjualan;

    ArrayList<Penjualan> arrPenjualan = new ArrayList<>();

    public void addPenjualan(Penjualan p) {
        arrPenjualan.add(p);
    }

    public TransaksiPenjualan(int idTransaksiPenjualan,Karyawan kasir) {
        this.idTransaksiPenjualan=idTransaksiPenjualan;
        this.kasir=kasir;
    }

    public int hitungTotalPenjualan() {
        int totalPenjualan = 0;
        for (Penjualan p : arrPenjualan) {
            totalPenjualan = totalPenjualan + (p.getJumlah() * p.getHargaJual());
        }
        return totalPenjualan;
    }

    public int hitungKembalianPenjualan() {
        int kembalian = 0;
        kembalian = tunai - hitungTotalPenjualan();
        return kembalian;
    }

    public void setTunai(int tunai) {
        this.tunai = tunai;
    }

    public void setWaktuPenjualan(Date waktuPenjualan) {
        this.waktuPenjualan = waktuPenjualan;
    }

    public void printPenjualan() {
        for (Penjualan p : arrPenjualan) {
            System.out.println("Nama Karyawan : " + kasir.namaKaryawan);
            System.out.println("Tanggal : " + waktuPenjualan);
            System.out.println("Total Penjualan : " + hitungTotalPenjualan());
            System.out.println("Tunai : " + tunai);
            System.out.println("Kembalian : " + hitungKembalianPenjualan());
        }
    }

    public static void main(String[] args) {
//        Karyawan kasir = new Karyawan(1, "Budi", "Gerlong", "0888811212");
//        TransaksiPenjualan transP = new TransaksiPenjualan(kasir);
////        Penjualan p = new Penjualan("Rinso", 25000);
//        transP.setTunai(50000);
//        Date date = new Date();
//        transP.setWaktuPembelian(date);
//        p.setJumlah(1);
//        transP.addPenjualan(p);
//        transP.printPenjualan();
    }
}
