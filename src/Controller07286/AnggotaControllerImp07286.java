package Controller07286;

import Entity07286.AnggotaEntity07286;
import java.util.ArrayList;

public class AnggotaControllerImp07286 implements AnggotaControllerInterface07286{

    @Override
    public void inserAnggota(String nama, String password, String noTelp, String alamat) {
        AnggotaEntity07286 anggota = new AnggotaEntity07286(nama, password, noTelp, alamat);
        AllObjectModel07286.anggotaModel.add(anggota);
    }

    @Override
    public int login(String nama, String password) {
        return AllObjectModel07286.anggotaModel.login(nama, password);
    }

    @Override
    public ArrayList<AnggotaEntity07286> showAllData() {
        return AllObjectModel07286.anggotaModel.getAll();
    }

    @Override
    public void updateAku(int pilihan, String data, int id) {
        if(pilihan == 1){
            AllObjectModel07286.anggotaModel.updatePassword(data, id);
        }else if(pilihan == 2){
            AllObjectModel07286.anggotaModel.updateAlamat(data, id);
        }else if(pilihan == 3){
            AllObjectModel07286.anggotaModel.updateNoTelp(data, id);
        }
    }

    @Override
    public AnggotaEntity07286 getData(int id) {
        return AllObjectModel07286.anggotaModel.getById(id);
    }
    
}
