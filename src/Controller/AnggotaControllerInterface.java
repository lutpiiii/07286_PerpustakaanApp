package Controller;
import Entity.AnggotaEntity;
import java.util.ArrayList;

public interface AnggotaControllerInterface {
  void insertAnggota(String nama, String password, String noTelp, String alamat);  
  int login(String nama, String password);
  ArrayList<AnggotaEntity> showAllData();
  AnggotaEntity getByDataId(int id);
  void updateAkun(int pilihan, String data, int id);
}
