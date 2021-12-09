package Model07286;

import Entity07286.BukuEntity07286;
import Helper07286.KoneksiDb07286;
import java.sql.Connection;
import java.util.ArrayList;

public interface BukuModelInterface07286 {
    Connection conn = KoneksiDb07286.getConnection();
    
    void add(BukuEntity07286 buku);
    void updateJudul(String isbn, String judul);
    void updatePenerbit(String isbn, String penerbit);
    void delete(String isbn);
    ArrayList<BukuEntity07286> getAll();
    BukuEntity07286 getById(String isbn);
}
