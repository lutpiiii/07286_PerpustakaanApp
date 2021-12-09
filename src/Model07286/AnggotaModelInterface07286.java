package Model07286;

import Entity07286.AnggotaEntity07286;
import Helper07286.KoneksiDb07286;
import java.sql.*;
import java.util.ArrayList;

public interface AnggotaModelInterface07286 {
    Connection conn = KoneksiDb07286.getConnection();
    
    void add(AnggotaEntity07286 anggota);
    void remove(int id);
    int login(String nama, String password);
    ArrayList<AnggotaEntity07286> getAll();
    AnggotaEntity07286 getById(int id);
    void resetPassword(int id);
    void updateNoTelp(String noTelp, int id);
    void updateAlamat(String alamat, int id);
    void updatePassword(String password, int id);
}
