package Controller;
import Entity.AnggotaEntity;
import Entity.BukuEntity;
import Entity.PeminjamanEntity;
import java.util.ArrayList;

public interface PeminjamanControllerInterface {
   void insertPeminjaman(BukuEntity buku, AnggotaEntity anggota);
   void verifPengembalian(String idPeminjaman);
   ArrayList<PeminjamanEntity> showAllData();
   ArrayList<PeminjamanEntity> showDataByPeminjam(int id);
}
