package Model07286;

import Entity07286.PeminjamanEntity07286;
import Helper07286.KoneksiDb07286;
import java.sql.Connection;
import java.util.ArrayList;

public interface PeminjamanModelInterface {
    Connection conn = KoneksiDb07286.getConnection();
    
    void add(PeminjamanEntity07286 peminjaman);
    void verifpengemalian(String idPeminjaman);
    ArrayList<PeminjamanEntity07286> getAll();
    ArrayList<PeminjamanEntity07286> getByPeminjam(int id);
}
