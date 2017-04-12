import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by fakhriabdullah on 12/04/2017.
 */
public class Gudang {
    private HashMap<Integer, Barang> barangGudang = new HashMap<>();

    public void addBarang(Barang b)
    {
        barangGudang.put(b.getIdBarang(),b);
    }

    public Barang cariBarang(int idBarang)
    {
        return barangGudang.get(idBarang);
    }

    public void isiGudang()//untuk data dummy mengisi gudang
    {
        addBarang(new Barang(1, "Indomie", 2500, 2000, "2 Juni 2018", 20));
        addBarang(new Barang(2, "Clear", 2500, 2000, "2 Juni 2018", 30));
        addBarang(new Barang(2, "Gatsby", 20000, 9000, "2 Juni 2018", 15));
    }
}
