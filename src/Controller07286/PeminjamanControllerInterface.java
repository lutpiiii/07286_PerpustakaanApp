package Controller07286;

import Entity07286.AnggotaEntity07286;
import Entity07286.BukuEntity07286;
import Entity07286.PeminjamanEntity07286;
import java.util.ArrayList;

public interface PeminjamanControllerInterface {
    void insertPinjaman(BukuEntity07286 buku, AnggotaEntity07286 anggota);
    void verifPengembalian(String idPeminjaman);
    ArrayList<PeminjamanEntity07286> showAll();
    ArrayList<PeminjamanEntity07286> showDataPinjam(int id);
}
