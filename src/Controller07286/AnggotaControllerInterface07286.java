package Controller07286;

import Entity07286.AnggotaEntity07286;
import java.util.ArrayList;

public interface AnggotaControllerInterface07286 {
    void inserAnggota(String nama, String password, String noTelp, String alamat);
    int login(String nama, String password);
    ArrayList<AnggotaEntity07286> showAllData();
    AnggotaEntity07286 getData(int id);
    void updateAku(int pilihan, String data, int id);
    
}
