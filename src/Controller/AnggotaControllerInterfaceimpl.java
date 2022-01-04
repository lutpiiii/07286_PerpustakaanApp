package Controller;
import Entity.AnggotaEntity;
import java.util.ArrayList;


public class AnggotaControllerInterfaceimpl implements AnggotaControllerInterface{
    @Override
    public void insertAnggota(String nama, String password, String noTelp, String alamat) {
        AnggotaEntity anggota = new AnggotaEntity(nama, password, noTelp, alamat);
        AllObjectModel.anggotaModel.add(anggota);
    }
    @Override
    public int login(String nama, String password) {
      return AllObjectModel.anggotaModel.login(nama,password);  
    }
    @Override
    public ArrayList<AnggotaEntity> showAllData() {
      return AllObjectModel.anggotaModel.getAll();
    }
    @Override
    public AnggotaEntity getByDataId(int id) {
      return AllObjectModel.anggotaModel.getById(id);
    }
    @Override
    public void updateAkun(int pilihan, String data, int id) {
        if (pilihan == 1){
            AllObjectModel.anggotaModel.updatePassword(data, id);
        }else if (pilihan == 2){
            AllObjectModel.anggotaModel.updateAlamat(data, id);
        }else if (pilihan == 3){
            AllObjectModel.anggotaModel.updateNoTelp(data, id);
        }
    }   
}
