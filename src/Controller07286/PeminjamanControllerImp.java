package Controller07286;

import Entity07286.AnggotaEntity07286;
import Entity07286.BukuEntity07286;
import Entity07286.PeminjamanEntity07286;
import java.util.ArrayList;

public class PeminjamanControllerImp implements PeminjamanControllerInterface{

    @Override
    public void insertPinjaman(BukuEntity07286 buku, AnggotaEntity07286 anggota) {
        AllObjectModel07286.peminjamanModel.add(new PeminjamanEntity07286(buku, anggota));
    }

    @Override
    public void verifPengembalian(String idPeminjaman) {
        AllObjectModel07286.peminjamanModel.verifpengemalian(idPeminjaman);
    }

    @Override
    public ArrayList<PeminjamanEntity07286> showAllData() {
        return AllObjectModel07286.peminjamanModel.getAll();
    }

    @Override
    public ArrayList<PeminjamanEntity07286> showDataByPinjam(int id) {
        return AllObjectModel07286.peminjamanModel.getByPeminjam(id);
    }
    
}
