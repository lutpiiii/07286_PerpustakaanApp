package Model;
import Entity.BukuEntity;
import Helper.DbUtil;
import java.sql.Connection;
import java.util.ArrayList;

public interface BukuModelInterface {
    Connection conn = DbUtil.getConnection();
    void add(BukuEntity buku);
    void updateJudul(String isbn, String judul);
    void updatePenerbit(String isbn, String penerbit);
    void delete(String isbn);
    ArrayList<BukuEntity> getAll();
    BukuEntity getById(String isbn);
}
