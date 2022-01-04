package Controller;

import Entity.AnggotaEntity;
import Entity.BukuEntity;
import Entity.PeminjamanEntity;
import java.util.ArrayList;

public class PeminjamanControllerInterfaceimpl implements PeminjamanControllerInterface{
    @Override
    public void insertPeminjaman(BukuEntity buku, AnggotaEntity anggota) {
        AllObjectModel.peminjamanModel.add(new PeminjamanEntity(buku,anggota));
    }
    @Override
    public void verifPengembalian(String idPeminjaman) {
        AllObjectModel.peminjamanModel.verifPengembalian(idPeminjaman);
    }
    @Override
    public ArrayList<PeminjamanEntity> showAllData() {
        return AllObjectModel.peminjamanModel.getAll();
    }
    @Override
    public ArrayList<PeminjamanEntity> showDataByPeminjam(int id) {
        return AllObjectModel.peminjamanModel.getByPeminjam(id);
    }   
}
